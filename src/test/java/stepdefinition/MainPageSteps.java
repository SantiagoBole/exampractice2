package stepdefinition;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    WebDriver driver = Hooks.getDriver();
    MainPage mainPage;

    public MainPageSteps() {
        mainPage = new MainPage(Hooks.getDriver());
    }
    @Given("main page is open")
    public void mainPageIsOpen(){
        mainPage.goToMainPage();
        Assert.assertTrue(mainPage.isMainPageDisplayed());
    }
    @When("I open the Alerts page")
    public void iOpenTheAlertsPage(){
        mainPage.goToAlertPage();
        Assert.assertTrue(mainPage.isAlertPageDisplayed());
    }
}
