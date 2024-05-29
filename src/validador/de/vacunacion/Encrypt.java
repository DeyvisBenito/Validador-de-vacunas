/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

/**
 *
 * @author deyvi
 */
public class Encrypt {

    private static final String CHAR_LIST
            = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
            + "ÁÉÍÓÚáéíóúÑñÜü";

    public Encrypt() {

    }

    public static String encriptar(String text, int shift) {
        if (text != null && !"null".equals(text)) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isDigit(ch)) {
                    // Manejar encriptación para dígitos
                    char base = '0';
                    ch = (char) ((ch - base + shift) % 10 + base);
                    result.append(ch);
                } else {
                    int index = CHAR_LIST.indexOf(ch);
                    if (index != -1) {
                        int shiftedIndex = (index + shift) % CHAR_LIST.length();
                        result.append(CHAR_LIST.charAt(shiftedIndex));
                    } else {
                        result.append(ch);
                    }
                }
            }
            return result.toString();
        } else {
            return null;
        }
    }

    public static String desencriptar(String text, int shift) {
        if (text != null && !"null".equals(text)) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isDigit(ch)) {
                    // Manejar desencriptación para dígitos
                    char base = '0';
                    ch = (char) ((ch - base - shift + 10) % 10 + base);
                    result.append(ch);
                } else {
                    int index = CHAR_LIST.indexOf(ch);
                    if (index != -1) {
                        int shiftedIndex = (index - shift + CHAR_LIST.length()) % CHAR_LIST.length();
                        result.append(CHAR_LIST.charAt(shiftedIndex));
                    } else {
                        result.append(ch);
                    }
                }
            }
            return result.toString();
        } else {
            return null;
        }
    }
    
    
}
