import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    WebDriver driver;
    private final String url = "https://demo.seleniumeasy.com/javascript-alert-box-demo.html";
    private final By alertButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(url);
    }

    public void clickOnAlertButton() {
        driver.findElement(alertButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
