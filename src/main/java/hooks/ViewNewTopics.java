package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class ViewNewTopics extends WebDriverSettings{

    private final WebDriver driver;

    public ViewNewTopics(WebDriver driver) {
        this.driver = driver;
    }

    private By btnNew = xpath("//a[contains(text(),'Новые')]");
    private By NewTopic = xpath("//a[@class='item-title thread-title']");
    private By btnLike = xpath("//button[contains(.,'Лайк')]");

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

    public void clickBtnNew() {
        threadSleep();
        WebElement element = driver.findElement(btnNew);
        element.click();
    }

    public void clickNewTopic(){
        threadSleep();
        WebElement element = driver.findElement(NewTopic);
        element.click();
    }

    public void clickBtnLike(){
        threadSleep();
        WebElement element = driver.findElement(btnLike);
        element.click();
    }

    public void quitBrowser(){
        driver.quit();
    }
}
