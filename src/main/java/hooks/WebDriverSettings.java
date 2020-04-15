package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class WebDriverSettings {
    private String login = "Alexandr11";
    private String pass = "1ybrjkfc89";

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    By btnLog = xpath("//button[text()='Войти']");
    By formLogin = xpath("//input[@id='id_username']");
    By formPass = xpath("//input[@id='id_password']");
    By btnEntry = xpath("//button[@type='submit']");

    public void authorization(WebDriver driver) {
        WebElement element = driver.findElement(btnLog);
        element.click();
        threadSleep();
        driver.findElement(formLogin).sendKeys(getLogin());
        driver.findElement(formPass).sendKeys(getPass());
        clickSubmit(driver);
    }

    public void clickSubmit(WebDriver driver){
        WebElement element = driver.findElement(btnEntry);
        element.click();
        threadSleep();
    }
    public void threadSleep(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
