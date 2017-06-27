package threads;

public class Contador implements Runnable{
	private Armazem armazem;
	
	public Contador(Armazem armazem) {
		this.armazem = armazem;
	}

	public void fazerContagem () {

		
		for (int i=0; i <= 10; i++) {
			armazem.armazenarNumero(i);
		}
	}

	@Override
	public void run() {
		fazerContagem();
	}

}
