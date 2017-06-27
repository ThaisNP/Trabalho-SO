package threads;

public class Armazem {
	private int numero;
	private boolean disponivel = false;
	
	public synchronized void armazenarNumero (int num) {
		
		while (disponivel) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				
			}	
		}
		
		this.numero = num;
		disponivel = true;
		notifyAll();
		System.out.println("Contador: " + num);
	}
	
	public synchronized void lerNumero(){
		
		while (!disponivel) {
			try {
				wait();
				
			} catch (InterruptedException e){
				
			}
		}
		
		disponivel = false;
		notifyAll();
		System.out.println("Impressora: " + this.numero);
	}
	
}
