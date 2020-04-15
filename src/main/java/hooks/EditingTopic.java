package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class EditingTopic extends WebDriverSettings{

    private WebDriver driver;

    private By btnMy = xpath("//div[@id='page-mount']//li[2]/a");
    private By theme = xpath("//a[@class='item-title thread-title']");
    private By btnEdit = xpath("//button[@class='hidden-xs btn btn-default btn-sm pull-right']");
    private By textArea = xpath("//textarea[@id='editor-textarea']");

    public EditingTopic(WebDriver driver) {
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


    public void clickBtnMy(){
        WebElement element = driver.findElement(btnMy);
        element.click();
        threadSleep();
    }


    public void topicSelection(){
        WebElement element = driver.findElement(theme);
        if(element != null){
            element.click();
            threadSleep();
        }else {
        System.out.println(element + " отсутствует");
        }
    }


    public void clickBtnEdit(){
        WebElement element = driver.findElement(btnEdit);
        threadSleep();
        element.click();
        threadSleep();
    }


    public void clickTextArea(String text){
        WebElement element = driver.findElement(textArea);
        element.clear();
        threadSleep();
        element.sendKeys(text);
        threadSleep();
        element.submit();
    }


    public void quitBrowser(){
        driver.quit();
    }
}
