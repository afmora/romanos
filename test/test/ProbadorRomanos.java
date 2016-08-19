package test;

import java.io.FileNotFoundException;
import java.util.Random;
import org.testng.Assert;
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
    
    //------------------------------------
    
    @Test
    public void arrojaErrorAlRecibirUncero(){
        Romano romano=FabricaRomanos.crearRomano();
        Assert.assertFalse(romano.validaNumero(0));
    }
    @Test
    public void arrojaErrorAlRecibirNumeroNegativo(){
        Romano romano=FabricaRomanos.crearRomano();
        Assert.assertFalse(romano.validaNumero(-1));
    }

    @Test
    public void devuelveISiRecibeUn1(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="I";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(1)));
    }

    @Test
    public void devuelveVSiRecibeUn5(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="V";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(5)));
    }
    @Test
    public void devuelveXSiRecibeUn10(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="V";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(10)));
    }
    @Test
    public void devuelveLSiRecibeUn50(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="L";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(50)));
    }
    @Test
    public void devuelveCSiRecibeUn100(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="C";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(100)));
    }
    @Test
    public void devuelveDSiRecibeUn500(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="D";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(500)));
    }
    @Test
    public void devuelveMSiRecibeUn1000(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="M";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(1000)));
    }


    @Test
    public void devuelveIISiRecibeUn2(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="II";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(2)));
    }

    @Test
    public void devuelveIVSiRecibeUn4(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="IV";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(4)));
    }

    @Test
    public void devuelveIXSiRecibeUn9(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="IX";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(9)));
    }

    @Test
    public void devuelveCCCSiRecibeUn300(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="CCC";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(300)));
    }

    @Test
    public void devuelveCDSiRecibeUn400(){
        Romano romano=FabricaRomanos.crearRomano();
        String valorEsperado="CD";
        Assert.assertTrue(valorEsperado.equalsIgnoreCase(romano.Convierte(400)));
    }


    public void toDo(){
        revisaQueNoSeaUnaLetra
                revisaQueNoSeaCaracterEspecial


    }
       
}

