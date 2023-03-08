package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    By buscar = By.cssSelector("input[title=\"Buscar\"]");
    By buscar_btn = By.xpath("(//input[@value=\"Buscar con Google\"])[1]");

    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void Search(String text){
        driver.findElement(buscar).sendKeys(text);
        driver.findElement(buscar).sendKeys(Keys.ENTER);
        //driver.findElement(buscar_btn).click();
    }
}
