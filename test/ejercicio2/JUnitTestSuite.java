package ejercicio2;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *@author javier Bustamante Toledo
 * @author daniel reguera bazan
 */

@RunWith (value = Suite.class)
@Suite.SuiteClasses ( {
        Ejercicio2baseBorde.class,
        Ejercicio2beforeAfter.class,
        Ejercicio2beforeAfterClass.class,
        Ejercicio2parametrizadas.class,
    }
)
public class JUnitTestSuite {
}
