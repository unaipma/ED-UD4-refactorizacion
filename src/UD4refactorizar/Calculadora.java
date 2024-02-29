/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD4refactorizar;

/**
 *
 * @author usuario
 */

public class Calculadora extends SuperCalculadora implements interfaceCalculadora {

    public int resultado;
    
    @Override
    public int sumar(int operador1, int operador2) {
        return operador1 + operador2;
    }

    @Override
    public int restar(int restando1, int restando2) {
        return restando1 - restando2;
    }

    public int multiplicar(int multiplicando1, int multiplicando2) {
        return multiplicando1 * multiplicando2;
    }

    
    public int operacion(int operador1, int operador2, String operacion) {
        if (null != operacion) switch (operacion) {
            case "sumar":
                return sumar(operador1,operador2);
            case "restar":
                return restar(operador1,operador2);
            case "multiplicar":
                return multiplicar(operador1,operador2);
            case "dividir":
                return dividir(operador1,operador2);
            case "modulo":
                return modulo(operador1,operador2);
            default:
                break;
        }
        
        throw new IllegalArgumentException("Operación no válida");
    }
  

}