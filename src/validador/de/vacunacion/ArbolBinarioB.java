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
    
    
    public ArbolBinarioB(){
        if(this.raiz==null){
            raiz = null;
        }
    }
    
    //Metodo para insertar un nodo en el arbol
    public void AgregarNodo(String nom, long dpi){
        NodoArbolBinario nuevo=new NodoArbolBinario(nom, dpi);
        if(raiz==null){
            raiz=nuevo;
        }else{
            NodoArbolBinario aux=raiz;
            NodoArbolBinario padre;
            
            while(true){
                padre=aux;
                
                if(dpi<aux.dpi){
                    aux=aux.hijoizq;
                    if(aux==null){
                        padre.hijoizq=nuevo;
                        return;
                    }
                }else{
                    aux=aux.hijoder;
                    if(aux==null){
                        padre.hijoder=nuevo;
                        return;
                    }
                }
            }
        }  
    }
    
    public boolean estaVacio(){
        return raiz==null;
    }
    
    public void inOrden(NodoArbolBinario r, JTextArea inscritos){
        if(r!=null){
            inOrden(r.hijoizq, inscritos);
            inscritos.append(r.nombre + "  " + r.dpi + "\n");
            System.out.println(r.nombre + "  " + r.dpi);
            inOrden(r.hijoder, inscritos);
        }
        
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
                r.fecV3
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
                r.fecV3
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
                r.fecV3
            });
        }
    }
    
    //Metodo de busca de un Nodo
    public NodoArbolBinario buscarNodo(long dpi){
        NodoArbolBinario aux=raiz;
        while(aux.dpi!=dpi){
            if(dpi<aux.dpi){
                aux=aux.hijoizq;
            }else{
                aux=aux.hijoder;
            }
            if(aux==null){
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
                
                NodoArbolBinario nodoActualizar=buscarNodo(dpi);
                
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
    public boolean EliminarNodo(long dpi){
        NodoArbolBinario auxiliar = raiz;
        NodoArbolBinario padre = raiz;
        boolean EsHijoIzq = true;
        
        while(auxiliar.dpi != dpi){
            padre = auxiliar;
            if (dpi<auxiliar.dpi){
                EsHijoIzq = true;
                auxiliar = auxiliar.hijoizq;
            }else{
                EsHijoIzq = false;
                auxiliar = auxiliar.hijoder;
            }
            if (auxiliar ==null){
                return false; //nunca lo encontro
            }
        }//fin del while
        
        if(auxiliar.hijoizq==null && auxiliar.hijoder==null){//Si es una HOja o solo la raiz
            if(auxiliar==raiz){
                raiz = null; //el nodo a eliminar es la raiz y apuntamos a null
            }else if(EsHijoIzq){
                padre.hijoizq = null;
            }else{
                padre.hijoder = null;
            }
        }else if(auxiliar.hijoder==null){
            if(auxiliar==raiz){
                raiz = auxiliar.hijoizq;
            }else if(EsHijoIzq){
                padre.hijoizq = auxiliar.hijoizq;
            }else{
                padre.hijoder = auxiliar.hijoizq;
            }
        }else if (auxiliar.hijoizq == null){
            if(auxiliar==raiz){
                raiz = auxiliar.hijoder;
            }else if(EsHijoIzq){
                padre.hijoizq = auxiliar.hijoder;
            }else{
                padre.hijoder = auxiliar.hijoder;
            }
        }else{
            NodoArbolBinario reemplazo = ObtenerNodoReemplazo(auxiliar);
            if (auxiliar == raiz){
                raiz = reemplazo;
            }else if(EsHijoIzq){
                padre.hijoizq = reemplazo;
            }else{
                padre.hijoder = reemplazo;
            }
            reemplazo.hijoizq = auxiliar.hijoizq;
        }
        return true;
    }
    
    public NodoArbolBinario ObtenerNodoReemplazo(NodoArbolBinario nodoreemp){
        NodoArbolBinario reemplazopadre = nodoreemp;
        NodoArbolBinario reemplazo = nodoreemp;
        NodoArbolBinario auxiliar = nodoreemp.hijoder;
        
        while(auxiliar != null){
            reemplazopadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoizq;
        }
        if (reemplazo != nodoreemp.hijoder){
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

            // Agregar el nombre y DPI del nodo al StringBuilder
            sb.append(r.nombre).append("").append(r.dpi).append("\n");
            
            obtenerRegistrosInOrden(r.hijoder, sb);
        }
    }
}
    

    

