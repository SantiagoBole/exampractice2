package stepdefinition;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AlertsPage;

public class AlertSteps {
    WebDriver driver = Hooks.getDriver();
    AlertsPage alertsPage;

    public AlertSteps() {
        alertsPage = new AlertsPage(Hooks.getDriver());
    }
    @When("I make the alert appear")
    public void iMakeTheAlertAppear(){
        alertsPage.clickForAlert();
    }
    @When("I accept the alert")
    public void iAcceptTheAlert(){
        alertsPage.acceptAlert();
    }
    @Then("The success message appears")
    public void theSuccessMessageAppears(){
        Assert.assertEquals(alertsPage.getSuccessMessage(), "You successfully clicked an alert", "Message does not coincide with expected one");
    }
}
