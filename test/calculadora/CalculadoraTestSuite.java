/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author usuario
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({calculadora.CalculadoraParametrizadaTest.class, 
    calculadora.CalculadoraTest.class, 
    calculadora.DividirTest.class, 
    calculadora.ModuloTest.class, 
    calculadora.MultiplicarTest.class, 
    calculadora.RestarTest.class, 
    calculadora.SumarTest.class})

public class CalculadoraTestSuite {
    
}
