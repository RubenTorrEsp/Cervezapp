package seccionCritica;

public class Camarero implements Runnable{
	
	private int cervezas = 0;
	
	/**
	 * Constructor vacío
	 */
	public Camarero() {
	}
	
	
	/**
	 * Añade una cangreburger a la bandeja y lo notifica por pantalla
	 * @param numCocinero
	 */
	public synchronized void servirCerveza(int idCliente) {
		cervezas++;
		notify();
	}


	@Override
	public void run() {
        while(Boolean.TRUE){
            System.out.println("El productor " + idproductor + " pone: " + poner);
            try
            {
                Thread.sleep(TIEMPOESPERA);
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Productor " + idproductor + ": Error en run -> " + e.getMessage());
            }
        }
		
	}
	
	
	
}
