/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import com.modelo.Empresa;
import com.modelo.Horario;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class VistaHorario extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaHorario
     */
    private Empresa empresa;
    private String jornada;
    private int dActivos;

    public VistaHorario(Empresa empresa, String jornada) {
        initComponents();
        this.empresa = empresa;
        this.jornada = jornada;

        lbljornada.setText(jornada);
        lblempresa.setText(empresa.getRazonSocial());
        inHabiHorPar();
        llenarHoras();
        cboxl1.setEnabled(false);

        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.00", separadoresPersonalizados);
    }

    /**
     * Metodo para sumar la jornada matutina.
     */
    private void sumarHora1() {
        Horario hor = new Horario();
        double totall1 = 0.00;
        double totalma1 = 0.00;
        double totalmi1 = 0.00;
        double totalj1 = 0.00;
        double totalv1 = 0.00;
        double totals = 0.00;
        double totald = 0.00;

        String hEnt = "";
        String mEnt = "";
        String ent = "";
        double entra = 0.00;

        String hSal = "";
        String mSal = "";
        String sal = "";
        double sale = 0.00;

        if (jcheckl.isSelected()) {
            hEnt = cboxl1.getSelectedItem().toString();
            mEnt = cboxl2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxl3.getSelectedItem().toString();
            mSal = cboxl4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            totall1 = sale - entra;
            lbllunestotal.setText(hor.decimalToHora(totall1));

        }
        if (jcheckma.isSelected()) {
            hEnt = cboxma1.getSelectedItem().toString();
            mEnt = cboxma2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxma3.getSelectedItem().toString();
            mSal = cboxma4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            totalma1 = sale - entra;
            lblmatotal.setText(hor.decimalToHora(totalma1));
        }
        if (jcheckmi.isSelected()) {
            hEnt = cboxmi1.getSelectedItem().toString();
            mEnt = cboxmi2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxmi3.getSelectedItem().toString();
            mSal = cboxmi4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            totalmi1 = sale - entra;
            lblmitotal.setText(hor.decimalToHora(totalmi1));
        }
        if (jcheckj.isSelected()) {
            hEnt = cboxj1.getSelectedItem().toString();
            mEnt = cboxj2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxj3.getSelectedItem().toString();
            mSal = cboxj4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            totalj1 = sale - entra;
            lbljuetotal.setText(hor.decimalToHora(totalj1));
        }
        if (jcheckv.isSelected()) {
            hEnt = cboxvi1.getSelectedItem().toString();
            mEnt = cboxvi2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxvi3.getSelectedItem().toString();
            mSal = cboxvi4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            totalv1 = sale - entra;
            lblvietotal.setText(hor.decimalToHora(totalv1));
        }
        if (jchecks.isSelected()) {
            hEnt = cboxsa1.getSelectedItem().toString();
            mEnt = cboxsa2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxsa3.getSelectedItem().toString();
            mSal = cboxsa4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            totals = sale - entra;
            lblsatotal.setText(hor.decimalToHora(totals));
        }
        if (jcheckd.isSelected()) {
            hEnt = cboxdom1.getSelectedItem().toString();
            mEnt = cboxdom2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxdom3.getSelectedItem().toString();
            mSal = cboxdom4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            totald = sale - entra;
            lbldomtotal.setText(hor.decimalToHora(totald));
        }
        System.out.println("l: " + totall1 + " ma: " + totalma1 + " mi: " + totalmi1 + " ju: " + totalj1 + " vi: " + totalv1 + " sa: " + totals + " do: " + totald);
        double tsemana = totall1 + totalma1 + totalmi1 + totalj1 + totalv1 + totals + totald;
        lblsemtotal.setText(hor.decimalToHora(tsemana));
    }

    /**
     * Metodo que realiza el calculo de numero de horas trabajadas la segunda
     * jornada.
     */
    private void sumarHora2() {
        Horario hor = new Horario();
        double totall1 = 0.00;
        double totalma1 = 0.00;
        double totalmi1 = 0.00;
        double totalj1 = 0.00;
        double totalv1 = 0.00;
        double totals = 0.00;
        double totald = 0.00;

        String hEnt = "";
        String mEnt = "";
        String ent = "";
        double entra = 0.00;

        String hSal = "";
        String mSal = "";
        String sal = "";
        double sale = 0.00;

        if (jcheckl.isSelected()) {
            hEnt = cboxls1.getSelectedItem().toString();
            mEnt = cboxls2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxls3.getSelectedItem().toString();
            mSal = cboxls4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            double jornada1 = hor.horaDecimal(lbllunestotal.getText());

            totall1 = (sale - entra) + jornada1;
            lbllunestotal.setText(hor.decimalToHora(totall1));

        }
        if (jcheckma.isSelected()) {
            hEnt = cboxma1.getSelectedItem().toString();
            mEnt = cboxma2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxma3.getSelectedItem().toString();
            mSal = cboxma4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            double jornada1 = hor.horaDecimal(lblmatotal.getText());

            totalma1 = (sale - entra) + jornada1;
            lblmatotal.setText(hor.decimalToHora(totalma1));
        }
        if (jcheckmi.isSelected()) {
            hEnt = cboxmi1.getSelectedItem().toString();
            mEnt = cboxmi2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxmi3.getSelectedItem().toString();
            mSal = cboxmi4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            double jornada1 = hor.horaDecimal(lblmitotal.getText());

            totalmi1 = (sale - entra) + jornada1;
            lblmitotal.setText(hor.decimalToHora(totalma1));
        }
        if (jcheckj.isSelected()) {
            hEnt = cboxj1.getSelectedItem().toString();
            mEnt = cboxj2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxj3.getSelectedItem().toString();
            mSal = cboxj4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            double jornada1 = hor.horaDecimal(lbljuetotal.getText());

            totalj1 = (sale - entra) + jornada1;
            lbljuetotal.setText(hor.decimalToHora(totalj1));
        }
        if (jcheckv.isSelected()) {
            hEnt = cboxvi1.getSelectedItem().toString();
            mEnt = cboxvi2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxvi3.getSelectedItem().toString();
            mSal = cboxvi4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            double jornada1 = hor.horaDecimal(lblvietotal.getText());

            totalv1 = (sale - entra) + jornada1;
            lblvietotal.setText(hor.decimalToHora(totalv1));
        }
        if (jchecks.isSelected()) {
            hEnt = cboxsa1.getSelectedItem().toString();
            mEnt = cboxsa2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxsa3.getSelectedItem().toString();
            mSal = cboxsa4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            double jornada1 = hor.horaDecimal(lblsatotal.getText());

            totals = (sale - entra) + jornada1;
            lblsatotal.setText(hor.decimalToHora(totals));
        }
        if (jcheckd.isSelected()) {
            hEnt = cboxdom1.getSelectedItem().toString();
            mEnt = cboxdom2.getSelectedItem().toString();
            ent = hEnt + ":" + mEnt;
            entra = hor.horaDecimal(ent);

            hSal = cboxdom3.getSelectedItem().toString();
            mSal = cboxdom4.getSelectedItem().toString();
            sal = hSal + ":" + mSal;
            sale = hor.horaDecimal(sal);

            double jornada1 = hor.horaDecimal(lbldomtotal.getText());

            totald = (sale - entra) + jornada1;
            lbldomtotal.setText(hor.decimalToHora(totald));
        }
        System.out.println("l: " + totall1 + " ma: " + totalma1 + " mi: " + totalmi1 + " ju: " + totalj1 + " vi: " + totalv1 + " sa: " + totals + " do: " + totald);
        double tsemana = totall1 + totalma1 + totalmi1 + totalj1 + totalv1 + totals + totald;
        lblsemtotal.setText(hor.decimalToHora(tsemana));
    }

    private void inHabiHorPar() {
        if (jornada == "Jornada Parcial") {
            lblentrada2.setVisible(false);
            lblsalida2.setVisible(false);
            lblh21.setVisible(false);
            lblm21.setVisible(false);
            lblh22.setVisible(false);
            lblm22.setVisible(false);
            jseparator.setVisible(false);
            cboxls1.setVisible(false);
            cboxls2.setVisible(false);
            cboxls3.setVisible(false);
            cboxls4.setVisible(false);
            cboxlmas1.setVisible(false);
            cboxlmas2.setVisible(false);
            cboxlmas3.setVisible(false);
            cboxlmas4.setVisible(false);
            cboxmis1.setVisible(false);
            cboxmis2.setVisible(false);
            cboxmis3.setVisible(false);
            cboxmis4.setVisible(false);
            cboxjs1.setVisible(false);
            cboxjs2.setVisible(false);
            cboxjs3.setVisible(false);
            cboxjs4.setVisible(false);
            cboxvis1.setVisible(false);
            cboxvis2.setVisible(false);
            cboxvis3.setVisible(false);
            cboxvis4.setVisible(false);
            cboxsas1.setVisible(false);
            cboxsas2.setVisible(false);
            cboxsas3.setVisible(false);
            cboxsas4.setVisible(false);
            cboxdoms1.setVisible(false);
            cboxdoms2.setVisible(false);
            cboxdoms3.setVisible(false);
            cboxdoms4.setVisible(false);
        }
    }

    /**
     * Llenado de horas y minutos, y tambien deshabilita la seleccion de horas
     */
    private void llenarHoras() {
        for (int i = 0; i < 24; i++) {
            cboxl1.addItem(String.valueOf(i));
            cboxl1.setEnabled(false);
            cboxl3.addItem(String.valueOf(i));
            cboxl3.setEnabled(false);
            cboxls1.addItem(String.valueOf(i));
            cboxls1.setEnabled(false);
            cboxls3.addItem(String.valueOf(i));
            cboxls3.setEnabled(false);

            cboxma1.addItem(String.valueOf(i));
            cboxma3.addItem(String.valueOf(i));
            cboxlmas1.addItem(String.valueOf(i));
            cboxlmas3.addItem(String.valueOf(i));

            cboxma1.setEnabled(false);
            cboxma3.setEnabled(false);
            cboxlmas1.setEnabled(false);
            cboxlmas3.setEnabled(false);

            cboxmi1.addItem(String.valueOf(i));
            cboxmi3.addItem(String.valueOf(i));
            cboxmis1.addItem(String.valueOf(i));
            cboxmis3.addItem(String.valueOf(i));

            cboxmi1.setEnabled(false);
            cboxmi3.setEnabled(false);
            cboxmis1.setEnabled(false);
            cboxmis3.setEnabled(false);

            cboxj1.addItem(String.valueOf(i));
            cboxj3.addItem(String.valueOf(i));
            cboxjs1.addItem(String.valueOf(i));
            cboxjs3.addItem(String.valueOf(i));

            cboxj1.setEnabled(false);
            cboxj3.setEnabled(false);
            cboxjs1.setEnabled(false);
            cboxjs3.setEnabled(false);

            cboxvi1.addItem(String.valueOf(i));
            cboxvi3.addItem(String.valueOf(i));
            cboxvis1.addItem(String.valueOf(i));
            cboxvis3.addItem(String.valueOf(i));

            cboxvi1.setEnabled(false);
            cboxvi3.setEnabled(false);
            cboxvis1.setEnabled(false);
            cboxvis3.setEnabled(false);

            cboxsa1.addItem(String.valueOf(i));
            cboxsa3.addItem(String.valueOf(i));
            cboxsas1.addItem(String.valueOf(i));
            cboxsas3.addItem(String.valueOf(i));

            cboxsa1.setEnabled(false);
            cboxsa3.setEnabled(false);
            cboxsas1.setEnabled(false);
            cboxsas3.setEnabled(false);

            cboxdom1.addItem(String.valueOf(i));
            cboxdom3.addItem(String.valueOf(i));
            cboxdoms1.addItem(String.valueOf(i));
            cboxdoms3.addItem(String.valueOf(i));

            cboxdom1.setEnabled(false);
            cboxdom3.setEnabled(false);
            cboxdoms1.setEnabled(false);
            cboxdoms3.setEnabled(false);
        }

        for (int i = 0; i < 60; i++) {
            cboxl2.addItem(String.valueOf(i));
            cboxl4.addItem(String.valueOf(i));
            cboxls2.addItem(String.valueOf(i));
            cboxls4.addItem(String.valueOf(i));

            cboxma2.addItem(String.valueOf(i));
            cboxma4.addItem(String.valueOf(i));
            cboxlmas2.addItem(String.valueOf(i));
            cboxlmas4.addItem(String.valueOf(i));

            cboxmi2.addItem(String.valueOf(i));
            cboxmi4.addItem(String.valueOf(i));
            cboxmis2.addItem(String.valueOf(i));
            cboxmis4.addItem(String.valueOf(i));

            cboxj2.addItem(String.valueOf(i));
            cboxj4.addItem(String.valueOf(i));
            cboxjs2.addItem(String.valueOf(i));
            cboxjs4.addItem(String.valueOf(i));

            cboxvi2.addItem(String.valueOf(i));
            cboxvi4.addItem(String.valueOf(i));
            cboxvis2.addItem(String.valueOf(i));
            cboxvis4.addItem(String.valueOf(i));

            cboxsa2.addItem(String.valueOf(i));
            cboxsa4.addItem(String.valueOf(i));
            cboxsas2.addItem(String.valueOf(i));
            cboxsas4.addItem(String.valueOf(i));

            cboxdom2.addItem(String.valueOf(i));
            cboxdom4.addItem(String.valueOf(i));
            cboxdoms2.addItem(String.valueOf(i));
            cboxdoms4.addItem(String.valueOf(i));

            cboxl2.setEnabled(false);
            cboxl4.setEnabled(false);
            cboxls2.setEnabled(false);
            cboxls4.setEnabled(false);

            cboxma2.setEnabled(false);
            cboxma4.setEnabled(false);
            cboxlmas2.setEnabled(false);
            cboxlmas4.setEnabled(false);

            cboxmi2.setEnabled(false);
            cboxmi4.setEnabled(false);
            cboxmis2.setEnabled(false);
            cboxmis4.setEnabled(false);

            cboxj2.setEnabled(false);
            cboxj4.setEnabled(false);
            cboxjs2.setEnabled(false);
            cboxjs4.setEnabled(false);

            cboxvi2.setEnabled(false);
            cboxvi4.setEnabled(false);
            cboxvis2.setEnabled(false);
            cboxvis4.setEnabled(false);

            cboxsa2.setEnabled(false);
            cboxsa4.setEnabled(false);
            cboxsas2.setEnabled(false);
            cboxsas4.setEnabled(false);

            cboxdom2.setEnabled(false);
            cboxdom4.setEnabled(false);
            cboxdoms2.setEnabled(false);
            cboxdoms4.setEnabled(false);
        }
    }

    /**
     * List con los dias y sus jornadas de entrada y salida de la primera
     * jornada.
     *
     * @return
     */
    private List<String> obHjornada1() {
        List<String> horas = new ArrayList<String>();
        if (jcheckl.isSelected()) {
            String hEntrada = cboxl1.getSelectedItem().toString();
            String mEntrada = cboxl2.getSelectedItem().toString();
            String hSalida = cboxl3.getSelectedItem().toString();
            String mSalida = cboxl4.getSelectedItem().toString();
            String ljor1 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(ljor1);

        }
        if (jcheckma.isSelected()) {
            String hEntrada = cboxma1.getSelectedItem().toString();
            String mEntrada = cboxma2.getSelectedItem().toString();
            String hSalida = cboxma3.getSelectedItem().toString();
            String mSalida = cboxma4.getSelectedItem().toString();
            String major1 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(major1);
        }
        if (jcheckmi.isSelected()) {
            String hEntrada = cboxmi1.getSelectedItem().toString();
            String mEntrada = cboxmi2.getSelectedItem().toString();
            String hSalida = cboxmi3.getSelectedItem().toString();
            String mSalida = cboxmi4.getSelectedItem().toString();
            String mijor1 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(mijor1);
        }
        if (jcheckj.isSelected()) {
            String hEntrada = cboxj1.getSelectedItem().toString();
            String mEntrada = cboxj2.getSelectedItem().toString();
            String hSalida = cboxj3.getSelectedItem().toString();
            String mSalida = cboxj4.getSelectedItem().toString();
            String jjor1 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(jjor1);
        }
        if (jcheckv.isSelected()) {
            String hEntrada = cboxvi1.getSelectedItem().toString();
            String mEntrada = cboxvi2.getSelectedItem().toString();
            String hSalida = cboxvi3.getSelectedItem().toString();
            String mSalida = cboxvi4.getSelectedItem().toString();
            String vjor1 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(vjor1);
        }
        if (jchecks.isSelected()) {
            String hEntrada = cboxsa1.getSelectedItem().toString();
            String mEntrada = cboxsa2.getSelectedItem().toString();
            String hSalida = cboxsa3.getSelectedItem().toString();
            String mSalida = cboxsa4.getSelectedItem().toString();
            String sjor1 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(sjor1);
        }
        if (jcheckd.isSelected()) {
            String hEntrada = cboxdom1.getSelectedItem().toString();
            String mEntrada = cboxdom2.getSelectedItem().toString();
            String hSalida = cboxdom3.getSelectedItem().toString();
            String mSalida = cboxdom4.getSelectedItem().toString();
            String djor1 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(djor1);
        }
        return horas;
    }

    /**
     * Verifica si la jornada es a tiempo parcial o a tiempo completo, luego
     * valida que las horas de ingreso no sean mayor a las de la salida tanto en
     * la jornada vespertina como la jornada matutina.
     */
    private void validarHoras() {

        if (jornada == "Jornada Parcial") {
            if (jcheckl.isSelected()) {
                int hEntrada = Integer.parseInt(cboxl1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxl3.getSelectedItem().toString());

                if (hEntrada >= hSalida) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckma.isSelected()) {
                int hEntrada = Integer.parseInt(cboxma1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxma3.getSelectedItem().toString());

                if (hEntrada >= hSalida) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckmi.isSelected()) {
                int hEntrada = Integer.parseInt(cboxmi1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxmi3.getSelectedItem().toString());

                if (hEntrada >= hSalida) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckj.isSelected()) {
                int hEntrada = Integer.parseInt(cboxj1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxj3.getSelectedItem().toString());

                if (hEntrada >= hSalida) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckv.isSelected()) {
                int hEntrada = Integer.parseInt(cboxvi1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxvi3.getSelectedItem().toString());

                if (hEntrada >= hSalida) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jchecks.isSelected()) {
                int hEntrada = Integer.parseInt(cboxsa1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxsa3.getSelectedItem().toString());

                if (hEntrada >= hSalida) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckd.isSelected()) {
                int hEntrada = Integer.parseInt(cboxdom1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxdom3.getSelectedItem().toString());

                if (hEntrada >= hSalida) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (jornada == "Jornada Completa") {
            if (jcheckl.isSelected()) {
                int hEntrada = Integer.parseInt(cboxl1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxl3.getSelectedItem().toString());
                int hEnt2 = Integer.parseInt(cboxls1.getSelectedItem().toString());
                int hSal2 = Integer.parseInt(cboxls3.getSelectedItem().toString());
                if (hEntrada >= hSalida || hSalida > hEnt2 || hEntrada >= hEnt2 || hEnt2 >= hSal2) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckma.isSelected()) {
                int hEntrada = Integer.parseInt(cboxlmas1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxlmas3.getSelectedItem().toString());
                int hEnt2 = Integer.parseInt(cboxlmas1.getSelectedItem().toString());
                int hSal2 = Integer.parseInt(cboxlmas3.getSelectedItem().toString());
                if (hEntrada >= hSalida || hSalida > hEnt2 || hEntrada >= hEnt2 || hEnt2 >= hSal2) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckmi.isSelected()) {
                int hEntrada = Integer.parseInt(cboxmis1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxmis3.getSelectedItem().toString());
                int hEnt2 = Integer.parseInt(cboxmis1.getSelectedItem().toString());
                int hSal2 = Integer.parseInt(cboxmis3.getSelectedItem().toString());
                if (hEntrada >= hSalida || hSalida > hEnt2 || hEntrada >= hEnt2 || hEnt2 >= hSal2) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckj.isSelected()) {
                int hEntrada = Integer.parseInt(cboxj1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxj3.getSelectedItem().toString());
                int hEnt2 = Integer.parseInt(cboxjs1.getSelectedItem().toString());
                int hSal2 = Integer.parseInt(cboxjs3.getSelectedItem().toString());
                if (hEntrada >= hSalida || hSalida > hEnt2 || hEntrada >= hEnt2 || hEnt2 >= hSal2) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckv.isSelected()) {
                int hEntrada = Integer.parseInt(cboxvi1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxvi3.getSelectedItem().toString());
                int hEnt2 = Integer.parseInt(cboxvis1.getSelectedItem().toString());
                int hSal2 = Integer.parseInt(cboxvis3.getSelectedItem().toString());
                if (hEntrada >= hSalida || hSalida > hEnt2 || hEntrada >= hEnt2 || hEnt2 >= hSal2) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jchecks.isSelected()) {
                int hEntrada = Integer.parseInt(cboxsa1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxsa3.getSelectedItem().toString());
                int hEnt2 = Integer.parseInt(cboxsas1.getSelectedItem().toString());
                int hSal2 = Integer.parseInt(cboxsas3.getSelectedItem().toString());
                if (hEntrada >= hSalida || hSalida > hEnt2 || hEntrada >= hEnt2 || hEnt2 >= hSal2) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (jcheckd.isSelected()) {
                int hEntrada = Integer.parseInt(cboxdom1.getSelectedItem().toString());
                int hSalida = Integer.parseInt(cboxdom3.getSelectedItem().toString());
                int hEnt2 = Integer.parseInt(cboxdoms1.getSelectedItem().toString());
                int hSal2 = Integer.parseInt(cboxdoms3.getSelectedItem().toString());
                if (hEntrada >= hSalida || hSalida > hEnt2 || hEntrada >= hEnt2 || hEnt2 >= hSal2) {
                    JOptionPane.showMessageDialog(this, "La hora de salida no puede ser iguao o menor que la de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    /**
     * Obtiene las horas de entrada y salidas de la segunda jornada.
     *
     * @return List con los dias y sus jornadas de entrada y salida de la
     * segunda jornada.
     */
    private List<String> obHjornada2() {
        List<String> horas = new ArrayList<String>();
        if (jcheckl.isSelected()) {
            String hEntrada = cboxls1.getSelectedItem().toString();
            String mEntrada = cboxls2.getSelectedItem().toString();
            String hSalida = cboxls3.getSelectedItem().toString();
            String mSalida = cboxls4.getSelectedItem().toString();

            String ljor2 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(ljor2);

        }
        if (jcheckma.isSelected()) {
            String hEntrada = cboxlmas1.getSelectedItem().toString();
            String mEntrada = cboxlmas2.getSelectedItem().toString();
            String hSalida = cboxlmas3.getSelectedItem().toString();
            String mSalida = cboxlmas4.getSelectedItem().toString();

            String major2 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(major2);
        }
        if (jcheckmi.isSelected()) {
            String hEntrada = cboxmis1.getSelectedItem().toString();
            String mEntrada = cboxmis2.getSelectedItem().toString();
            String hSalida = cboxmis3.getSelectedItem().toString();
            String mSalida = cboxmis4.getSelectedItem().toString();
            String mijor2 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(mijor2);
        }
        if (jcheckj.isSelected()) {
            String hEntrada = cboxjs1.getSelectedItem().toString();
            String mEntrada = cboxjs2.getSelectedItem().toString();
            String hSalida = cboxjs3.getSelectedItem().toString();
            String mSalida = cboxjs4.getSelectedItem().toString();
            String jjor2 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(jjor2);
        }
        if (jcheckv.isSelected()) {
            String hEntrada = cboxvis1.getSelectedItem().toString();
            String mEntrada = cboxvis2.getSelectedItem().toString();
            String hSalida = cboxvis3.getSelectedItem().toString();
            String mSalida = cboxvis4.getSelectedItem().toString();
            String vjor2 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(vjor2);
        }
        if (jchecks.isSelected()) {
            String hEntrada = cboxsas1.getSelectedItem().toString();
            String mEntrada = cboxsas2.getSelectedItem().toString();
            String hSalida = cboxsas3.getSelectedItem().toString();
            String mSalida = cboxsas4.getSelectedItem().toString();
            String sjor2 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(sjor2);
        }
        if (jcheckd.isSelected()) {
            String hEntrada = cboxdoms1.getSelectedItem().toString();
            String mEntrada = cboxdoms2.getSelectedItem().toString();
            String hSalida = cboxdoms3.getSelectedItem().toString();
            String mSalida = cboxdoms4.getSelectedItem().toString();
            String sjor2 = hEntrada + ":" + mEntrada + "," + hSalida + ":" + mSalida;
            horas.add(sjor2);
        }
        return horas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcheckl = new javax.swing.JCheckBox();
        jcheckma = new javax.swing.JCheckBox();
        jcheckmi = new javax.swing.JCheckBox();
        jcheckj = new javax.swing.JCheckBox();
        jcheckv = new javax.swing.JCheckBox();
        jchecks = new javax.swing.JCheckBox();
        jcheckd = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cboxl1 = new javax.swing.JComboBox<>();
        cboxl2 = new javax.swing.JComboBox<>();
        cboxl3 = new javax.swing.JComboBox<>();
        cboxl4 = new javax.swing.JComboBox<>();
        cboxma1 = new javax.swing.JComboBox<>();
        cboxma2 = new javax.swing.JComboBox<>();
        cboxma3 = new javax.swing.JComboBox<>();
        cboxma4 = new javax.swing.JComboBox<>();
        cboxmi1 = new javax.swing.JComboBox<>();
        cboxmi2 = new javax.swing.JComboBox<>();
        cboxmi3 = new javax.swing.JComboBox<>();
        cboxmi4 = new javax.swing.JComboBox<>();
        cboxj1 = new javax.swing.JComboBox<>();
        cboxj2 = new javax.swing.JComboBox<>();
        cboxj3 = new javax.swing.JComboBox<>();
        cboxj4 = new javax.swing.JComboBox<>();
        cboxvi1 = new javax.swing.JComboBox<>();
        cboxvi2 = new javax.swing.JComboBox<>();
        cboxvi3 = new javax.swing.JComboBox<>();
        cboxvi4 = new javax.swing.JComboBox<>();
        cboxsa1 = new javax.swing.JComboBox<>();
        cboxsa2 = new javax.swing.JComboBox<>();
        cboxsa3 = new javax.swing.JComboBox<>();
        cboxsa4 = new javax.swing.JComboBox<>();
        cboxdom1 = new javax.swing.JComboBox<>();
        cboxdom2 = new javax.swing.JComboBox<>();
        cboxdom3 = new javax.swing.JComboBox<>();
        cboxdom4 = new javax.swing.JComboBox<>();
        lbllunestotal = new javax.swing.JTextField();
        lblmatotal = new javax.swing.JTextField();
        lbljuetotal = new javax.swing.JTextField();
        lblmitotal = new javax.swing.JTextField();
        lblsatotal = new javax.swing.JTextField();
        lblvietotal = new javax.swing.JTextField();
        lbldomtotal = new javax.swing.JTextField();
        lblsemtotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboxls4 = new javax.swing.JComboBox<>();
        cboxls3 = new javax.swing.JComboBox<>();
        cboxls2 = new javax.swing.JComboBox<>();
        cboxls1 = new javax.swing.JComboBox<>();
        cboxlmas1 = new javax.swing.JComboBox<>();
        cboxlmas2 = new javax.swing.JComboBox<>();
        cboxlmas3 = new javax.swing.JComboBox<>();
        cboxlmas4 = new javax.swing.JComboBox<>();
        cboxmis4 = new javax.swing.JComboBox<>();
        cboxjs3 = new javax.swing.JComboBox<>();
        cboxmis2 = new javax.swing.JComboBox<>();
        cboxmis1 = new javax.swing.JComboBox<>();
        cboxjs1 = new javax.swing.JComboBox<>();
        cboxjs2 = new javax.swing.JComboBox<>();
        cboxmis3 = new javax.swing.JComboBox<>();
        cboxjs4 = new javax.swing.JComboBox<>();
        cboxvis4 = new javax.swing.JComboBox<>();
        cboxvis3 = new javax.swing.JComboBox<>();
        cboxsas3 = new javax.swing.JComboBox<>();
        cboxsas4 = new javax.swing.JComboBox<>();
        cboxdoms3 = new javax.swing.JComboBox<>();
        cboxdoms4 = new javax.swing.JComboBox<>();
        cboxvis2 = new javax.swing.JComboBox<>();
        cboxvis1 = new javax.swing.JComboBox<>();
        cboxsas1 = new javax.swing.JComboBox<>();
        cboxsas2 = new javax.swing.JComboBox<>();
        cboxdoms2 = new javax.swing.JComboBox<>();
        jseparator = new javax.swing.JSeparator();
        cboxdoms1 = new javax.swing.JComboBox<>();
        lblentrada2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblsalida2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblh21 = new javax.swing.JLabel();
        lblh22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblm21 = new javax.swing.JLabel();
        lblm22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblempresa = new javax.swing.JLabel();
        lbljornada = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        jPanel1.setAutoscrolls(true);

        jcheckl.setText("Lunes");
        jcheckl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchecklActionPerformed(evt);
            }
        });

        jcheckma.setText("Martes");
        jcheckma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckmaActionPerformed(evt);
            }
        });

        jcheckmi.setText("Miercoles");
        jcheckmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckmiActionPerformed(evt);
            }
        });

        jcheckj.setText("Jueves");
        jcheckj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckjActionPerformed(evt);
            }
        });

        jcheckv.setText("Viernes");
        jcheckv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckvActionPerformed(evt);
            }
        });

        jchecks.setText("Sabado");
        jchecks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchecksActionPerformed(evt);
            }
        });

        jcheckd.setText("Domingo");
        jcheckd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckdActionPerformed(evt);
            }
        });

        jLabel1.setText("Dias");

        cboxl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxl1ActionPerformed(evt);
            }
        });

        cboxl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxl2ActionPerformed(evt);
            }
        });

        cboxl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxl3ActionPerformed(evt);
            }
        });

        cboxl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxl4ActionPerformed(evt);
            }
        });

        cboxma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxma1ActionPerformed(evt);
            }
        });

        cboxma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxma2ActionPerformed(evt);
            }
        });

        cboxma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxma3ActionPerformed(evt);
            }
        });

        cboxma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxma4ActionPerformed(evt);
            }
        });

        cboxmi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmi1ActionPerformed(evt);
            }
        });

        cboxmi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmi2ActionPerformed(evt);
            }
        });

        cboxmi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmi3ActionPerformed(evt);
            }
        });

        cboxmi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmi4ActionPerformed(evt);
            }
        });

        cboxj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxj1ActionPerformed(evt);
            }
        });

        cboxj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxj2ActionPerformed(evt);
            }
        });

        cboxj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxj3ActionPerformed(evt);
            }
        });

        cboxj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxj4ActionPerformed(evt);
            }
        });

        cboxvi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvi1ActionPerformed(evt);
            }
        });

        cboxvi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvi2ActionPerformed(evt);
            }
        });

        cboxvi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvi3ActionPerformed(evt);
            }
        });

        cboxvi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvi4ActionPerformed(evt);
            }
        });

        cboxsa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsa1ActionPerformed(evt);
            }
        });

        cboxsa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsa2ActionPerformed(evt);
            }
        });

        cboxsa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsa3ActionPerformed(evt);
            }
        });

        cboxsa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsa4ActionPerformed(evt);
            }
        });

        cboxdom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdom1ActionPerformed(evt);
            }
        });

        cboxdom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdom2ActionPerformed(evt);
            }
        });

        cboxdom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdom3ActionPerformed(evt);
            }
        });

        cboxdom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdom4ActionPerformed(evt);
            }
        });

        lbllunestotal.setEnabled(false);

        lblmatotal.setEnabled(false);

        lbljuetotal.setEnabled(false);

        lblmitotal.setEnabled(false);

        lblsatotal.setEnabled(false);

        lblvietotal.setEnabled(false);

        lbldomtotal.setEnabled(false);

        lblsemtotal.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Semanal");

        cboxls4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxls4ActionPerformed(evt);
            }
        });

        cboxls3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxls3ActionPerformed(evt);
            }
        });

        cboxls2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxls2ActionPerformed(evt);
            }
        });

        cboxls1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxls1ActionPerformed(evt);
            }
        });

        cboxlmas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxlmas1ActionPerformed(evt);
            }
        });

        cboxlmas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxlmas2ActionPerformed(evt);
            }
        });

        cboxlmas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxlmas3ActionPerformed(evt);
            }
        });

        cboxlmas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxlmas4ActionPerformed(evt);
            }
        });

        cboxmis4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmis4ActionPerformed(evt);
            }
        });

        cboxjs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxjs3ActionPerformed(evt);
            }
        });

        cboxmis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmis2ActionPerformed(evt);
            }
        });

        cboxmis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmis1ActionPerformed(evt);
            }
        });

        cboxjs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxjs1ActionPerformed(evt);
            }
        });

        cboxjs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxjs2ActionPerformed(evt);
            }
        });

        cboxmis3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxmis3ActionPerformed(evt);
            }
        });

        cboxjs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxjs4ActionPerformed(evt);
            }
        });

        cboxvis4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvis4ActionPerformed(evt);
            }
        });

        cboxvis3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvis3ActionPerformed(evt);
            }
        });

        cboxsas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsas3ActionPerformed(evt);
            }
        });

        cboxsas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsas4ActionPerformed(evt);
            }
        });

        cboxdoms3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdoms3ActionPerformed(evt);
            }
        });

        cboxdoms4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdoms4ActionPerformed(evt);
            }
        });

        cboxvis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvis2ActionPerformed(evt);
            }
        });

        cboxvis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxvis1ActionPerformed(evt);
            }
        });

        cboxsas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsas1ActionPerformed(evt);
            }
        });

        cboxsas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxsas2ActionPerformed(evt);
            }
        });

        cboxdoms2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdoms2ActionPerformed(evt);
            }
        });

        jseparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cboxdoms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdoms1ActionPerformed(evt);
            }
        });

        lblentrada2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblentrada2.setText("Entrada");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Salida");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Entrada");

        lblsalida2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsalida2.setText("Salida");

        jLabel7.setText("Hora");

        jLabel8.setText("Minuto");

        jLabel9.setText("Hora");

        lblh21.setText("Hora");

        lblh22.setText("Hora");

        jLabel12.setText("Minuto");

        lblm21.setText("Minuto");

        lblm22.setText("Minuto");

        jLabel15.setText("Total");

        lblempresa.setText("jLabel16");

        lbljornada.setText("jLabel16");

        jButton1.setText("Sumar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcheckl)
                                    .addComponent(jcheckma)
                                    .addComponent(jcheckmi)
                                    .addComponent(jcheckj)
                                    .addComponent(jcheckv)
                                    .addComponent(jchecks)
                                    .addComponent(jcheckd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboxj1, 0, 59, Short.MAX_VALUE)
                                            .addComponent(cboxmi1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboxmi2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxj2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxmi3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxmi4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxj3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxj4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cboxdom1, 0, 61, Short.MAX_VALUE)
                                            .addComponent(cboxsa1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboxvi1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboxvi2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboxsa2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cboxdom2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxdom3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxdom4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxvi3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxvi4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxsa3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxsa4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxma1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxma2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cboxl1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(cboxl2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(37, 37, 37)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxma3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxma4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxl3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxl4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(22, 22, 22)
                                .addComponent(jseparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 23, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxjs1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxjs2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(cboxlmas3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cboxls3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(cboxls4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cboxlmas4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(cboxdoms3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cboxdoms4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(cboxsas3, 0, 63, Short.MAX_VALUE)
                                                                    .addComponent(cboxvis3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(cboxjs3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(cboxmis3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(cboxmis4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(cboxjs4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(cboxvis4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(cboxsas4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblh22)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblm22)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lblentrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblsalida2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxmis1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxmis2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cboxvis1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboxsas1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cboxsas2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboxvis2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cboxdoms1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboxdoms2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(cboxls1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(cboxls2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(cboxlmas1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(cboxlmas2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblh21)
                                                        .addGap(37, 37, 37)
                                                        .addComponent(lblm21))))
                                            .addComponent(jButton1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1)
                                .addGap(288, 288, 288)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblsatotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblvietotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbljuetotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblmitotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblmatotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbllunestotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addComponent(lbldomtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbljornada, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblsemtotal)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblempresa)
                        .addGap(7, 7, 7)
                        .addComponent(lbljornada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblsalida2)
                        .addComponent(lblentrada2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(lblh21))
                                    .addComponent(jLabel8)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblh22)
                                        .addComponent(lblm21)
                                        .addComponent(jLabel15)))
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblm22, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jseparator)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcheckl)
                                    .addComponent(cboxl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbllunestotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcheckma, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxma3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxma4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblmatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jcheckmi)
                                            .addComponent(cboxmi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxmi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxmi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxmi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jcheckj)
                                            .addComponent(cboxj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblmitotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cboxmis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboxmis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboxmis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboxmis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbljuetotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxjs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxjs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxjs3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxjs4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblvietotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblsatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jcheckv)
                                            .addComponent(cboxvi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxvi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxvi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxvi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxvis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxvis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxvis3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxvis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jchecks)
                                                    .addComponent(cboxsa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboxsa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboxsa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboxsa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(cboxsas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cboxsas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboxsas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboxsas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jcheckd)
                                        .addComponent(cboxdom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxdom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxdom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxdom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxdoms1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxdoms2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxdoms3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxdoms4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbldomtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboxls1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxls2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxls3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxls4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboxlmas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxlmas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxlmas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxlmas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblsemtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxdoms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdoms1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxdoms1ActionPerformed

    private void cboxdoms2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdoms2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxdoms2ActionPerformed

    private void cboxsas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsas2ActionPerformed

    private void cboxsas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsas1ActionPerformed

    private void cboxvis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvis1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvis1ActionPerformed

    private void cboxvis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvis2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvis2ActionPerformed

    private void cboxdoms4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdoms4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxdoms4ActionPerformed

    private void cboxdoms3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdoms3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxdoms3ActionPerformed

    private void cboxsas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsas4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsas4ActionPerformed

    private void cboxsas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsas3ActionPerformed

    private void cboxvis3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvis3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvis3ActionPerformed

    private void cboxvis4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvis4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvis4ActionPerformed

    private void cboxjs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxjs4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxjs4ActionPerformed

    private void cboxmis3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmis3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmis3ActionPerformed

    private void cboxjs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxjs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxjs2ActionPerformed

    private void cboxjs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxjs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxjs1ActionPerformed

    private void cboxmis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmis1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmis1ActionPerformed

    private void cboxmis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmis2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmis2ActionPerformed

    private void cboxjs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxjs3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxjs3ActionPerformed

    private void cboxmis4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmis4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmis4ActionPerformed

    private void cboxlmas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxlmas4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxlmas4ActionPerformed

    private void cboxlmas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxlmas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxlmas3ActionPerformed

    private void cboxlmas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxlmas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxlmas2ActionPerformed

    private void cboxlmas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxlmas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxlmas1ActionPerformed

    private void cboxls1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxls1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cboxls1ActionPerformed

    private void cboxls2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxls2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxls2ActionPerformed

    private void cboxls3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxls3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxls3ActionPerformed

    private void cboxls4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxls4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxls4ActionPerformed

    private void cboxdom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdom4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cboxdom4ActionPerformed

    private void cboxdom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdom3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxdom3ActionPerformed

    private void cboxdom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxdom2ActionPerformed

    private void cboxdom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxdom1ActionPerformed

    private void cboxsa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsa4ActionPerformed

    private void cboxsa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsa3ActionPerformed

    private void cboxsa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsa2ActionPerformed

    private void cboxsa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxsa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxsa1ActionPerformed

    private void cboxvi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvi4ActionPerformed

    private void cboxvi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvi3ActionPerformed

    private void cboxvi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvi2ActionPerformed

    private void cboxvi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxvi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxvi1ActionPerformed

    private void cboxj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxj4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxj4ActionPerformed

    private void cboxj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxj3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxj3ActionPerformed

    private void cboxj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxj2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxj2ActionPerformed

    private void cboxj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxj1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxj1ActionPerformed

    private void cboxmi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmi4ActionPerformed

    private void cboxmi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmi3ActionPerformed

    private void cboxmi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmi2ActionPerformed

    private void cboxmi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxmi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxmi1ActionPerformed

    private void cboxma4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxma4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxma4ActionPerformed

    private void cboxma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxma3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxma3ActionPerformed

    private void cboxma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxma2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxma2ActionPerformed

    private void cboxma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxma1ActionPerformed

    private void cboxl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxl4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxl4ActionPerformed

    private void cboxl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxl3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cboxl3ActionPerformed

    private void cboxl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxl2ActionPerformed

    private void cboxl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxl1ActionPerformed

    private void jcheckmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckmiActionPerformed
        // TODO add your handling code here:
        if (jcheckmi.isSelected()) {
            if (dActivos < 5) {
                if (jcheckmi.isSelected()) {
                    cboxmi1.setEnabled(true);
                    cboxmi2.setEnabled(true);
                    cboxmi3.setEnabled(true);
                    cboxmi4.setEnabled(true);
                    cboxmis1.setEnabled(true);
                    cboxmis2.setEnabled(true);
                    cboxmis3.setEnabled(true);
                    cboxmis4.setEnabled(true);
                    dActivos++;
                } else {
                    cboxmi1.setEnabled(false);
                    cboxmi2.setEnabled(false);
                    cboxmi3.setEnabled(false);
                    cboxmi4.setEnabled(false);
                    cboxmis1.setEnabled(false);
                    cboxmis2.setEnabled(false);
                    cboxmis3.setEnabled(false);
                    cboxmis4.setEnabled(false);
                    dActivos--;
                }
            } else {
                JOptionPane.showMessageDialog(this, "El horario de hornada completa \n"
                        + "solo se puede laborar 5 dias a la semana de"
                        + "\n 8 horas diasrias.");
                jcheckmi.setSelected(false);
            }
        } else {
            cboxmi1.setEnabled(false);
            cboxmi2.setEnabled(false);
            cboxmi3.setEnabled(false);
            cboxmi4.setEnabled(false);
            cboxmis1.setEnabled(false);
            cboxmis2.setEnabled(false);
            cboxmis3.setEnabled(false);
            cboxmis4.setEnabled(false);

            cboxmi1.setSelectedItem("0");
            cboxmi2.setSelectedItem("0");
            cboxmi3.setSelectedItem("0");
            cboxmi4.setSelectedItem("0");
            cboxmis1.setSelectedItem("0");
            cboxmis2.setSelectedItem("0");
            cboxmis3.setSelectedItem("0");
            cboxmis4.setSelectedItem("0");
            lblmitotal.setText("");
            dActivos--;
        }
        System.out.println(dActivos);

    }//GEN-LAST:event_jcheckmiActionPerformed

    private void jchecklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchecklActionPerformed
        // TODO add your handling code here:
        if (jcheckl.isSelected()) {
            if (dActivos < 5) {
                if (jcheckl.isSelected()) {
                    cboxl1.setEnabled(true);
                    cboxl2.setEnabled(true);
                    cboxl3.setEnabled(true);
                    cboxl4.setEnabled(true);
                    cboxls1.setEnabled(true);
                    cboxls2.setEnabled(true);
                    cboxls3.setEnabled(true);
                    cboxls4.setEnabled(true);
                    dActivos++;
                } else {
                    cboxl1.setEnabled(false);
                    cboxl2.setEnabled(false);
                    cboxl3.setEnabled(false);
                    cboxl4.setEnabled(false);
                    cboxls1.setEnabled(false);
                    cboxls2.setEnabled(false);
                    cboxls3.setEnabled(false);
                    cboxls4.setEnabled(false);
                    dActivos--;
                }
            } else {
                JOptionPane.showMessageDialog(this, "El horario de hornada completa \n"
                        + "solo se puede laborar 5 dias a la semana de"
                        + "\n 8 horas diasrias.");
                jcheckl.setSelected(false);
            }
        } else {
            cboxl1.setEnabled(false);
            cboxl2.setEnabled(false);
            cboxl3.setEnabled(false);
            cboxl4.setEnabled(false);
            cboxls1.setEnabled(false);
            cboxls2.setEnabled(false);
            cboxls3.setEnabled(false);
            cboxls4.setEnabled(false);

            cboxl1.setSelectedItem("0");
            cboxl2.setSelectedItem("0");
            cboxl3.setSelectedItem("0");
            cboxl4.setSelectedItem("0");
            cboxls1.setSelectedItem("0");
            cboxls2.setSelectedItem("0");
            cboxls3.setSelectedItem("0");
            cboxls4.setSelectedItem("0");
            lbllunestotal.setText("");
            dActivos--;
        }
        System.out.println(dActivos);
    }//GEN-LAST:event_jchecklActionPerformed

    private void jcheckmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckmaActionPerformed
        // TODO add your handling code here:

        if (jcheckma.isSelected()) {
            if (dActivos < 5) {
                if (jcheckma.isSelected()) {
                    cboxma1.setEnabled(true);
                    cboxma2.setEnabled(true);
                    cboxma3.setEnabled(true);
                    cboxma4.setEnabled(true);
                    cboxlmas1.setEnabled(true);
                    cboxlmas2.setEnabled(true);
                    cboxlmas3.setEnabled(true);
                    cboxlmas4.setEnabled(true);
                    dActivos++;
                } else {
                    cboxma1.setEnabled(false);
                    cboxma2.setEnabled(false);
                    cboxma3.setEnabled(false);
                    cboxma4.setEnabled(false);
                    cboxlmas1.setEnabled(false);
                    cboxlmas2.setEnabled(false);
                    cboxlmas3.setEnabled(false);
                    cboxlmas4.setEnabled(false);
                    dActivos--;
                }
            } else {
                JOptionPane.showMessageDialog(this, "El horario de hornada completa \n"
                        + "solo se puede laborar 5 dias a la semana de"
                        + "\n 8 horas diasrias.");
                jcheckma.setSelected(false);
            }
        } else {
            cboxma1.setEnabled(false);
            cboxma2.setEnabled(false);
            cboxma3.setEnabled(false);
            cboxma4.setEnabled(false);
            cboxlmas1.setEnabled(false);
            cboxlmas2.setEnabled(false);
            cboxlmas3.setEnabled(false);
            cboxlmas4.setEnabled(false);

            cboxma1.setSelectedItem("0");
            cboxma2.setSelectedItem("0");
            cboxma3.setSelectedItem("0");
            cboxma4.setSelectedItem("0");
            cboxlmas1.setSelectedItem("0");
            cboxlmas2.setSelectedItem("0");
            cboxlmas3.setSelectedItem("0");
            cboxlmas4.setSelectedItem("0");
            lblmatotal.setText("");
            dActivos--;
        }
        System.out.println(dActivos);
    }//GEN-LAST:event_jcheckmaActionPerformed

    private void jcheckjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckjActionPerformed
        // TODO add your handling code here:
        if (jcheckj.isSelected()) {
            if (dActivos < 5) {
                if (jcheckj.isSelected()) {
                    cboxj1.setEnabled(true);
                    cboxj2.setEnabled(true);
                    cboxj3.setEnabled(true);
                    cboxj4.setEnabled(true);
                    cboxjs1.setEnabled(true);
                    cboxjs2.setEnabled(true);
                    cboxjs3.setEnabled(true);
                    cboxjs4.setEnabled(true);
                    dActivos++;
                } else {
                    cboxj1.setEnabled(false);
                    cboxj2.setEnabled(false);
                    cboxj3.setEnabled(false);
                    cboxj4.setEnabled(false);
                    cboxjs1.setEnabled(false);
                    cboxjs2.setEnabled(false);
                    cboxjs3.setEnabled(false);
                    cboxjs4.setEnabled(false);
                    dActivos--;
                }
            } else {
                JOptionPane.showMessageDialog(this, "El horario de hornada completa \n"
                        + "solo se puede laborar 5 dias a la semana de"
                        + "\n 8 horas diasrias.");
                jcheckj.setSelected(false);
            }
        } else {
            cboxj1.setEnabled(false);
            cboxj2.setEnabled(false);
            cboxj3.setEnabled(false);
            cboxj4.setEnabled(false);
            cboxjs1.setEnabled(false);
            cboxjs2.setEnabled(false);
            cboxjs3.setEnabled(false);
            cboxjs4.setEnabled(false);

            cboxj1.setSelectedItem("0");
            cboxj2.setSelectedItem("0");
            cboxj3.setSelectedItem("0");
            cboxj4.setSelectedItem("0");
            cboxjs1.setSelectedItem("0");
            cboxjs2.setSelectedItem("0");
            cboxjs3.setSelectedItem("0");
            cboxjs4.setSelectedItem("0");
            lbljuetotal.setText("");
            dActivos--;
        }
        System.out.println(dActivos);
    }//GEN-LAST:event_jcheckjActionPerformed

    private void jcheckvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckvActionPerformed
        // TODO add your handling code here:
        if (jcheckv.isSelected()) {
            if (dActivos < 5) {
                if (jcheckv.isSelected()) {
                    cboxvi1.setEnabled(true);
                    cboxvi2.setEnabled(true);
                    cboxvi3.setEnabled(true);
                    cboxvi4.setEnabled(true);
                    cboxvis1.setEnabled(true);
                    cboxvis2.setEnabled(true);
                    cboxvis3.setEnabled(true);
                    cboxvis4.setEnabled(true);
                    dActivos++;
                } else {
                    cboxvi1.setEnabled(false);
                    cboxvi2.setEnabled(false);
                    cboxvi3.setEnabled(false);
                    cboxvi4.setEnabled(false);
                    cboxvis1.setEnabled(false);
                    cboxvis2.setEnabled(false);
                    cboxvis3.setEnabled(false);
                    cboxvis4.setEnabled(false);
                    dActivos--;
                }
            } else {
                JOptionPane.showMessageDialog(this, "El horario de hornada completa \n"
                        + "solo se puede laborar 5 dias a la semana de"
                        + "\n 8 horas diasrias.");
                jcheckv.setSelected(false);
            }
        } else {
            cboxvi1.setEnabled(false);
            cboxvi2.setEnabled(false);
            cboxvi3.setEnabled(false);
            cboxvi4.setEnabled(false);
            cboxvis1.setEnabled(false);
            cboxvis2.setEnabled(false);
            cboxvis3.setEnabled(false);
            cboxvis4.setEnabled(false);

            cboxvi1.setSelectedItem("0");
            cboxvi2.setSelectedItem("0");
            cboxvi3.setSelectedItem("0");
            cboxvi4.setSelectedItem("0");
            cboxvis1.setSelectedItem("0");
            cboxvis2.setSelectedItem("0");
            cboxvis3.setSelectedItem("0");
            cboxvis4.setSelectedItem("0");
            lblvietotal.setText("");

            dActivos--;
        }
        System.out.println(dActivos);

    }//GEN-LAST:event_jcheckvActionPerformed

    private void jchecksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchecksActionPerformed
        // TODO add your handling code here:
        if (jchecks.isSelected()) {
            if (dActivos < 5) {
                if (jchecks.isSelected()) {
                    cboxsa1.setEnabled(true);
                    cboxsa2.setEnabled(true);
                    cboxsa3.setEnabled(true);
                    cboxsa4.setEnabled(true);
                    cboxsas1.setEnabled(true);
                    cboxsas2.setEnabled(true);
                    cboxsas3.setEnabled(true);
                    cboxsas4.setEnabled(true);
                    dActivos++;
                } else {
                    cboxsa1.setEnabled(false);
                    cboxsa2.setEnabled(false);
                    cboxsa3.setEnabled(false);
                    cboxsas1.setEnabled(false);
                    cboxsas2.setEnabled(false);
                    cboxsas3.setEnabled(false);
                    cboxsas4.setEnabled(false);
                    dActivos--;
                }
            } else {
                JOptionPane.showMessageDialog(this, "El horario de hornada completa \n"
                        + "solo se puede laborar 5 dias a la semana de"
                        + "\n 8 horas diasrias.");
                jchecks.setSelected(false);
            }
        } else {
            cboxsa1.setEnabled(false);
            cboxsa2.setEnabled(false);
            cboxsa3.setEnabled(false);
            cboxsas1.setEnabled(false);
            cboxsas2.setEnabled(false);
            cboxsas3.setEnabled(false);
            cboxsas4.setEnabled(false);

            cboxsa1.setSelectedItem("0");
            cboxsa2.setSelectedItem("0");
            cboxsa3.setSelectedItem("0");
            cboxsas1.setSelectedItem("0");
            cboxsas2.setSelectedItem("0");
            cboxsas3.setSelectedItem("0");
            cboxsas4.setSelectedItem("0");
            lblsatotal.setText("0");
            dActivos--;
        }
        System.out.println(dActivos);
    }//GEN-LAST:event_jchecksActionPerformed

    private void jcheckdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckdActionPerformed
        // TODO add your handling code here:

        if (jcheckd.isSelected()) {
            if (dActivos < 5) {
                if (jcheckd.isSelected()) {
                    cboxdom1.setEnabled(true);
                    cboxdom2.setEnabled(true);
                    cboxdom3.setEnabled(true);
                    cboxdom4.setEnabled(true);
                    cboxdoms1.setEnabled(true);
                    cboxdoms2.setEnabled(true);
                    cboxdoms3.setEnabled(true);
                    cboxdoms4.setEnabled(true);
                    dActivos++;
                } else {
                    cboxdom1.setEnabled(false);
                    cboxdom2.setEnabled(false);
                    cboxdom3.setEnabled(false);
                    cboxdom4.setEnabled(false);
                    cboxdoms1.setEnabled(false);
                    cboxdoms2.setEnabled(false);
                    cboxdoms3.setEnabled(false);
                    cboxdoms4.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El horario de hornada completa \n"
                        + "solo se puede laborar 5 dias a la semana de"
                        + "\n 8 horas diasrias.");
                jcheckd.setSelected(false);
            }
        } else {
            cboxdom1.setEnabled(false);
            cboxdom2.setEnabled(false);
            cboxdom3.setEnabled(false);
            cboxdom4.setEnabled(false);
            cboxdoms1.setEnabled(false);
            cboxdoms2.setEnabled(false);
            cboxdoms3.setEnabled(false);
            cboxdoms4.setEnabled(false);

            cboxdom1.setSelectedItem("0");
            cboxdom2.setSelectedItem("0");
            cboxdom3.setSelectedItem("0");
            cboxdom4.setSelectedItem("0");
            cboxdoms1.setSelectedItem("0");
            cboxdoms2.setSelectedItem("0");
            cboxdoms3.setSelectedItem("0");
            cboxdoms4.setSelectedItem("0");
            lbldomtotal.setText("");
            dActivos--;
        }
        System.out.println(dActivos);
    }//GEN-LAST:event_jcheckdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jornada == "Jornada Parcial") {
            sumarHora1();
        }
        if (jornada == "Jornada Completa") {
            sumarHora1();
            sumarHora2();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxdom1;
    private javax.swing.JComboBox<String> cboxdom2;
    private javax.swing.JComboBox<String> cboxdom3;
    private javax.swing.JComboBox<String> cboxdom4;
    private javax.swing.JComboBox<String> cboxdoms1;
    private javax.swing.JComboBox<String> cboxdoms2;
    private javax.swing.JComboBox<String> cboxdoms3;
    private javax.swing.JComboBox<String> cboxdoms4;
    private javax.swing.JComboBox<String> cboxj1;
    private javax.swing.JComboBox<String> cboxj2;
    private javax.swing.JComboBox<String> cboxj3;
    private javax.swing.JComboBox<String> cboxj4;
    private javax.swing.JComboBox<String> cboxjs1;
    private javax.swing.JComboBox<String> cboxjs2;
    private javax.swing.JComboBox<String> cboxjs3;
    private javax.swing.JComboBox<String> cboxjs4;
    private javax.swing.JComboBox<String> cboxl1;
    private javax.swing.JComboBox<String> cboxl2;
    private javax.swing.JComboBox<String> cboxl3;
    private javax.swing.JComboBox<String> cboxl4;
    private javax.swing.JComboBox<String> cboxlmas1;
    private javax.swing.JComboBox<String> cboxlmas2;
    private javax.swing.JComboBox<String> cboxlmas3;
    private javax.swing.JComboBox<String> cboxlmas4;
    private javax.swing.JComboBox<String> cboxls1;
    private javax.swing.JComboBox<String> cboxls2;
    private javax.swing.JComboBox<String> cboxls3;
    private javax.swing.JComboBox<String> cboxls4;
    private javax.swing.JComboBox<String> cboxma1;
    private javax.swing.JComboBox<String> cboxma2;
    private javax.swing.JComboBox<String> cboxma3;
    private javax.swing.JComboBox<String> cboxma4;
    private javax.swing.JComboBox<String> cboxmi1;
    private javax.swing.JComboBox<String> cboxmi2;
    private javax.swing.JComboBox<String> cboxmi3;
    private javax.swing.JComboBox<String> cboxmi4;
    private javax.swing.JComboBox<String> cboxmis1;
    private javax.swing.JComboBox<String> cboxmis2;
    private javax.swing.JComboBox<String> cboxmis3;
    private javax.swing.JComboBox<String> cboxmis4;
    private javax.swing.JComboBox<String> cboxsa1;
    private javax.swing.JComboBox<String> cboxsa2;
    private javax.swing.JComboBox<String> cboxsa3;
    private javax.swing.JComboBox<String> cboxsa4;
    private javax.swing.JComboBox<String> cboxsas1;
    private javax.swing.JComboBox<String> cboxsas2;
    private javax.swing.JComboBox<String> cboxsas3;
    private javax.swing.JComboBox<String> cboxsas4;
    private javax.swing.JComboBox<String> cboxvi1;
    private javax.swing.JComboBox<String> cboxvi2;
    private javax.swing.JComboBox<String> cboxvi3;
    private javax.swing.JComboBox<String> cboxvi4;
    private javax.swing.JComboBox<String> cboxvis1;
    private javax.swing.JComboBox<String> cboxvis2;
    private javax.swing.JComboBox<String> cboxvis3;
    private javax.swing.JComboBox<String> cboxvis4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcheckd;
    private javax.swing.JCheckBox jcheckj;
    private javax.swing.JCheckBox jcheckl;
    private javax.swing.JCheckBox jcheckma;
    private javax.swing.JCheckBox jcheckmi;
    private javax.swing.JCheckBox jchecks;
    private javax.swing.JCheckBox jcheckv;
    private javax.swing.JSeparator jseparator;
    private javax.swing.JTextField lbldomtotal;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JLabel lblentrada2;
    private javax.swing.JLabel lblh21;
    private javax.swing.JLabel lblh22;
    private javax.swing.JLabel lbljornada;
    private javax.swing.JTextField lbljuetotal;
    private javax.swing.JTextField lbllunestotal;
    private javax.swing.JLabel lblm21;
    private javax.swing.JLabel lblm22;
    private javax.swing.JTextField lblmatotal;
    private javax.swing.JTextField lblmitotal;
    private javax.swing.JLabel lblsalida2;
    private javax.swing.JTextField lblsatotal;
    private javax.swing.JTextField lblsemtotal;
    private javax.swing.JTextField lblvietotal;
    // End of variables declaration//GEN-END:variables
}
