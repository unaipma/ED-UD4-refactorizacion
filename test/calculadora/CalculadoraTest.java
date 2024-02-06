/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CalculadoraTest {
    
    /*
    * CP1: Caso de prueba de método estático suma
    CV1
    Salida: Resultado
    */
    @Test
    public void CP1_Sumar(){
        //Entrada Datos
        int a, b;
        a = 4;
        b = 5;
        
        // Salida
        int resultadoEsperadoSumar = 9;
        int resultadoSumar = Calculadora.sumar(a, b);
        assertEquals(resultadoEsperadoSumar, resultadoSumar);                 
    }
    
     /*
    * CP2: Caso de prueba de método estático restar()
    CV2
    Salida: Resultado
    */
    @Test
    public void CP2_Restar(){
        //Entrada Datos
        int a, b;
        a = 5;
        b = 4;
        
        // Salida
        int resultadoEsperadoRestar = 1;
        
        assertEquals(resultadoEsperadoRestar, Calculadora.restar(a, b));                 
    }
    
     /*
    * CP3: Caso de prueba de método estático multiplicar()
    CV3
    Salida: Resultado
    */
    @Test
    public void CP3_Multiplicar(){
        
        assertEquals(20, Calculadora.multiplicar(4, 5));                 
    }
    
    /*
    * 
    */
    @Test(expected = ArithmeticException.class)
    public void CP4_DividirPorCero() {
        int a, b;
        a = 5;
        b = 0;
        Calculadora.dividir(5, 0);
    }
    
    /*
    * 
    */
    @Test
    public void CP5_Dividir() {
        int a, b;
        a = 5;
        b = 3;
        assertEquals(1,Calculadora.dividir(a, b));
    }
    
    /*
    * 
    */
    @Test(expected = ArithmeticException.class)
    public void CP6_ModuloPorCero() {
        int a, b;
        a = 5;
        b = 0;
        Calculadora.modulo(5, 0);
    }
    
    /*
    * 
    */
    @Test
    public void CP7_Modulo() {
        int a, b;
        a = 5;
        b = 3;
        assertEquals(2,Calculadora.modulo(a, b));
    }
    
    
}
