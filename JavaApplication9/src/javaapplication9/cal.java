/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Angel
 */
public class cal {

    public cal(){
        
    }


    int c=1;
    public void fac(int n){
        if (n>0) {
            c=c*(n);
        }
        System.out.println("factorial "+c);
        fac(n-1);
    }
        
}
