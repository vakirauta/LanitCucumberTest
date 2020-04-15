package hooks;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class Authorization {

    private final WebDriver driver;

    private By btnLog = xpath("//button[text()='Войти']");
    private By formLogin = xpath("//input[@id='id_username']");
    private By formPass = xpath("//input[@id='id_password']");
    private By btnEntry = xpath("//button[@type='submit']");


    public Authorization(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Нажать кнопку войти")
    public void getButton(){
        threadSleep();
        WebElement element = driver.findElement(btnLog);
        element.click();
    }
    @Step("Ввести логин")
    public void inputLogin(String login) {
        threadSleep();
        driver.findElement(formLogin).sendKeys(login);
        }

     @Step("Ввести пароль")
     public void inputPass(String pass){
         threadSleep();
        driver.findElement(formPass).sendKeys(pass);
    }

    @Step("Подтвердить авторизацию")
    public void clickSubmit(){
        WebElement element = driver.findElement(btnEntry);
        element.click();
        threadSleep();
    }
    @Step("Выйти из браузера")
    public void quitBrowser(){
        driver.quit();
    }

    public void threadSleep(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
