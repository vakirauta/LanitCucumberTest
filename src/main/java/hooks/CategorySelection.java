package hooks;

import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class CategorySelection extends WebDriverSettings{
    private final WebDriver driver;

    public CategorySelection(WebDriver driver) {
        this.driver = driver;
    }

    private By btnCategory = xpath("//a[@href='/categories/']");
    private By selectCategory = xpath("//h4[@class='media-heading']");
    private By selectTopic = xpath("//a[@class='item-title thread-title']");

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

    public void clickCategory(){
        threadSleep();
        WebElement element = driver.findElement(btnCategory);
        element.click();
    }

    public void selectWithCategory(){
        threadSleep();
        WebElement element = driver.findElement(selectCategory);
        element.click();
    }

    public void clickTopic(){
        threadSleep();
        WebElement element = driver.findElement(selectTopic);
        if (element != null) {
            element.click();
        }else{
            throw new PendingException();
        }
    }

    public void quitBrowser(){
        driver.quit();
    }
}
