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
    private By selectCategory = xpath("//h4[@class='media-heading']/a");
    private By selectTopic = xpath("//a[@class='item-title thread-title']");

    public void clickCategory(){
        WebElement element = driver.findElement(btnCategory);
        element.click();
        threadSleep();
    }

    public void selectWithCategory(){
        WebElement element = driver.findElement(selectCategory);
        element.click();
        threadSleep();
    }

    public void clickTopic(){
        WebElement element = driver.findElement(selectTopic);
        if (element != null) {
            element.click();
            threadSleep();
        }else{
            throw new PendingException();
        }
    }

    public void quitBrowser(){
        driver.quit();
    }
}
