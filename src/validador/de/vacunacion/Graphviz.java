/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author deyvi
 */
public class Graphviz extends JPanel {

    private ArbolBinarioB arbolABB;
    public static final int diametro = 50;
    public static final int radio = diametro / 2;
    public static final int ancho = 50;

    public void setArbol(ArbolBinarioB arbol) {
        this.arbolABB = arbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        pintar(g, getWidth() / 2, 20, arbolABB.raiz);
    }

    public void pintar(Graphics g, int x, int y, NodoArbolBinario r) {
        if (r != null) {
            int espacio = arbolABB.nodosCompletos(r) * ancho / 2;
            g.setColor(Color.BLACK);
            g.drawOval(x, y, diametro, diametro);

            g.setColor(Color.BLUE);
            g.setFont(new Font("Serif", Font.BOLD, 12));
            g.drawString(String.valueOf(r.dpi).toString(), x + 5, y + 18);

            g.setColor(new Color(128, 0, 128));
            g.setFont(new Font("Serif", Font.ITALIC, 12));
            g.drawString(r.nombre.toString(), x - 25, y + 30);

            if (r.hijoizq != null) {
                g.setColor(new Color(0, 100, 0));
                g.drawLine(x, y + radio, x + radio - ancho - espacio, y + ancho);
            }

            if (r.hijoder != null) {
                g.setColor(new Color(0, 100, 0));
                g.drawLine(x + diametro, y + radio, x + radio + ancho + espacio, y + ancho);
            }

            pintar(g, x - ancho - espacio, y + ancho, r.hijoizq);
            pintar(g, x + ancho + espacio, y + ancho, r.hijoder);

        }
    }

}
