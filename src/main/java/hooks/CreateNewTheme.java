package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class CreateNewTheme extends WebDriverSettings{

    private final WebDriver driver;

    private By btnNewTheme = xpath("//button[text()='Новая тема']");
    private By enterText = xpath("//input[@placeholder='Заголовок темы']");
    private By enterFieldText = id("editor-textarea");
    private By btnPublish = xpath("//button[text()='Опубликовать тему']");

    public CreateNewTheme(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBtnNewTheme(){
        WebElement element = driver.findElement(btnNewTheme);
        element.click();
        threadSleep();
    }


    public void enterCaptionText(String text){
        WebElement element = driver.findElement(enterText);
        element.sendKeys(text);
        threadSleep();
    }

    public void enterFieldText(String text){
        WebElement element = driver.findElement(enterFieldText);
        element.sendKeys(text);
        threadSleep();
    }

    public CreateNewTheme clickBtnPublish(){
        WebElement element = driver.findElement(btnPublish);
        element.click();
        threadSleep();
        return this;
    }

    public void quitBrowser(){
        driver.quit();
    }

}
