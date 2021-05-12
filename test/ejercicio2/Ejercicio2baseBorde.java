package ejercicio2;

import ejercicio2.Ejercicio2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 * @author daniel reguera bazan
 */
public class Ejercicio2baseBorde {
    
    public Ejercicio2baseBorde() {
    }

    @Test
    public void testCaso4_1() {
        System.out.println("Caso 4.1: Datos de entrada: cadena de 6 caracteres, sólo caracteres alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación permite el ingreso del dato. \n");
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("cincos");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCaso4_2() {
        System.out.println("Caso 4.2: Datos de entrada: cadena de 10 caracteres, sólo caracteres alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación permite el ingreso del dato. \n");
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("cincocinco");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCaso4_3() {
        System.out.println("Caso 4.3: Datos de entrada: cadena de 6 caracteres, con caracteres no alfabéticos. Resultado\n" +
"esperado (Salida): La aplicación no permite el ingreso del dato y muestra un mensaje de error. \n");
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("cinco0");
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCaso4_4() {
        System.out.println("Caso 4.3: Datos de entrada: cadena de 10 caracteres, con caracteres no alfabéticos.\n" +
"Resultado esperado (Salida): La aplicación no permite el ingreso del dato y muestra un\n" +
"mensaje de error. \n");
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("cincocinc0");
        assertEquals(expResult, result);
    }
}
