package POM;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {
    private WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver conectorChrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ZIP-B205-E-019\\IdeaProjects\\patron\\src\\main\\java\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    //wrapper - emboltorios -- metodos

    //METODO QUE DEVUELVE EL LOCALIZADOR
    public WebElement findElement(By localizador){
        return driver.findElement(localizador);
    }

    //METODO QUE DEVUELVE UNA LISTA DE ELEMENTOS
    public List<WebElement> findElements(By localizador){
        return driver.findElements(localizador);
    }

    //METODO QUE DEVULVE EL TEXTO DEL ELEMENTO
    public String text(WebElement elemento){
        return elemento.getText();
    }

    //METODO PARA HACER CLICK
    public void click(By localizador){
        driver.findElement(localizador).click();
    }

    //METODO PARA ESCRIBIR TEXTO
    public void texto(String input, By localizador){
        driver.findElement(localizador).sendKeys(input);
    }

    //METODO QUE INDICA SI EL ELEMENTO SE PUEDE USAR
    public boolean isDisplayed(By localizador){
        try {
            return driver.findElement(localizador).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    //METODO PARA ABRIR LA PAGINA
    public void pagina(String url){
        driver.get(url);
    }

}
