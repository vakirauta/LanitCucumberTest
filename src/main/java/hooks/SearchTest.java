package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class SearchTest extends WebDriverSettings{
    private final WebDriver driver;

    private String userName;

    public SearchTest(WebDriver driver) {
        this.driver = driver;
    }

    private By btnSearch = xpath("//i[text()='search']");
    private By textArea = xpath("//input[@placeholder='Поиск']");
    private By choiseSearch = xpath("//h5[text()="+userName+"]");
    private By textSearchMessage = xpath("//li[text()='Поиск не дал результатов.']");

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

    public void clickBtnSearch(){
        WebElement element = driver.findElement(btnSearch);
        element.click();
        threadSleep();
    }

    public void clickTextAreaAndInputText(String text){
        WebElement element = driver.findElement(textArea);
        element.sendKeys(text);
        threadSleep();
    }

    public String getMessage(){
        WebElement element = driver.findElement(textSearchMessage);
        String text = element.getText();
        return text;
    }

    public void getUserName(String name) {
        try{
            WebElement element = driver.findElement(xpath(String.format("//h5[text()='%s']",name)));
            if(element.isDisplayed()){
                threadSleep();
                element.click();
            }
        }catch (NoSuchElementException e){
            getMessage();
        }
    }

    public void quitBrowser(){
        driver.quit();
    }
}
