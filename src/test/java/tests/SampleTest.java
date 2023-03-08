package tests;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.GooglePage;

public class SampleTest extends BasePage{

@Test
public void Test1() throws InterruptedException {
    GooglePage googlePage = new GooglePage(driver);
    googlePage.Search("hola mundo");
}

}
