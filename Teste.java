package threads;

public class Teste {

	public static void main(String[] args) {
		Armazem armazem = new Armazem();
		
		Contador contador = new Contador(armazem);
		Thread threadContador = new Thread(contador);
		
		Impressora impressora = new Impressora(armazem);
		Thread threadImpressora = new Thread(impressora);
		
		threadContador.start();
		threadImpressora.start();
	}

}
