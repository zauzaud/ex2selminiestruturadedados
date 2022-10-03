import java.io.*;

public class Calculadora_PosFixa {  // calculadora 
	
	
      public static void main(String[] args) throws IOException  { //  IOE para input ou output error 
          PilhaSE p = new PilhaSE();
          int arg1, arg2;    
          char c;
          System.out.println("Calculadora notação pos-fixa");
          System.out.println("   Exemplo de uso:\n   5 9 + 2 * 6 5 * + ");
          System.out.print("Informe sua expressao:\n   ");
          String s = lerStr();
          for (int i=0; i<s.length(); i++) {
              c = s.charAt(i);
              if (Character.isDigit(c))
                  p.push(Character.digit(c,10));
              else if(c=='+') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1+arg2);
              }
              else if(c=='*') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1*arg2);
              }
              else if(c=='-') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1-arg2);
              }
              else if(c=='/') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push(arg1/arg2);
              }
              else if(c=='^') {
                  arg1 = p.top(); p.pop();
                  arg2 = p.top(); p.pop();
                  p.push((int) Math.pow(arg1,arg2));
              }
          }
          System.out.println("Resposta = " + p.top());
          p.pop();
      }  
      public static String lerStr() throws IOException { // metodo para ler a string
        InputStreamReader teclado = new InputStreamReader(System.in); // utilizando system.in, inputstreamreader e buffered reader para system.in 
        BufferedReader reader = new BufferedReader(teclado);
        String s = reader.readLine(); // ler a linha 
        return s;
      }
}