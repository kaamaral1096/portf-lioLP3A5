//Código baseado na vídeo aula: https://www.youtube.com/watch?v=uBkUpRI0fXU

public class Teste {
	public static void main(String[] args) {
		Numero numero = new Numero(0);
		Produtor produtor = new Produtor(numero);
		Consumidor consumidor = new Consumidor(numero);
		Consumidor consumidor1 = new Consumidor(numero);
		Consumidor consumidor2 = new Consumidor(numero);
				
		produtor.start();
		consumidor.start();
		consumidor1.start();
		consumidor2.start();

	}

}
