package ejercicio2;

import ejercicio2.Ejercicio2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel reguera bazan
 */
public class Ejercicio2beforeAfterClass {
  private static Ejercicio2 instance;
  
  public Ejercicio2beforeAfterClass() {
  }
  
  @BeforeClass
  public static void BeforeClass() {
    System.out.println("@BeforeClass--> Inicio");
    instance = new Ejercicio2();
  }
  
  @AfterClass
  public static void AfterClass() {
    System.out.println("@AfterClass--> Fin");
  }
  
  @Test
    public void testCaso3_1() {
        System.out.println("Caso 3.1: Datos de entrada: cadena de 5 caracteres. Resultado esperado (Salida): La\n" +
"aplicación no permite el ingreso del dato y muestra un mensaje de error.\n");
        
       String expResult = "Cadena incorrecta. La longuitud de la cadena es < 6";
       String result = instance.IntroducirCadena("cinco");
       assertEquals(expResult, result);
    }
    @Test
    public void testCaso3_2() {
        System.out.println("Caso 3.2: Datos de entrada: cadena de 7 caracteres, incluyendo uno o más caracteres no\n" +
"alfabéticos. Resultado esperado (Salida): La aplicación no permite el ingreso del dato y\n" +
"muestra un mensaje de error. \n");
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("cinco55");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCaso3_3() {
        System.out.println("Caso 3.3: Datos de entrada: cadena de 7 caracteres, solo de caracteres alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación permite el ingreso del dato. \n");
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("septimo");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCaso3_4() {
        System.out.println("Caso 3.4: Datos de entrada: cadena de 11 caracteres. Resultado esperado (Salida): La\n" +
"aplicación no permite el ingreso del dato y muestra un mensaje de error. \n");
        String expResult = "Cadena incorrecta. La longuitud de la cadena es > 10";
        String result = instance.IntroducirCadena("murcielagos");
        assertEquals(expResult, result);
    }
}
