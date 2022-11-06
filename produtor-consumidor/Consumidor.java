public class Consumidor extends Thread {
    Numero numero;

    Consumidor(Numero numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int k = 0; k < 10; k++) {
            this.numero.consumir(this.getName());
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
