package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class ReplyFunction extends WebDriverSettings{

    private final WebDriver driver;

    public ReplyFunction(WebDriver driver) {
        this.driver = driver;
    }

    private By selectTopic = xpath("//a[@class='item-title thread-title']");
    private By btnAnswer = xpath("//button[text()='Ответить']");
    private By formBody = xpath("//textarea[@id='editor-textarea']");
    private By btnSendAnswer = xpath("//button[text()='Отправить ответ']");

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
        threadSleep();
        element.click();
    }

    public void clickTopic(){
        threadSleep();
        WebElement element = driver.findElement(selectTopic);
        element.click();
    }

    public void clickBtnAnswer(){
        threadSleep();
        WebElement element = driver.findElement(btnAnswer);
        element.click();
    }

    public void inputTextAnswer(String text){
        threadSleep();
        WebElement element = driver.findElement(formBody);
        element.sendKeys(text);
    }

    public void clickBtnSendAnswer(){
        threadSleep();
        WebElement element = driver.findElement(btnSendAnswer);
        element.click();
    }
    public void quitBrowser(){
        driver.quit();
    }
}
