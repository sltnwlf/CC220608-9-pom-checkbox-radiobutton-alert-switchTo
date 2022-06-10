import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {

    WebDriver driver;
    private final String url = "https://demo.seleniumeasy.com/basic-checkbox-demo.html";
    private final By checkbox = By.xpath("//*[@id=\"isAgeSelected\"]");
    private final By message = By.xpath("//*[@id=\"txtAge\"]");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(url);
    }

    public void clickOnCheckbox() {
        driver.findElement(checkbox).click();
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }
}
