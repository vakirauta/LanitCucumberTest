package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class ViewUsers extends WebDriverSettings{
    private final WebDriver driver;

    public ViewUsers(WebDriver driver) {
        this.driver = driver;
    }

    private By btnUsers = xpath("//a[@href='/users/']");
    private By btnTopPosters = xpath("//a[@href='/users/active-posters/']");
    private By btnForumTeam = xpath("//a[@href='/users/forum-team/']");

    public void clickBtnUsers(){
        threadSleep();
        WebElement element = driver.findElement(btnUsers);
        element.click();
    }

    public void clickTopPosters(){
        threadSleep();
        WebElement element = driver.findElement(btnTopPosters);
        element.click();
    }

    public void clickForumTeam(){
        threadSleep();
        WebElement element = driver.findElement(btnForumTeam);
        element.click();
    }

    public void quitBrowser(){
        driver.quit();
    }
}
