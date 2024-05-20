/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

import javax.swing.JTextArea;

/**
 *
 * @author deyvi
 */
public class ArbolAVL {
    
    
    
    static NodoArbolAVL raizAVL;
    
    public ArbolAVL(){
        if(this.raizAVL==null){
            this.raizAVL=null;
        } 
    }
    
    
    public boolean estaVacio(){
        return raizAVL==null;
    }
    
    //Buscar Nodo en el AVL
    public NodoArbolAVL buscarNodo(long d, NodoArbolAVL r){
        if(raizAVL==null){
            return null;
        }else if(r.dpi==d){
            return r;
        }else if(d>r.dpi){
            return buscarNodo(d, r.hijoDer);
        }else {
            return buscarNodo(d, r.hijoIzq);
        }
    }
    
    //Obtener el Factor de Equilibrio
    public int ObtenerFE(NodoArbolAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    
    
    //Rotacion simple Izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c){
        NodoArbolAVL aux=c.hijoIzq;
        c.hijoIzq=aux.hijoDer;
        aux.hijoDer=c;
        
        c.fe=Math.max(ObtenerFE(c.hijoIzq), ObtenerFE(c.hijoDer))+1;
        aux.fe=Math.max(ObtenerFE(aux.hijoIzq), ObtenerFE(aux.hijoDer))+1;
        
        return aux;
    }
    
    //Rotacion simple Derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c){
        NodoArbolAVL aux=c.hijoDer;
        c.hijoDer=aux.hijoIzq;
        aux.hijoIzq=c;
        
        c.fe=Math.max(ObtenerFE(c.hijoIzq), ObtenerFE(c.hijoDer))+1;
        aux.fe=Math.max(ObtenerFE(aux.hijoIzq), ObtenerFE(aux.hijoDer))+1;
        
