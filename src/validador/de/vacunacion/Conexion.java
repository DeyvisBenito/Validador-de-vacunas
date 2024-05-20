/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author deyvi
 */
public class Conexion {
    
    ArbolBinarioB arbol=new ArbolBinarioB();
    ArbolAVL arbolAVL= new ArbolAVL();
    
    public Conexion(){
        
    }
    
    public void cargarTxt(String direccion) {
    try {
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String linea;
        while ((linea = bf.readLine()) != null) {
            String dpis = "";
            String nombre = "";
            boolean separacion = false;

            for (int i = linea.length() - 1; i >= 0; i--) {
                char caracter = linea.charAt(i);
                if ((caracter == ' ' || caracter == '\t') && !separacion) {
                    separacion = true;
                }
                if (!separacion) {
                    dpis = caracter + dpis;
                } else {
                    nombre = caracter + nombre;
                }
            }

            try {
                long dpi = Long.parseLong(dpis.trim());
                arbol.AgregarNodo(nombre, dpi);
                arbolAVL.insertar(nombre, dpi);

                    
                } catch (NumberFormatException e) {
                    System.out.println("DPI no valido en el registro: " + linea);
                }
        }
        
        JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
    }
}
    
    
    public void cargarTxt(String direccion, long cant) {
    try {
        long parar=0;
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String linea;
        while (parar<cant) {
            linea = bf.readLine();
            
            if(linea==null){
                JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
                return;
            }
            
            String dpis = "";
            String nombre = "";
            boolean separacion = false;

            for (int i = linea.length() - 1; i >= 0; i--) {
                char caracter = linea.charAt(i);
                if ((caracter == ' ' || caracter == '\t') && !separacion) {
                    separacion = true;
                }
                if (!separacion) {
                    dpis = caracter + dpis;
                } else {
                    nombre = caracter + nombre;
                }
            }

            try {
                long dpi = Long.parseLong(dpis.trim());
                arbol.AgregarNodo(nombre, dpi);
                arbolAVL.insertar(nombre, dpi);
                    
                } catch (NumberFormatException e) {
                    System.out.println("DPI no valido en el registro: " + linea);
                }
            parar=parar+1;
        }
        
        JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
    }
}
    
    
}
