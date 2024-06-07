/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deyvi
 */
public class ArbolBinarioB {

    public static NodoArbolBinario raiz;

    public ArbolBinarioB() {
        if (this.raiz == null) {
            raiz = null;
        }
    }

    //Metodo para insertar un nodo en el arbol
    public void AgregarNodo(String nom, long dpi) {
        NodoArbolBinario nuevo = new NodoArbolBinario(nom, dpi);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbolBinario aux = raiz;
            NodoArbolBinario padre;

            while (true) {
                padre = aux;

                if (dpi < aux.dpi) {
                    aux = aux.hijoizq;
                    if (aux == null) {
                        padre.hijoizq = nuevo;
                        return;
                    }
                } else {
                    aux = aux.hijoder;
                    if (aux == null) {
                        padre.hijoder = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    // Método de recorrido en preorden que acepta el modelo de la tabla
    public void inOrden(NodoArbolBinario r, DefaultTableModel modelo) {
        if (r != null) {

            inOrden(r.hijoizq, modelo);
            // Agregar el nodo actual al modelo de la tabla
            modelo.addRow(new Object[]{
                r.nombre,
                r.dpi,
                r.cantDosis,
                r.fecV1,
                r.fecV2,
                r.fecV3,
                r.lugarV,
                r.depa,
                r.muni
            });
            inOrden(r.hijoder, modelo);
        }
    }

    // Método de recorrido en preorden que acepta el modelo de la tabla
    public void PreOrden(NodoArbolBinario r, DefaultTableModel modelo) {
        if (r != null) {
            // Agregar el nodo actual al modelo de la tabla
            modelo.addRow(new Object[]{
                r.nombre,
                r.dpi,
                r.cantDosis,
                r.fecV1,
                r.fecV2,
                r.fecV3,
                r.lugarV,
                r.depa,
                r.muni
            });

            PreOrden(r.hijoizq, modelo);
            PreOrden(r.hijoder, modelo);
        }
    }

    // Método de recorrido en preorden que acepta el modelo de la tabla
    public void PostOrden(NodoArbolBinario r, DefaultTableModel modelo) {
        if (r != null) {
            PostOrden(r.hijoizq, modelo);
            PostOrden(r.hijoder, modelo);

            // Agregar el nodo actual al modelo de la tabla
            modelo.addRow(new Object[]{
                r.nombre,
                r.dpi,
                r.cantDosis,
                r.fecV1,
                r.fecV2,
                r.fecV3,
                r.lugarV,
                r.depa,
                r.muni
            });
        }
    }

    //Metodo de busca de un Nodo
    public NodoArbolBinario buscarNodo(long dpi) {
        NodoArbolBinario aux = raiz;
        while (aux.dpi != dpi) {
            if (dpi < aux.dpi) {
                aux = aux.hijoizq;
            } else {
                aux = aux.hijoder;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    // Método para actualizar nodo
    public boolean actualizarNodo(String nom, long dpi, int cant, String v1, String v2, String v3, String lugar, String depa, String muni, long dpiBusc) {
        // Buscar el nodo con el dpiBusc
        NodoArbolBinario nodoAct = buscarNodo(dpiBusc);

        if (nodoAct != null) {
            // Si el dpi es diferente al dpiBusc, elimina el nodo antiguo y reinserta el nodo actualizado
            if (dpi != dpiBusc) {
                EliminarNodo(dpiBusc);
                NodoArbolBinario nuevoNodo = new NodoArbolBinario(nom, dpi);
                AgregarNodo(nuevoNodo.nombre, nuevoNodo.dpi);

                NodoArbolBinario nodoActualizar = buscarNodo(dpi);

                nodoActualizar.cantDosis = cant;
                nodoActualizar.fecV1 = v1;
                nodoActualizar.fecV2 = v2;
                nodoActualizar.fecV3 = v3;
                nodoActualizar.lugarV = lugar;
                nodoActualizar.depa = depa;
                nodoActualizar.muni = muni;

            } else {
                // Si el dpi no cambia, simplemente actualiza los valores del nodo existente
                nodoAct.nombre = nom;
                nodoAct.dpi = dpi;
                nodoAct.cantDosis = cant;
                nodoAct.fecV1 = v1;
                nodoAct.fecV2 = v2;
                nodoAct.fecV3 = v3;
                nodoAct.lugarV = lugar;
                nodoAct.depa = depa;
                nodoAct.muni = muni;
            }
            return true;
        } else {
            return false;
        }
    }

    //Metodo para eliminar un Nodo del ARbol
    public boolean EliminarNodo(long dpi) {
        NodoArbolBinario auxiliar = raiz;
        NodoArbolBinario padre = raiz;
        boolean EsHijoIzq = true;

        while (auxiliar.dpi != dpi) {
            padre = auxiliar;
            if (dpi < auxiliar.dpi) {
                EsHijoIzq = true;
                auxiliar = auxiliar.hijoizq;
            } else {
                EsHijoIzq = false;
                auxiliar = auxiliar.hijoder;
            }
            if (auxiliar == null) {
                return false; //nunca lo encontro
            }
        }//fin del while

        if (auxiliar.hijoizq == null && auxiliar.hijoder == null) {//Si es una HOja o solo la raiz
            if (auxiliar == raiz) {
                raiz = null; //el nodo a eliminar es la raiz y apuntamos a null
            } else if (EsHijoIzq) {
                padre.hijoizq = null;
            } else {
                padre.hijoder = null;
            }
        } else if (auxiliar.hijoder == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoizq;
            } else if (EsHijoIzq) {
                padre.hijoizq = auxiliar.hijoizq;
            } else {
                padre.hijoder = auxiliar.hijoizq;
            }
        } else if (auxiliar.hijoizq == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoder;
            } else if (EsHijoIzq) {
                padre.hijoizq = auxiliar.hijoder;
            } else {
                padre.hijoder = auxiliar.hijoder;
            }
        } else {
            NodoArbolBinario reemplazo = ObtenerNodoReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (EsHijoIzq) {
                padre.hijoizq = reemplazo;
            } else {
                padre.hijoder = reemplazo;
            }
            reemplazo.hijoizq = auxiliar.hijoizq;
        }
        return true;
    }

    public NodoArbolBinario ObtenerNodoReemplazo(NodoArbolBinario nodoreemp) {
        NodoArbolBinario reemplazopadre = nodoreemp;
        NodoArbolBinario reemplazo = nodoreemp;
        NodoArbolBinario auxiliar = nodoreemp.hijoder;

        while (auxiliar != null) {
            reemplazopadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoizq;
        }
        if (reemplazo != nodoreemp.hijoder) {
            reemplazopadre.hijoizq = reemplazo.hijoder;
            reemplazo.hijoder = nodoreemp.hijoder;
        }
        return reemplazo;
    }

    // Método para obtener la representación InOrden del árbol
    public String obtenerInOrden(NodoArbolBinario r) {
        StringBuilder sb = new StringBuilder();
        obtenerRegistrosInOrden(r, sb);
        return sb.toString();
    }

    private void obtenerRegistrosInOrden(NodoArbolBinario r, StringBuilder sb) {
        if (r != null) {
            obtenerRegistrosInOrden(r.hijoizq, sb);

            // Agregar datos del nodo al StringBuilder
            sb.append(r.nombre).append("|").append(r.dpi).append("|").append(r.cantDosis).append("|")
                    .append(r.fecV1).append("|").append(r.fecV2).append("|").append(r.fecV3).append("|")
                    .append(r.lugarV).append("|").append(r.depa).append("|").append(r.muni).append("\n");

            obtenerRegistrosInOrden(r.hijoder, sb);
        }
    }

    public void encriptarABB(NodoArbolBinario r, int desp) {
        Encrypt encr = new Encrypt();
        if (r != null) {
            r.nombre = encr.encriptar(r.nombre, desp);
            r.dpi = Long.parseLong(encr.encriptar(String.valueOf(r.dpi), desp));
            r.cantDosis = Integer.parseInt(encr.encriptar(String.valueOf(r.cantDosis), desp));
            r.fecV1 = encr.encriptar(r.fecV1, desp);
            r.fecV2 = encr.encriptar(r.fecV2, desp);
            r.fecV3 = encr.encriptar(r.fecV3, desp);
            r.lugarV = encr.encriptar(r.lugarV, desp);
            r.depa = encr.encriptar(r.depa, desp);
            r.muni = encr.encriptar(r.muni, desp);

            encriptarABB(r.hijoizq, desp);
            encriptarABB(r.hijoder, desp);
        }
    }

    public void desencriptarABB(NodoArbolBinario r, int desp) {
        Encrypt encr = new Encrypt();
        if (r != null) {
            r.nombre = encr.desencriptar(r.nombre, desp);
            r.dpi = Long.parseLong(encr.desencriptar(String.valueOf(r.dpi), desp));
            r.cantDosis = Integer.parseInt(encr.desencriptar(String.valueOf(r.cantDosis), desp));
            r.fecV1 = encr.desencriptar(r.fecV1, desp);
            r.fecV2 = encr.desencriptar(r.fecV2, desp);
            r.fecV3 = encr.desencriptar(r.fecV3, desp);
            r.lugarV = encr.desencriptar(r.lugarV, desp);
            r.depa = encr.desencriptar(r.depa, desp);
            r.muni = encr.desencriptar(r.muni, desp);

            desencriptarABB(r.hijoizq, desp);
            desencriptarABB(r.hijoder, desp);
        }
    }

    public int nodosCompletos(NodoArbolBinario subArbol) {
        if (subArbol == null) {
            return 0;
        } else {
            if (subArbol.hijoizq != null && subArbol.hijoder != null) {
                return nodosCompletos(subArbol.hijoizq) + nodosCompletos(subArbol.hijoder) + 1;
            }
            return nodosCompletos(subArbol.hijoizq) + nodosCompletos(subArbol.hijoder);
        }
    }

}
