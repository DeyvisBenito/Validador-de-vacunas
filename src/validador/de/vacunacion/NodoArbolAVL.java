/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador.de.vacunacion;

/**
 *
 * @author deyvi
 */
public class NodoArbolAVL {
    public String nombre, depa, muni, fecV1, fecV2, fecV3, lugarV;
    public int cantDosis, fe;
    public long dpi;
    public NodoArbolAVL hijoIzq, hijoDer;
    
    public NodoArbolAVL(String nom, long dpi){
        this.nombre=nom;
        this.dpi=dpi;
        this.depa=null;
        this.muni=null;
        this.fecV1=null;
        this.fecV2=null;
        this.fecV3=null;
        this.lugarV=null;
        this.cantDosis=0;
        this.hijoDer=null;
        this.hijoIzq=null;
        this.fe=0;
    }
    
    public NodoArbolAVL(){
        
    }
}
