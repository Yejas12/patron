package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioDeSesion extends Base{
    private By txt_User = By.xpath("//input[@name='userName']");
    private By txt_Password = By.xpath("//input[@name='password']");
    private By btn_Submit = By.xpath("//input[@name='submit']");
    private By msjLogin = By.xpath("//h3[.='Login Successfully']");

    public InicioDeSesion(WebDriver driver) {
        super(driver);
    }

    //METODO INICIAR SESION
    public void iniciarSesion(String user, String pass){
        findElement(txt_User).sendKeys(user);
        findElement(txt_Password).sendKeys(pass);
        findElement(btn_Submit).click();
    }

    public String mensajeLogin(){
        return findElement(msjLogin).getText();
    }

}
