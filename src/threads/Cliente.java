package threads;

import seccionCritica.Camarero;

public class Cliente implements Runnable {

	private Camarero camarero;
	private int idCliente;
    private int espera;
	
	public Cliente(Camarero camarero, int idCliente) {
		this.camarero = camarero;
		this.idCliente = idCliente;
		this.espera = 0;
	}
	
	
    public void run() {
        while(true){
            camarero.servirCerveza(idCliente);
            try{
            	espera = (int) Math.random()*3000+1000;
                Thread.sleep(espera);
            }
            catch (InterruptedException e) { 
            }
        }
    }


	public void start() {
		// TODO Auto-generated method stub
		
	}
}

