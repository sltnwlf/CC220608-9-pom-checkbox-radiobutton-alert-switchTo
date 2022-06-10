import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {

    WebDriver driver;
    private final String url = "https://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private final By radioButtonMale = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input");
    private final By getResultButton = By.xpath("//*[@id=\"buttoncheck\"]");
    private final By resultText = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigation() {
        driver.navigate().to(url);
    }

    public void clickOnRadioButton() {
        driver.findElement(radioButtonMale).click();
    }

    public void clickOnGetResultButton() {
        driver.findElement(getResultButton).click();
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }


}
