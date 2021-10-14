/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Angel
 */
public class Principal {

    //public static void main(String args[]) {
        //hilo h = new hilo();
        //h.run();
        //h.hilo();
/*
        Persona per = new Persona();
        ControladorPersona cper=new ControladorPersona();
        
        per.setNombre("Juan");
        per.setEdad(80);
        cper.crear(per);
        
        Persona per1 = new Persona();
        per1.setNombre("Andres");
        per1.setEdad(12);
        cper.crear(per1);

        Persona per2 = new Persona();
        per2.setNombre("Marcelo");
        per2.setEdad(23);
        cper.crear(per2);
        
        Collections.sort(cper.getLista());
        
        for (Persona perso : cper.getLista()) {
            System.out.println(perso.getNombre()+" "+perso.getEdad());
        }*/
        /*
        List<Persona> lista = new ArrayList<>();
        
        Persona per4 = new Persona();
        per4.setNombre("Pedro");
        per4.setEdad(80);
        lista.add(per4);
        
        
        Persona per0 = new Persona();
        per0.setNombre("Mario");
        per0.setEdad(50);
        lista.add(per0);

        Persona per = new Persona();
        per.setNombre("Juan");
        per.setEdad(25);
        lista.add(per);

        Persona per1 = new Persona();
        per1.setNombre("Andres");
        per1.setEdad(20);
        lista.add(per1);

        Persona per2 = new Persona();
        per2.setNombre("Sandro");
        per2.setEdad(30);
        lista.add(per2);

        Persona lper=new Persona();
        Arrays.sort(lper.lista.toArray());
        
        per2.imprimeArrayPersonas(lista);
        
         */
 /*
        int num[]={9,2,6,10,3,2,1};
        System.out.println("9,2,6,3,2");
        
        num[0]=9;
        num[1]=2;
        num[2]=6;
        num[3]=3;
        num[4]=2;
        
        int i=0;
        int aux=0;
        
        while (i<num.length) {  
            if ((i-1)>=0) {
                
                
                while ((i-1)>-1&&num[i]<num[i-1]) {
                    aux=num[i];
                    num[i]=num[i-1];
                    num[i-1]=aux;
                    i=i-1;
                }
                
            }
            
            i++;
        }
        
        for (int j = 0; j < num.length; j++) {
            int k = num[j];
            System.out.print(k);
            
        }
         */
//    }

}

class Persona implements Comparable<Persona>{

    private String nombre;
    private int edad;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        int edadc=o.getEdad();
        return this.edad-edadc;
    }

}

class ControladorPersona {

    private List<Persona> lista = new ArrayList<Persona>();

    public ControladorPersona() {
    }

    public void crear(Persona p) {
        lista.add(p);
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
}
/*
class hilo implements Runnable {

    private int i;
    public hilo() {
    }
    
    public void hilo(){
        run();
        int r=getI();
        System.out.println(r);
        if (r==2)setI(1);
        System.out.println(r);
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
    

    @Override
    public void run() {
        int num= 1;
        while (true) {
            try {
                
               //if(i>60)i=1; 
                System.out.println("Segundos "+num);
                num++;
                setI(num);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }

    }

}*/