        return aux;
    }
    
    //Rotacion Doble a la Izquierda
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c){
        NodoArbolAVL temp;
        c.hijoIzq=rotacionDerecha(c.hijoIzq);
        temp=rotacionIzquierda(c);
        
        return temp;
    }
    
    //Rotacion Doble a la Derecha
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c){
        NodoArbolAVL temp;
        c.hijoDer=rotacionIzquierda(c.hijoDer);
        temp=rotacionDerecha(c);
        return temp; 
    }
    
    
    //Metodo para insertar un NODO
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArbol){
        NodoArbolAVL nuevoPadre=subArbol;
        if(nuevo.dpi<subArbol.dpi){
            if(subArbol.hijoIzq==null){
                subArbol.hijoIzq=nuevo;
            }else{
                subArbol.hijoIzq=insertarAVL(nuevo, subArbol.hijoIzq);
                if((ObtenerFE(subArbol.hijoIzq)-ObtenerFE(subArbol.hijoDer))==2){
                    if(nuevo.dpi<subArbol.hijoIzq.dpi){
                        nuevoPadre=rotacionIzquierda(subArbol);
                    }else{
                        nuevoPadre=rotacionDobleIzquierda(subArbol);
                    }
                }
            }   
        }else if(nuevo.dpi>subArbol.dpi){
            if(subArbol.hijoDer==null){
                subArbol.hijoDer=nuevo;
            }else{
                subArbol.hijoDer=insertarAVL(nuevo, subArbol.hijoDer);
                if((ObtenerFE(subArbol.hijoDer)- ObtenerFE(subArbol.hijoIzq))==2){
                    if(nuevo.dpi>subArbol.hijoDer.dpi){
                        nuevoPadre=rotacionDerecha(subArbol);
                    }else{
                        nuevoPadre=rotacionDobleDerecha(subArbol);
                    }
                }
            }
        }else{
            System.out.println("Nodo duplicado");
        }
        
        //Actualizando factor de equilibrio
        if((subArbol.hijoIzq==null) && (subArbol.hijoDer!=null)){
            subArbol.fe=subArbol.hijoDer.fe+1;
        }else if((subArbol.hijoDer==null) && (subArbol.hijoIzq!=null)){
            subArbol.fe=subArbol.hijoIzq.fe+1;
        }else{
            subArbol.fe=Math.max(ObtenerFE(subArbol.hijoIzq), ObtenerFE(subArbol.hijoDer))+1;
        }
        return nuevoPadre;
    }
    
    //Metodo de insertar
    public void insertar(String nom, long d){
        NodoArbolAVL nuevo=new NodoArbolAVL(nom, d);
        if(raizAVL==null){
            raizAVL=nuevo;
        }else{
            raizAVL=insertarAVL(nuevo, raizAVL);
        }
    }
    
    //recorrido InOrden
    public void InOrden(NodoArbolAVL r){
        if(r!=null){
            InOrden(r.hijoIzq);
            System.out.println(r.dpi+ " ");
            InOrden(r.hijoDer);
        }
    }
    
    public void inOrden(NodoArbolAVL r, JTextArea inscritos){
        if(r!=null){
            inOrden(r.hijoIzq, inscritos);
            inscritos.append(r.nombre + "  " + r.dpi + "\n");
            System.out.println(r.nombre + "  " + r.dpi);
            inOrden(r.hijoDer, inscritos);
        }
        
    }
    
    //recorrido PreOrden
    public void PreOrden(NodoArbolAVL r){
        if(r!=null){
            System.out.println(r.dpi+ " ");
            PreOrden(r.hijoIzq);
            PreOrden(r.hijoDer);
        }
    }
    
    //recorrido PostOrden
    public void PostOrden(NodoArbolAVL r){
        if(r!=null){
            PostOrden(r.hijoIzq);
            PostOrden(r.hijoDer);
            System.out.println(r.dpi+ " ");
        }
    }
    
    
    // Método para eliminar un nodo
    public NodoArbolAVL eliminarAVL(NodoArbolAVL nodo, long d) {
        if (nodo == null) {
            return null;
        }

        if (d < nodo.dpi) {
            nodo.hijoIzq = eliminarAVL(nodo.hijoIzq, d);
            if (ObtenerFE(nodo.hijoDer) - ObtenerFE(nodo.hijoIzq) == 2) {
                NodoArbolAVL hijoDer = nodo.hijoDer;
                if (ObtenerFE(hijoDer.hijoIzq) <= ObtenerFE(hijoDer.hijoDer)) {
                    nodo = rotacionDerecha(nodo);
                } else {
                    nodo = rotacionDobleDerecha(nodo);
                }
            }
        } else if (d > nodo.dpi) {
            nodo.hijoDer = eliminarAVL(nodo.hijoDer, d);
            if (ObtenerFE(nodo.hijoIzq) - ObtenerFE(nodo.hijoDer) == 2) {
                NodoArbolAVL hijoIzq = nodo.hijoIzq;
                if (ObtenerFE(hijoIzq.hijoDer) <= ObtenerFE(hijoIzq.hijoIzq)) {
                    nodo = rotacionIzquierda(nodo);
                } else {
                    nodo = rotacionDobleIzquierda(nodo);
                }
            }
        } else {
            if (nodo.hijoIzq == null || nodo.hijoDer == null) {
                nodo = (nodo.hijoIzq != null) ? nodo.hijoIzq : nodo.hijoDer;
            } else {
                NodoArbolAVL temp = encontrarMin(nodo.hijoDer);
                nodo.dpi = temp.dpi;
                nodo.hijoDer = eliminarAVL(nodo.hijoDer, temp.dpi);
            }
        }

        if (nodo != null) {
            nodo.fe = Math.max(ObtenerFE(nodo.hijoIzq), ObtenerFE(nodo.hijoDer)) + 1;
        }
        return nodo;
    }

    // Método para encontrar el nodo con el valor mínimo en un subárbol
    private NodoArbolAVL encontrarMin(NodoArbolAVL nodo) {
        while (nodo.hijoIzq != null) {
            nodo = nodo.hijoIzq;
        }
        return nodo;
    }

    // Método público para eliminar un nodo
    public void eliminar(long d) {
        raizAVL = eliminarAVL(raizAVL, d);
    }
}
