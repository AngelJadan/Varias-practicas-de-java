/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Angel
 */
public class Imagenes extends DefaultTableCellRenderer{
     public Component getTableCellRendererComponent(JTable table, Object o, boolean bnl, boolean blnl, int i, int il) {
         if (o instanceof JLabel){
            JLabel lblImagen = (JLabel)o;
            return lblImagen;
         }
        return super.getTableCellRendererComponent(table, o, bnl, blnl, i, il);
    }   
}
