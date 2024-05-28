/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validador.de.vacunacion.Ventanas.ArbolBinarioBJF;

/**
 *
 * @author deyvi
 */
public class Conexion {

    ArbolBinarioB arbol = new ArbolBinarioB();
    ArbolAVL arbolAVL = new ArbolAVL();
    ArbolBinarioBJF arbolBVentana = new ArbolBinarioBJF();

    public Conexion() {

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
            long parar = 0;
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while (parar < cant) {
                linea = bf.readLine();

                if (linea == null) {
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
                parar = parar + 1;
            }

            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }
    
    //Cargar ambos arboles con archivo personalizado
    public void cargarTxtpersonalizado(String direccion) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while ((linea = bf.readLine()) != null) {

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {
                    ArbolAVL arbolAVL = new ArbolAVL();
                    ArbolBinarioB arbolABB= new ArbolBinarioB();
                    try {
                        long dpi = Long.parseLong(campos[1]);
                        arbolAVL.insertar(campos[0], dpi);
                        arbolABB.AgregarNodo(campos[0], dpi);
                        NodoArbolAVL agregar = arbolAVL.buscarNodo(dpi, arbolAVL.raizAVL);
                        NodoArbolBinario agregarABB=arbolABB.buscarNodo(dpi);
                        if (agregar != null && agregarABB!=null) {
                            agregar.cantDosis = Integer.parseInt(campos[2]);
                            agregar.fecV1 = campos[3];
                            agregar.fecV2 = campos[4];
                            agregar.fecV3 = campos[5];
                            agregar.lugarV = campos[6];
                            agregar.depa = campos[7];
                            agregar.muni = campos[8];
                            
                            agregarABB.cantDosis = Integer.parseInt(campos[2]);
                            agregarABB.fecV1 = campos[3];
                            agregarABB.fecV2 = campos[4];
                            agregarABB.fecV3 = campos[5];
                            agregarABB.lugarV = campos[6];
                            agregarABB.depa = campos[7];
                            agregarABB.muni = campos[8];
                        } else {
                            JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("DPI no valido en el registro: " + linea);
                    }

                }

            }
            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    public void cargarTxtpersonalizado(String direccion, long cant) {
        try {
            long parar = 0;
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while (parar < cant) {
                linea = bf.readLine();

                if (linea == null) {
                    JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
                    return;
                }

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {
                    ArbolAVL arbolAVL = new ArbolAVL();
                    ArbolBinarioB arbolABB=new ArbolBinarioB();
                    try {
                        long dpi = Long.parseLong(campos[1]);
                        arbolAVL.insertar(campos[0], dpi);
                        arbolABB.AgregarNodo(campos[0], dpi);
                        NodoArbolAVL agregar = arbolAVL.buscarNodo(dpi, arbolAVL.raizAVL);
                        NodoArbolBinario agregarABB=arbolABB.buscarNodo(dpi);
                        if (agregar != null) {
                            agregar.cantDosis = Integer.parseInt(campos[2]);
                            agregar.fecV1 = campos[3];
                            agregar.fecV2 = campos[4];
                            agregar.fecV3 = campos[5];
                            agregar.lugarV = campos[6];
                            agregar.depa = campos[7];
                            agregar.muni = campos[8];
                            
                            agregarABB.cantDosis = Integer.parseInt(campos[2]);
                            agregarABB.fecV1 = campos[3];
                            agregarABB.fecV2 = campos[4];
                            agregarABB.fecV3 = campos[5];
                            agregarABB.lugarV = campos[6];
                            agregarABB.depa = campos[7];
                            agregarABB.muni = campos[8];
                        } else {
                            JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("DPI no valido en el registro: " + linea);
                    }

                }
                parar = parar + 1;
            }

            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    //Cargar solo a ABB
    public void cargarTxtABB(String direccion) {
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

                } catch (NumberFormatException e) {
                    System.out.println("DPI no valido en el registro: " + linea);
                }
            }

            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    public void cargarTxtABB(String direccion, long cant) {
        try {
            long parar = 0;
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while (parar < cant) {
                linea = bf.readLine();

                if (linea == null) {
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

                } catch (NumberFormatException e) {
                    System.out.println("DPI no valido en el registro: " + linea);
                }
                parar = parar + 1;
            }

            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    //Cargar solo a AVL
    public void cargarTxtAVL(String direccion) {
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

    public void cargarTxtAVL(String direccion, long cant) {
        try {
            long parar = 0;
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while (parar < cant) {
                linea = bf.readLine();

                if (linea == null) {
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
                    arbolAVL.insertar(nombre, dpi);

                } catch (NumberFormatException e) {
                    System.out.println("DPI no valido en el registro: " + linea);
                }
                parar = parar + 1;
            }

            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    //Cargar solo a ABB Personalizado
    public void cargarTxtABBPersonalizado(String direccion) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while ((linea = bf.readLine()) != null) {

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {
                    ArbolBinarioB arbolABB = new ArbolBinarioB();
                    try {
                        long dpi = Long.parseLong(campos[1]);
                        arbolABB.AgregarNodo(campos[0], dpi);
                        NodoArbolBinario agregar = arbolABB.buscarNodo(dpi);
                        if (agregar != null) {
                            agregar.cantDosis = Integer.parseInt(campos[2]);
                            agregar.fecV1 = campos[3];
                            agregar.fecV2 = campos[4];
                            agregar.fecV3 = campos[5];
                            agregar.lugarV = campos[6];
                            agregar.depa = campos[7];
                            agregar.muni = campos[8];
                        } else {
                            JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("DPI no valido en el registro: " + linea);
                    }

                }

            }
            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    public void cargarTxtABBPersonalizado(String direccion, long cant) {
        try {
            long parar = 0;
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while (parar < cant) {
                linea = bf.readLine();

                if (linea == null) {
                    JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
                    return;
                }

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {
                    ArbolBinarioB arbolABB = new ArbolBinarioB();
                    try {
                        long dpi = Long.parseLong(campos[1]);
                        arbolABB.AgregarNodo(campos[0], dpi);
                        NodoArbolBinario agregar = arbolABB.buscarNodo(dpi);
                        if (agregar != null) {
                            agregar.cantDosis = Integer.parseInt(campos[2]);
                            agregar.fecV1 = campos[3];
                            agregar.fecV2 = campos[4];
                            agregar.fecV3 = campos[5];
                            agregar.lugarV = campos[6];
                            agregar.depa = campos[7];
                            agregar.muni = campos[8];
                        } else {
                            JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("DPI no valido en el registro: " + linea);
                    }

                }
                parar = parar + 1;
            }

            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }
    
    //Cargar solo a AVL Personalizado
    public void cargarTxtAVLPersonalizado(String direccion) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while ((linea = bf.readLine()) != null) {

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {
                    ArbolAVL arbolAVL = new ArbolAVL();
                    try {
                        long dpi = Long.parseLong(campos[1]);
                        arbolAVL.insertar(campos[0], dpi);
                        NodoArbolAVL agregar = arbolAVL.buscarNodo(dpi, arbolAVL.raizAVL);
                        if (agregar != null) {
                            agregar.cantDosis = Integer.parseInt(campos[2]);
                            agregar.fecV1 = campos[3];
                            agregar.fecV2 = campos[4];
                            agregar.fecV3 = campos[5];
                            agregar.lugarV = campos[6];
                            agregar.depa = campos[7];
                            agregar.muni = campos[8];
                        } else {
                            JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("DPI no valido en el registro: " + linea);
                    }

                }

            }
            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    public void cargarTxtAVLPersonalizado(String direccion, long cant) {
        try {
            long parar = 0;
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String linea;
            while (parar < cant) {
                linea = bf.readLine();

                if (linea == null) {
                    JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
                    return;
                }

                String[] campos = linea.split("\\|");
                if (campos.length == 9) {
                    ArbolAVL arbolAVL = new ArbolAVL();
                    try {
                        long dpi = Long.parseLong(campos[1]);
                        arbolAVL.insertar(campos[0], dpi);
                        NodoArbolAVL agregar = arbolAVL.buscarNodo(dpi, arbolAVL.raizAVL);
                        if (agregar != null) {
                            agregar.cantDosis = Integer.parseInt(campos[2]);
                            agregar.fecV1 = campos[3];
                            agregar.fecV2 = campos[4];
                            agregar.fecV3 = campos[5];
                            agregar.lugarV = campos[6];
                            agregar.depa = campos[7];
                            agregar.muni = campos[8];
                        } else {
                            JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("DPI no valido en el registro: " + linea);
                    }

                }
                parar = parar + 1;
            }

            JOptionPane.showMessageDialog(null, "Inscripciones procesadas correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron procesar las inscripciones");
        }
    }

    public boolean guardarABBTXT(NodoArbolBinario raiz, String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            // Obtener arbol InOrden
            String registro = arbol.obtenerInOrden(raiz);

            // Escribir el registro
            writer.write(registro);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean guardarAVLTXT(NodoArbolAVL raiz, String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            // Obtener arbol InOrden
            String registro = arbolAVL.obtenerInOrden(raiz);

            // Escribir el registro
            writer.write(registro);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
