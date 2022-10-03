
public class Calculadora {   // class calculadora c 2 atributos
	
	int item;
	Calculadora ant;

}

class PilhaSE { 
	private Calculadora topo;
	public void PilhaSe() { 
		topo = null;
	}
	public boolean vazio() {
		return (topo == null);
		
	}
	public int top() { 
		return topo.item;
	}
	public void pop() { 
		if(!vazio()) topo = topo.ant;
	}
	public void push(int valor) {
		Calculadora novo = new Calculadora();
		novo.item = valor;
		novo.ant = topo;
		topo = novo;
		
	}
}