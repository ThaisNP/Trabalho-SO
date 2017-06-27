package threads;

public class Impressora implements Runnable{
	private Armazem armazem;
	
	public Impressora(Armazem armazem) {
		this.armazem = armazem;
	}

	public void imprimirNumero(){
		
		for (int i = 0; i <= 10; i++){
			armazem.lerNumero();
		}
	}

	@Override
	public void run() {
		imprimirNumero();		
	}

}
