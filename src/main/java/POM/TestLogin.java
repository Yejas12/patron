package POM;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin {
    private WebDriver driver;
    private InicioDeSesion inicioDeSesion;

    @Before
    public void inicio(){
        inicioDeSesion = new InicioDeSesion(driver);
        driver = inicioDeSesion.conectorChrome();
        inicioDeSesion.pagina("https://demo.guru99.com/test/newtours/index.php");
    }

    @After
    public void cerrar(){
        driver.quit();
    }

    @Test
    public void inicioExitoso(){
        inicioDeSesion.iniciarSesion("prueba","prueba");
        Assert.assertEquals("Login Successfully",inicioDeSesion.mensajeLogin());
    }


}
