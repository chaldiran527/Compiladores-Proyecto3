/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompi2;

//Constantes de los tipos de datos empleados en la gramaticaa
enum TipoDato{
     INT, CHAR, FLOAT, STRING, BOOLEAN, INTARR, CHARARR, NULO, VOID;
 }
/**
 *
 * @author Usuario
 */
public class Dato {
    private TipoDato tipo;
    private Object expresion;
    

    public Dato(Object pExpresion, TipoDato pTipo) {
        this.tipo = pTipo;
        this.expresion = pExpresion;

    }

    public static TipoDato toArr(TipoDato tipo) {
        switch (tipo) {
            case INT:
                return TipoDato.INTARR;
            case CHAR:
                return TipoDato.CHARARR;
            default:
                return TipoDato.NULO;
        }
    }

    public static TipoDato tipoFromString(String tipo) {
        switch (tipo) {
            case "int":
                return TipoDato.INT;
            case "float":
                return TipoDato.FLOAT;
            case "string":
                return TipoDato.STRING;
            case "bool":
                return TipoDato.BOOLEAN;
            case "char":
                return TipoDato.CHAR;
            case "char[]":
                return TipoDato.CHARARR;
            case "int[]":
                return TipoDato.INTARR;
            case "void":
                return TipoDato.VOID;
            default:
                return TipoDato.NULO;
        }
    }

    public Object getValor() {
        return expresion;
    }

    public TipoDato getTipo() {
        return tipo;
    }

    public void setValor(Object valor) {
        this.expresion = valor;
    }

    public void setTipo(TipoDato tipo) {
        this.tipo = tipo;
    }

    
}
