package pages;
import locators.GooglePageLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends GooglePageLocators{
    WebDriver driver;

    public WebElement buscar(){
        return driver.findElement(buscar);
    }

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void Search(String text){
        WebElement buscar = buscar();
        buscar.sendKeys(text);
        buscar.sendKeys(Keys.ENTER);
    }
}
