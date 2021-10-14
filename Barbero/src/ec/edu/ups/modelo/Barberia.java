package ec.edu.ups.modelo;

import java.util.Random;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Barberia {

    private Semaphore[] sillasDeEspera;
    private Barbero barbero;
    private Silla sillaDeBarberia;
    private int sillas;

    public Barberia(Barbero barbero, int sillas) {
        this.barbero = barbero;
        this.sillas = sillas;
    
    

   
        
        
        inicializar();
        
    }

    public int getSillas() {
        return sillas;
    }
    

    public void inicializar() {
        
        
        sillasDeEspera = new Semaphore[sillas];
        for (int i = 0; i < sillasDeEspera.length; i++) {
            sillasDeEspera[i] = new Semaphore(1);
        }
       
      
        sillaDeBarberia = new Silla(false);

   
        barbero = new Barbero(this);
        barbero.setDormido(true);
    }

    public boolean hayClienteNuevo() {
        Random ran = new Random();
        return ran.nextBoolean();
    }

    public void llegaCliente() {

       
        if (getBarbero().isDormido() == true) {
            getBarbero().setDormido(false);
            getSillaDeBarberia().setOcupada(true);
        } else {
            if (haySillasDeEsperaDisponibles() == true) {
                ocuparSillaEspera();
            }

        }

    }

    public boolean sillasDeEsperaVacias() {
        for (int i = 0; i < getSillasDeEspera().length; i++) {
            if (getSillasDeEspera()[i].availablePermits() == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean haySillasDeEsperaDisponibles() {
        for (int i = 0; i < getSillasDeEspera().length; i++) {
            if (getSillasDeEspera()[i].availablePermits() == 1) {
                return true;
            }
        }
        return false;
    }

    public void ocuparSillaEspera() {
        for (int i = 0; i < getSillasDeEspera().length; i++) {
            if (getSillasDeEspera()[i].availablePermits() == 1) {
                getSillasDeEspera()[i].tryAcquire();
                return;
            }
        }
    }

    public void desocuparSillaEspera() {
        for (int i = getSillasDeEspera().length - 1; i >= 0; i--) {
            if (getSillasDeEspera()[i].availablePermits() == 0) {
                getSillasDeEspera()[i].release();
                return;
            }
        }
    }

    public Semaphore[] getSillasDeEspera() {
        return sillasDeEspera;
    }

    public void setSillasDeEspera(Semaphore[] sillasDeEspera) {
        this.sillasDeEspera = sillasDeEspera;
    }

    

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }

    public Silla getSillaDeBarberia() {
        return sillaDeBarberia;
    }

    public void setSillaDeBarberia(Silla sillaDeBarberia) {
        this.sillaDeBarberia = sillaDeBarberia;
    }

}
