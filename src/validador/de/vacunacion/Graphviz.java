/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author deyvi
 */
public class Graphviz {
    
    // Método para generar el archivo DOT al ABB
    public void generarArchivoDOT(NodoArbolBinario raiz, String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            writer.write("digraph G {\n");
            if (raiz != null) {
                generarNodosDOT(raiz, writer);
                generarEnlacesDOT(raiz, writer);
            }
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generarNodosDOT(NodoArbolBinario nodo, BufferedWriter writer) throws IOException {
        if (nodo != null) {
            // Agregar el dato y el nombre en líneas separadas
            writer.write("  " + nodo.dpi + " [label=\"" + nodo.dpi + "\\n" + nodo.nombre + "\"];\n");
            generarNodosDOT(nodo.hijoizq, writer);
            generarNodosDOT(nodo.hijoder, writer);
        }
    }

    private void generarEnlacesDOT(NodoArbolBinario nodo, BufferedWriter writer) throws IOException {
        if (nodo != null) {
            if (nodo.hijoizq != null) {
                writer.write("  " + nodo.dpi + " -> " + nodo.hijoizq.dpi + ";\n");
                generarEnlacesDOT(nodo.hijoizq, writer);
            }
            if (nodo.hijoder != null) {
                writer.write("  " + nodo.dpi + " -> " + nodo.hijoder.dpi + ";\n");
                generarEnlacesDOT(nodo.hijoder, writer);
            }
        }
    }
    
    
    // Método para generar el archivo DOT al AVL
    public void generarArchivoDOT(NodoArbolAVL raiz, String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            writer.write("digraph G {\n");
            if (raiz != null) {
                generarNodosDOT(raiz, writer);
                generarEnlacesDOT(raiz, writer);
            }
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void generarNodosDOT(NodoArbolAVL nodo, BufferedWriter writer) throws IOException {
        if (nodo != null) {
            // Agregar el dato y el nombre en líneas separadas
            writer.write("  " + nodo.dpi + " [label=\"" + nodo.dpi + "\\n" + nodo.nombre + "\"];\n");
            generarNodosDOT(nodo.hijoIzq, writer);
            generarNodosDOT(nodo.hijoDer, writer);
        }
    }

    private void generarEnlacesDOT(NodoArbolAVL nodo, BufferedWriter writer) throws IOException {
        if (nodo != null) {
            if (nodo.hijoIzq != null) {
                writer.write("  " + nodo.dpi + " -> " + nodo.hijoIzq.dpi + ";\n");
                generarEnlacesDOT(nodo.hijoIzq, writer);
            }
            if (nodo.hijoDer != null) {
                writer.write("  " + nodo.dpi + " -> " + nodo.hijoDer.dpi + ";\n");
                generarEnlacesDOT(nodo.hijoDer, writer);
            }
        }
    }

    // Método para convertir el archivo DOT a una imagen usando Graphviz
    public boolean generarImagenDesdeDOT(String archivoDOT, String archivoPNG) {
        try {

            ProcessBuilder pb = new ProcessBuilder("Graphviz/Graphviz-11.0.0-win64/bin/dot.exe", "-Tpng", "-o", archivoPNG, archivoDOT);
            pb.redirectErrorStream(true);
            pb.start().waitFor();
            return true;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
