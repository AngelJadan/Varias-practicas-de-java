/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Recursivo {

    Scanner l;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;

    int c4 = 0;
    int c5 = 0;
    int c6 = 0;

    public Recursivo() {
        l = new Scanner(System.in);
    }

    public void ingdatos() {

        System.out.println("Suma de numeros");
        int n = l.nextInt();
        sumanumeros(n);
        int s = c1 + c2 + c3;
        System.out.println("Resultado suma: " + s);

        System.out.println("Inversion de datos");
        System.out.println("Numero Invertido = " + invertir(n, 0));

        System.out.println("Decimal a binario");
        binario(n);
        System.out.println("");

        System.out.println("Matriz");
        matriz(1, 1);

    }

    public void sumanumeros(int numero) {

        if (numero >= 1) {

            if (numero >= 10) {

                if (numero >= 100) {
                    int n3 = numero - 100;
                    c1++;
                    sumanumeros(n3);
                } else {
                    int n2 = numero - 10;
                    c2++;
                    sumanumeros(n2);
                }

            } else {

                int n = numero - 1;
                c3++;
                sumanumeros(n);
            }
        }

    }

    //Metodo para pasar de entero a binario
    public int binario(int numero) {

        if (numero >= 2) {//Comparamos si el nimero es mayor o igual a 2
            int v = numero / 2; //Creamos una variable temporal en la que guardamos el resultado de la division del numero para 2
            int d = numero % 2;//Aqui sacamos el modulo del numero que sera un numero del binario
            binario(v);//Asignamos nuevamente la varia temporalque habiamos creado como parametro que sera el nuevo numero binario
            System.out.print(d);//Imprimimos el modulo que calculamos
        }
        return numero;//Si el numero numero asiganado al parametro es menor a cero hacemos que devuelva el numero y terminara el metodo
    }

    public int invertir(int n, int m) {
        int invertido;
        if (n == 0) {
            invertido = m;
        } else {
            invertido = invertir(n / 10, m * 10 + n % 10);
        }
        return invertido;
    }

    int cf = 0;
    int cc = 1;

    public void matriz(int i, int j) {

        if (i <= 5) {

            if (j <= 5) {

                if (i == j) {
                    System.out.print(cf + cc);
                    matriz(i + 1, j + 1);

                    if (i < j) {
                        System.out.print(cf);
                        cc++;
                        matriz(i + 1, j + 1);

                    }

                    if (i > j) {
                        System.out.print(cf);
                        matriz(i + 1, j + 1);
                    }
                }

            }
            System.out.println(cc);
        }

    }
}
