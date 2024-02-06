/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author usuario
 */
public class DividirTest {
    
    private static int a, b;
    private static int resultado;
    
    public DividirTest() {
    }

    @BeforeClass
    public static void beforeClass(){
        a = 5;
        b = 3;
        resultado = 1;
    }
    
    @Before
    public void before(){
        a = 7;
        b = 2;
        resultado = 3;
    }
    
    /**
     * Test of dividir method, of class Dividir.
     */
    @Test
    public void testDividir() {
        assertEquals(resultado, Dividir.dividir(a, b));
    }
    
    /**
     * Test of dividir method, of class Dividir.
     */
    @Test (expected= ArithmeticException.class)
    public void testDividirPorCero() {
        
       // a = 5;
        int b = 0;
        
        Dividir.dividir(a, b);
    }
}
