package ec.edu.ups.modelo;

import javax.swing.JTextArea;
import vista.PanelPrincipal;
import vista.VentanaPrincipal;


public class Barbero extends Thread {

	private Barberia barberia;

	public boolean dormido;
	
	private int contador =1;
        private JTextArea area;

	public Barbero(Barberia barberia ) {
		this.barberia = barberia;
               
	}

  
    


	public boolean isDormido() {
		return dormido;
	}

	public void setDormido(boolean dormido) {
		this.dormido = dormido;
	}

	public void run() {
		while (true) {

			if (isDormido() == false) {
				if (barberia.getSillaDeBarberia().isOcupada() == true) {
					
					
					if(barberia.sillasDeEsperaVacias()==true){
						barberia.getSillaDeBarberia().setOcupada(false);
						setDormido(true);
						
					
					}else{
						barberia.desocuparSillaEspera();
					}
					
			
					System.out.println("Atendí al cliente numero :"+contador);
                                                                                        
					contador++;

					
				} 
			}
			try {

				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


}
