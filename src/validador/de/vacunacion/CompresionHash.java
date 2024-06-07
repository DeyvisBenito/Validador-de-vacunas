/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author deyvi
 */
public class CompresionHash {

    private HashMap<String, NodoArbolBinario> tablaHashABB;
    private HashMap<String, NodoArbolAVL> tablaHashAVL;

    public CompresionHash() {
        this.tablaHashABB = new HashMap<>();
        this.tablaHashAVL = new HashMap<>();
    
    }

    public void guardarRegistros(NodoArbolBinario raiz) {
        if (raiz != null) {
            tablaHashABB.put(String.valueOf(raiz.dpi), raiz);
            guardarRegistros(raiz.hijoizq);
            guardarRegistros(raiz.hijoder);
        }

    }

    // Método para escribir los datos de la tabla hash en un archivo de texto
    public boolean guardartxt(String rutaArchivo) {
        try {
            String tablaHashTxt = "TablasHash/TablaHashABB.txt";
            FileWriter writer = new FileWriter(rutaArchivo);
            for (String clave : tablaHashABB.keySet()) {
                writer.write(clave + "\n");
            }
            FileWriter writer2 = new FileWriter(tablaHashTxt);
            for (String clave : tablaHashABB.keySet()) {
                NodoArbolBinario nodo = tablaHashABB.get(clave);
                StringBuilder sb = new StringBuilder();
                sb.append(nodo.nombre).append("|").append(nodo.dpi).append("|").append(nodo.cantDosis).append("|")
                        .append(nodo.fecV1).append("|").append(nodo.fecV2).append("|").append(nodo.fecV3).append("|")
                        .append(nodo.lugarV).append("|").append(nodo.depa).append("|").append(nodo.muni).append("\n");
                writer2.write(sb.toString());
            }
            writer.close();
            writer2.close();
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    public void cargarTablaHash(String rutaArchivo) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = bf.readLine()) != null) {

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {

                    try {
                        NodoArbolBinario NodoarbolABB = new NodoArbolBinario();
                        NodoarbolABB.dpi = Long.parseLong(campos[1]);
                        NodoarbolABB.nombre = campos[0];
                        NodoarbolABB.cantDosis = Integer.parseInt(campos[2]);
                        NodoarbolABB.fecV1 = campos[3];
                        NodoarbolABB.fecV2 = campos[4];
                        NodoarbolABB.fecV3 = campos[5];
                        NodoarbolABB.lugarV = campos[6];
                        NodoarbolABB.depa = campos[7];
                        NodoarbolABB.muni = campos[8];

                        tablaHashABB.put(String.valueOf(NodoarbolABB.dpi), NodoarbolABB);

                    } catch (NumberFormatException e) {
                        
                    }

                }

            }
        } catch (IOException e) {

        }
    }

    public void cargarTxtComprimido(String rutaArchivo) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            ArbolBinarioB arbolBB = new ArbolBinarioB();
            while ((linea = bf.readLine()) != null) {
                NodoArbolBinario nodo = tablaHashABB.get(linea);
                arbolBB.AgregarNodo(nodo.nombre, nodo.dpi);
                NodoArbolBinario agregar = arbolBB.buscarNodo(nodo.dpi);
                agregar.cantDosis = nodo.cantDosis;
                agregar.fecV1 = nodo.fecV1;
                agregar.fecV2 = nodo.fecV2;
                agregar.fecV3 = nodo.fecV3;
                agregar.lugarV = nodo.lugarV;
                agregar.depa = nodo.depa;
                agregar.muni = nodo.muni;

            }
            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");

        } catch (IOException e) {

        }
    }
    
    
    public void guardarRegistros(NodoArbolAVL raiz) {
        if (raiz != null) {
            tablaHashAVL.put(String.valueOf(raiz.dpi), raiz);
            guardarRegistros(raiz.hijoIzq);
            guardarRegistros(raiz.hijoDer);
        }

    }

    // Método para escribir los datos de la tabla hash en un archivo de texto
    public boolean guardartxtAVL(String rutaArchivo) {
        try {
            String tablaHashTxt = "TablasHash/TablaHashAVL.txt";
            FileWriter writer = new FileWriter(rutaArchivo);
            for (String clave : tablaHashAVL.keySet()) {
                writer.write(clave + "\n");
            }
            FileWriter writer2 = new FileWriter(tablaHashTxt);
            for (String clave : tablaHashAVL.keySet()) {
                NodoArbolAVL nodo = tablaHashAVL.get(clave);
                StringBuilder sb = new StringBuilder();
                sb.append(nodo.nombre).append("|").append(nodo.dpi).append("|").append(nodo.cantDosis).append("|")
                        .append(nodo.fecV1).append("|").append(nodo.fecV2).append("|").append(nodo.fecV3).append("|")
                        .append(nodo.lugarV).append("|").append(nodo.depa).append("|").append(nodo.muni).append("\n");
                writer2.write(sb.toString());
            }
            writer.close();
            writer2.close();
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    public void cargarTablaHashAVL(String rutaArchivo) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = bf.readLine()) != null) {

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {

                    try {
                        NodoArbolAVL Nodo = new NodoArbolAVL();
                        Nodo.dpi = Long.parseLong(campos[1]);
                        Nodo.nombre = campos[0];
                        Nodo.cantDosis = Integer.parseInt(campos[2]);
                        Nodo.fecV1 = campos[3];
                        Nodo.fecV2 = campos[4];
                        Nodo.fecV3 = campos[5];
                        Nodo.lugarV = campos[6];
                        Nodo.depa = campos[7];
                        Nodo.muni = campos[8];
                        Nodo.fe=0;

                        tablaHashAVL.put(String.valueOf(Nodo.dpi), Nodo);

                    } catch (NumberFormatException e) {
                        
                    }

                }

            }
        } catch (IOException e) {

        }
    }

    public void cargarTxtComprimidoAVL(String rutaArchivo) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            ArbolAVL arbol = new ArbolAVL();
            while ((linea = bf.readLine()) != null) {
                NodoArbolAVL nodo = tablaHashAVL.get(linea);
                arbol.insertar(nodo.nombre, nodo.dpi);
                NodoArbolAVL agregar = arbol.buscarNodo(nodo.dpi, arbol.raizAVL);
                agregar.cantDosis = nodo.cantDosis;
                agregar.fecV1 = nodo.fecV1;
                agregar.fecV2 = nodo.fecV2;
                agregar.fecV3 = nodo.fecV3;
                agregar.lugarV = nodo.lugarV;
                agregar.depa = nodo.depa;
                agregar.muni = nodo.muni;

            }
            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");

        } catch (IOException e) {

        }
    }
}
