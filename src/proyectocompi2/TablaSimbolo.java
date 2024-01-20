/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompi2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TablaSimbolo {
    
    //public String dir;
    public ArrayList<Simbolo> tablaSimbolo;// = new ArrayList();
    public int indice;//Index de la pila
    public ArrayList<String> pila = new ArrayList<String>();
    
    
    public TablaSimbolo(){
        this.tablaSimbolo = new ArrayList<Simbolo>();
        this.indice = 0;
    }
    
    public ArrayList<Simbolo> getTablaSimbolos(){
        return this.tablaSimbolo;
    }
    
    public void setTablaSimbolos(ArrayList<Simbolo> pTablaSimbolo){
          this.tablaSimbolo = pTablaSimbolo;
        
    }
    
    public void incrementarIndice(int pIndiceSuma){
        this.indice += pIndiceSuma;
        
    }
}
