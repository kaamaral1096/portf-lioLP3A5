public class Produtor extends Thread {
	Numero numero;

	//construtor que vai receber numero
	Produtor(Numero numero) {
		this.numero = numero;
	}
	//Produtor deve 'produzir' o numero. Aqui, fazemos isso com o for.
	@Override
	public void run() {
			for(int k= 0; k<10; k++) {
				numero.produzir(this.getName(), k);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
	}
}
