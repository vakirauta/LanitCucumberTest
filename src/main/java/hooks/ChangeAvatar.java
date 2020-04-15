package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class ChangeAvatar extends WebDriverSettings{
    private final WebDriver driver;
    private String textAlert;

    private By btnProfile = xpath("//img[@class='user-avatar']");
    private By btnChangeAvatar = xpath("//button[@class='btn-link']");
    private By btnGenerateIndividualAvatar = xpath("//button[contains(text(),'Сгенерировать')]");
    private By alert = cssSelector(".alert");

    public ChangeAvatar(WebDriver driver) {
        this.driver = driver;
    }

    public void authorization() {
        WebElement element = driver.findElement(btnLog);
        element.click();
        threadSleep();
        driver.findElement(formLogin).sendKeys(getLogin());
        driver.findElement(formPass).sendKeys(getPass());
        clickSubmit();
    }
    public void clickSubmit(){
        WebElement element = driver.findElement(btnEntry);
        element.click();
        threadSleep();
    }

    public void clickBtnProfile(){
        threadSleep();
        WebElement element = driver.findElement(btnProfile);
        element.click();
    }

    public void clickBtnChangeAvatar(){
        threadSleep();
        WebElement element = driver.findElement(btnChangeAvatar);
        element.click();
    }

    public void clickBtnGenerateIndividualAvatar(){
        threadSleep();
        WebElement element = driver.findElement(btnGenerateIndividualAvatar);
        element.click();
    }

    public void setTextAlert(){
        threadSleep();
        WebElement element = driver.findElement(alert);
        String text = element.getText();
        this.textAlert = text;
    }

    public String getTextAlert() {
        setTextAlert();
        return textAlert;
    }

    public void quitBrowser(){
        driver.quit();
    }
}
