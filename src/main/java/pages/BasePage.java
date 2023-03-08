package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
    public static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(ITestContext context){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        context.setAttribute("WebDriver", driver);
        driver.get("https://google.com");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }


}
