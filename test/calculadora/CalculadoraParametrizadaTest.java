/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author usuario
 */
@RunWith(Parameterized.class)
public class CalculadoraParametrizadaTest {
    //Declaración de variables
    private int a, b;
    private int resultadoEsperadoSumar;
    private int resultadoEsperadoRestar;
    private int resultadoEsperadoMultiplicar;
    private int resultadoEsperadoDividir;
    private int resultadoEsperadoModulo;
    
    public CalculadoraParametrizadaTest(int a, 
            int b,
        int resultadoEsperadoSumar,
        int resultadoEsperadoRestar,
        int resultadoEsperadoMultiplicar,
        int resultadoEsperadoDividir,
        int resultadoEsperadoModulo) {
        
        this.a = a;
        this.b = b;
        this.resultadoEsperadoSumar = resultadoEsperadoSumar;
        this.resultadoEsperadoRestar = resultadoEsperadoRestar;
        this.resultadoEsperadoMultiplicar = resultadoEsperadoMultiplicar;
        this.resultadoEsperadoDividir = resultadoEsperadoDividir;
        this.resultadoEsperadoModulo = resultadoEsperadoModulo;
        
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            {2, 3, 5, -1, 6, 0, 2},  // CP .fmañjfalf
            {4, 1, 5, 3, 4, 4, 0},  // CP  .. CV1, CV3 ..
            {6, 3, 9, 3, 18, 2, 0}
        });
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /*
    * CP1: Caso de prueba de método estático suma
    CV1
    Salida: Resultado
    */
    @Test
    public void CP1_Sumar(){
        assertEquals(resultadoEsperadoSumar, Calculadora.sumar(a, b));                 
    }
    
     /*
    * CP2: Caso de prueba de método estático restar()
    CV2
    Salida: Resultado
    */
    @Test
    public void CP2_Restar(){
        assertEquals(resultadoEsperadoRestar, Calculadora.restar(a, b));                    
    }
    
     /*
    * CP3: Caso de prueba de método estático multiplicar()
    CV3
    Salida: Resultado
    */
    @Test
    public void CP3_Multiplicar(){
        
        assertEquals(resultadoEsperadoMultiplicar, Calculadora.multiplicar(a, b));                 
    }
    
    /*
    * 
    */
    @Test
    public void CP5_Dividir() {
        assertEquals(resultadoEsperadoDividir,Calculadora.dividir(a, b));
    }
    
   
    
    /*
    * 
    */
    @Test
    public void CP7_Modulo() {
        assertEquals(resultadoEsperadoModulo,Calculadora.modulo(a, b));
    }

}
