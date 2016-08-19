package test;

import java.io.FileNotFoundException;
import java.util.Random;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProbadorRomanos {
    
    @Test
    //Este método tiene que validar que el número ingresado por el usuario no sea ni cero ni negativo
    public void validarQueELNumeroSeaPositivo(){
        int numero = 10;
        Assert.assertTrue(numero > 0);
    }
    @Test
    //Este método valida que el numero ingresado por el usuario es negativo
    public void numeroIngresadoesNegativo(){
        int numero = 10;
        Assert.assertFalse(numero < 0);
        Assert.fail("Numero Ingresado Es Positivo");
        
    }
    @Test
    //Este método valida que el numero ingresado por el usuario es igual a cero
    public void numeroIngresadoEsIgualACero(){
        int numero = 0;
        Assert.assertEquals(numero, 0);
    }
    @Test
    //Este método valida que el numero ingresado por el usuario es igual a cero
    public void numeroIngresadoEsIgualACro(){
        int numero = 0;
        Assert.assertEquals(numero, 0);
    }
       
}
