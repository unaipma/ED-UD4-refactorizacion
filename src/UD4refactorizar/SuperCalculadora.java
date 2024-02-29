/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4refactorizar;

/**
 *
 * @author Vespertino
 */
public class SuperCalculadora {
    
    public int dividir(int dividendo1, int dividendo2) {
        if (dividendo2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return dividendo1 / dividendo2;
    }

    public int modulo(int operador1, int operador2) {
        if (operador2 == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return operador1 % operador2;
    }
    
}
