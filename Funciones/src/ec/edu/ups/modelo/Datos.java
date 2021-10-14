/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class Datos {
    private int n;
    private double a;
    private double b;
    private double c;
    private double fa;
    private double fb;
    private double fc;
    private double error;
    
    public Datos() {
    }

    public Datos(int n, double a, double b, double c, double fa, double fb, double fc, double error) {
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
        this.fa = fa;
        this.fb = fb;
        this.fc = fc;
        this.error = error;
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getFa() {
        return fa;
    }

    public void setFa(double fa) {
        this.fa = fa;
    }

    public double getFb() {
        return fb;
    }

    public void setFb(double fb) {
        this.fb = fb;
    }

    public double getFc() {
        return fc;
    }

    public void setFc(double fc) {
        this.fc = fc;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
   
    @Override
    public String toString() {
        return "Datos{" + "n=" + n + ", a=" + a + ", b=" + b + ", c=" + c + ", fa=" + fa + ", fb=" + fb + ", fc=" + fc + ", error=" + error + '}';
    } 
    
    
}
