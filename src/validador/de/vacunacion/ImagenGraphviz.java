/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author deyvi
 */
public class ImagenGraphviz {
    
    public static void cargarImagen(JLabel label, String rutaImagen) {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(rutaImagen));
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            Image imagenRedimensionada = imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(imagenRedimensionada));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
