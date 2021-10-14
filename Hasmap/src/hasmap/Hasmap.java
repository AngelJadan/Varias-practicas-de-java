/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Angel
 */
public class Hasmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<Integer, String> mapa = new HashMap();
        
        mapa.put(1, "Juan");
        mapa.put(2, "pjadlfs");
        
        
        Iterator it=mapa.keySet().iterator();//Obtenemos el valor de la llave
        while (it.hasNext()) {
            int key = (Integer)it.next();
            
            String valor=mapa.get(key);
            System.out.println("Llave: "+key+" Valor: "+valor);
            
        }
    }
    
}
