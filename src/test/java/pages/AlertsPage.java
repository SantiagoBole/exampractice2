package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AlertsPage {
    WebDriver driver;
    private By CLICK_FOR_ALERT = By.xpath("//*[contains(text(), 'Click for JS Alert')]");
    private By SUCCESS_MESSAGE = By.xpath("//p[contains(text(), 'You successfully clicked an alert')]");
    private WebDriverWait wait;

    public AlertsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickForAlert(){
        driver.findElement(CLICK_FOR_ALERT).click();
    }
    public void acceptAlert(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    public String getSuccessMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_MESSAGE));
        return driver.findElement(SUCCESS_MESSAGE).getText();
    }
}
