/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompi2;

/**
 *
 * @author Usuario
 */
public class Simbolo {
    public String id;
    public String ambito; //Se refiere al tipo de entrada
    public String tipo;
    //public String dir;
    
    public Simbolo(String pAmbito, String pTipo, String pId){
       this.id = pId;
       this.ambito = pAmbito; //Se refiere al tipo de entrada
       this.tipo = pTipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getAmbito(){
        return this.ambito;
    }

    public String getId(){
        return this.id;
    }
}
