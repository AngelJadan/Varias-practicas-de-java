/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class Horario {

    private int codigo;
    private List<Dia> dia;
    private Empresa empresa;

    public Horario() {
    }

    public Horario(int codigo, List<Dia> dia, Empresa empresa) {
        this.codigo = codigo;
        this.dia = dia;
        this.empresa = empresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Dia> getDia() {
        return dia;
    }

    public void setDia(List<Dia> dia) {
        this.dia = dia;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String sumaHoraDiaria(String horaEntrada, String horaSalida) throws ParseException {

        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.00", separadoresPersonalizados);

        String[] entrada = horaEntrada.split(":");
        String[] salida = horaSalida.split(":");

        int hEntrada = Integer.parseInt(entrada[0]);
        int mEntrada = Integer.parseInt(entrada[1]) / 100;

        System.out.println("0." + mEntrada);

        //Minuto de entrada transformado a decimal
        int dmEntrada = mEntrada * 60 / 100;

        int hSalida = Integer.parseInt(salida[0]);
        int mSalida = Integer.parseInt(salida[1]);

        //Minuto de salida transformado a decimal
        int dmSalida = mSalida * 60 / 100;

        String dhEntrada = hEntrada + "." + dmEntrada;
        String dhSalida = hSalida + "." + dmSalida;

        double horaTotal = Double.parseDouble(dhSalida) - Double.parseDouble(dhEntrada);

        System.out.println(horaTotal);

        String horaTrabajada = String.valueOf(horaTotal);

        System.out.println(horaTrabajada);

        String total[] = horaTrabajada.split(".");

        double tMinuto = Double.parseDouble(total[1]) * 60 / 100;
        String horaDiaria = total[0] + formato.format(tMinuto);

        return horaDiaria;
    }

    /**
     *
     * @param hora recibe la hora
     * @return decimal este numero ya esta transfomado a decimal sobre 100 de 60
     * minutos
     */
    public double horaDecimal(String hora) {
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.00", separadoresPersonalizados);

        String arrHora[] = hora.split(":");

        String hor = arrHora[0];
        int horaDecimal = Integer.parseInt(hor);

        String minuto = "0." + arrHora[1];

        Double minutoDou = Double.parseDouble(minuto);

        String minutoDecial = formato.format(((minutoDou) / 60) * 100);

        String texto = String.valueOf(minutoDecial.replace(".", ""));

        String numeroString = arrHora[0] + "." + texto;
        double decimal = Double.parseDouble(numeroString);

        return decimal;

    }

    /**
     *
     * @param numero Numero entero
     * @return Retorna un horario de 60 minutos
     */
    public String decimalToHora(double numero) {

        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.00", separadoresPersonalizados);

        String texto = String.valueOf(numero).replace(".", ":");
        String[] arreglo = texto.split(":");

        double minutos = Double.parseDouble("0." + arreglo[1]);

        double calculo = minutos / 100 * 60;

        double total = Double.parseDouble(arreglo[0]) + calculo;

        String hora = (String.valueOf(total)).replace(".", ":");
        return hora;
    }
}
