package steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;

public class Steps{
    WebDriver driver;
    public Steps(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
    }
    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");
        GooglePage googlePage = new GooglePage(driver);
        googlePage.Search("Hello");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials(DataTable dataTable)
    {
        System.out.println("Entered username and password " + dataTable.cell(1,0));
    }

    @When("hits submit")
    public void hits_submit() {
        System.out.println("Clicked on submit");
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Yeah I am logged in");
    }
}
