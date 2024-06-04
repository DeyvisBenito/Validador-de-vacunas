/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author deyvi
 */
public class GraficaAVL extends JPanel{
    
    private ArbolAVL arbolAVL;
    public static final int diametro = 50;
    public static final int radio = diametro / 2;
    public static final int ancho = 50;

    public void setArbol(ArbolAVL arbol) {
        this.arbolAVL = arbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        pintar(g, getWidth() / 2, 20, arbolAVL.raizAVL);
    }

    public void pintar(Graphics g, int x, int y, NodoArbolAVL r) {
        if (r != null) {
            int espacio = arbolAVL.nodosCompletos(r) * ancho/ 2;
            
            g.setColor(Color.BLACK);
            g.drawOval(x, y, diametro, diametro);
            
            g.setColor(Color.BLUE);
            g.setFont(new Font("Serif", Font.BOLD, 12));
            g.drawString(String.valueOf(r.dpi).toString(), x+5, y + 18);
            
            g.setColor(new Color(128, 0, 128));
            g.setFont(new Font("Serif", Font.ITALIC, 12));
            g.drawString(r.nombre.toString(), x-25, y + 30);

            if (r.hijoIzq != null) {
                g.setColor(new Color(0, 100, 0));
                g.drawLine(x, y + radio, x + radio - ancho - espacio, y + ancho);
            } 
            
            if (r.hijoDer != null) {
                g.setColor(new Color(0, 100, 0));
                g.drawLine(x + diametro, y + radio, x + radio + ancho + espacio, y + ancho);
            }

            pintar(g, x - ancho - espacio, y + ancho, r.hijoIzq);
            pintar(g, x + ancho + espacio, y + ancho, r.hijoDer);

        }
    }
    
}
