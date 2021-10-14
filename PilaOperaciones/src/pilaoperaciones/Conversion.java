/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaoperaciones;

import java.sql.Array;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Angel
 */
public class Conversion {

    Scanner l = new Scanner(System.in);

    Stack< String> PilaEntrada = new Stack< String>(); //Pila entrada
    Stack< String> Operadores = new Stack< String>(); //Pila temporal para operadores
    Stack< String> Salida = new Stack< String>(); //Pila salida

    String datos;

    public Conversion() {
        ingresoDatos();
        infijoPrefijo();
        imprimir();
    }

    public void ingresoDatos() {
        System.out.println("Ingrese la expresion");
        datos =l.nextLine();

    }

    public void infijoPrefijo() {
        String[] arrayInfix = datos.split(" ");
        for (int i = arrayInfix.length - 1; i >= 0; i--) {
            PilaEntrada.push(arrayInfix[i]);
            System.out.println(arrayInfix[i]);
        }

        for (int i = 0; i < arrayInfix.length; i++) {

            if (arrayInfix[i] != "+" || arrayInfix[i] != "-" || arrayInfix[i] != "/" || arrayInfix[i] != "*") {
                Salida.push(arrayInfix[i]);
            } else {
                if (arrayInfix[i] == "-") {

                    if (Salida.peek() != arrayInfix[i]) {
                        Operadores.push(arrayInfix[i]);
                        System.out.println(arrayInfix[i]);
                    } else {
                        Salida.push(Operadores.peek());
                        Salida.push(arrayInfix[i]);
                        System.out.println(arrayInfix[i]);
                    }

                }
                if (arrayInfix[i] == "*") {

                    if (Salida.peek() != arrayInfix[i]) {
                        Operadores.push(arrayInfix[i]);
                        System.out.println(arrayInfix[i]);
                    } else {
                        Salida.push(Operadores.peek());
                        Salida.push(arrayInfix[i]);
                        System.out.println(arrayInfix[i]);
                    }
                }
                if (arrayInfix[i] == "/") {

                    if (Salida.peek() != arrayInfix[i]) {
                        Operadores.push(arrayInfix[i]);
                        System.out.println(arrayInfix[i]);
                    } else {
                        Salida.push(Operadores.peek());
                        Salida.push(arrayInfix[i]);
                        System.out.println(arrayInfix[i]);
                    }
                }
            }

        }
        
        for (int i = 0; i < arrayInfix.length; i++) {
            int n=Integer.parseInt(arrayInfix[i]);
            System.out.println("Resultado: "+n);
            
        }
        
        
    }
    

    public void imprimir() {
        System.out.println(PilaEntrada);
        System.out.println(Salida);
        System.out.println(Operadores);
    }

}
