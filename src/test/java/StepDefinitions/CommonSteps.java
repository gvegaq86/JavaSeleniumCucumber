package StepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {
    private WebDriver driver;

    @Before
    public void browserSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
