package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.By.xpath;

public class ExitProfile extends WebDriverSettings{
    private WebDriver driver;

    public ExitProfile(WebDriver driver) {
        this.driver = driver;
    }

    private By btnProfile = xpath("//img[@class='user-avatar']");
    private By btnExit = xpath("//button[text()='Выход']");


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
        threadSleep();
    }

    public void clickBtnExit(){
        WebElement element = driver.findElement(btnExit);
        element.click();
    }

    public void quitBrowser(){
        driver.quit();
    }
}