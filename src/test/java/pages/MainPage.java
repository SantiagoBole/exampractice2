package pages;

import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MainPage {
    private WebDriver driver;
    private By LINK_JAVAALERT = By.xpath("//*[text()='JavaScript Alerts']");
    private By UNIQUE_ELEMENT = By.xpath("//*[text()='Welcome to the-internet']");
    private By ALERT_UNIQUE_ELEMENT = By.xpath("//*[contains(text(), 'JavaScript Alerts')]");
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public void goToMainPage(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    public boolean isMainPageDisplayed(){
        return driver.findElement(UNIQUE_ELEMENT).isDisplayed();
    }

    public void  goToAlertPage(){
        driver.findElement(LINK_JAVAALERT).click();
    }
    public boolean isAlertPageDisplayed(){
        return driver.findElement(ALERT_UNIQUE_ELEMENT).isDisplayed();
    }

}
