package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    By buscar = By.cssSelector("input[title=\"Buscar\"]");
    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void Search(String text){
        driver.findElement(buscar).sendKeys(text);
        driver.findElement(buscar).sendKeys(Keys.ENTER);
    }
}
