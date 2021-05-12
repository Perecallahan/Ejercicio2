package ejercicio2;

import ejercicio2.Ejercicio2;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

/**
 *
 * @author daniel reguera bazan
 */
@RunWith(value=Parameterized.class)
public class Ejercicio2parametrizadas {
  
  private String valor;
  private String mensaje;
  
  public Ejercicio2parametrizadas(String metodoPrueba, String metodoComparacion) {
    this.valor = metodoPrueba;
    this.mensaje = metodoComparacion;
  }
  
  /**
   *
   * @return  
   */
  @Parameters
  public static Iterable<Object> obtenerPrueba(){
    List<Object> obj = new ArrayList<>();
      //equivalenias 3.1 a 3.4
      obj.add(new Object[] {"cinco", "Cadena incorrecta. La longuitud de la cadena es < 6"});
      obj.add(new Object[] {"cinco55", "Cadena incorrecta. No es alfabética."});
      obj.add(new Object[] {"septimo", "Cadena correcta. La aplicación permite el ingreso."});
      obj.add(new Object[] {"murcielagos", "Cadena incorrecta. La longuitud de la cadena es > 10"});
      //borde 4.1 a 4.4
      obj.add(new Object[] {"cincos", "Cadena correcta. La aplicación permite el ingreso."});
      obj.add(new Object[] {"cincocinco", "Cadena correcta. La aplicación permite el ingreso."});
      obj.add(new Object[] {"cinco0", "Cadena incorrecta. No es alfabética."});
      obj.add(new Object[] {"cincocinc0", "Cadena incorrecta. No es alfabética."});      
      return obj;
  }
  @Test
  public void testIngreso() {
      System.out.println("IntroducirCadena");
      String testPrueba = this.valor;
      Ejercicio2 instance = new Ejercicio2();
      String expResult = this.mensaje;
      String result = instance.IntroducirCadena(testPrueba);
      assertEquals(expResult, result);
      System.out.println(testPrueba+"--> "+expResult);
  }
  
}
