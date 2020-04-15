package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class AddSurvey extends WebDriverSettings{

    private final WebDriver driver;

    public AddSurvey(WebDriver driver) {
        this.driver = driver;
    }

    private By btnProfile = xpath("//img[@class='user-avatar']");
    private By viewProfile = xpath("//li[3]/ul/li[3]/a");
    private By selectTopic = xpath("//a[@class='btn btn-link item-title']");
    private By btnSurvey = xpath("//div[2]/div/div[2]/button");
    private By btnChange = xpath("//button[text()='Изменить']");
    private By fieldSurvey = xpath("//input[@id='id_questions']");
    private By firstFieldOptions = xpath("//div/div/ul/li/input");
    private By secondFieldOptions = xpath("//li[2]/input");
    private By fieldVotingDuration = xpath("//input[@id='id_length']");
    private By btnVotingMessage = xpath(" //button[@class='btn btn-primary']");

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
        new CreateNewTheme(driver);
    }

    public void clickBtnProfile(){
        threadSleep();
        WebElement element = driver.findElement(btnProfile);
        element.click();
    }

    public void clickViewProfile(){
        threadSleep();
        WebElement element = driver.findElement(viewProfile);
        element.click();
    }

    public void selectTopic(){
        threadSleep();
        WebElement element = driver.findElement(selectTopic);
        element.click();
    }

    public void clickBtnSurvey(){
        threadSleep();
        WebElement element = driver.findElement(btnSurvey);
        if(btnSurvey != null){
            element.click();
            } else {
              WebElement element2 = driver.findElement(btnChange);
              element2.click();
            }
    }

    public void fieldSurvey(String text){
        threadSleep();
        WebElement element = driver.findElement(fieldSurvey);
        element.sendKeys(text);
    }

    public void fieldFirstSurvey(String text){
        threadSleep();
        WebElement element = driver.findElement(firstFieldOptions);
        element.sendKeys(text);
    }

    public void fieldSecondSurvey(String text){
        threadSleep();
        WebElement element = driver.findElement(secondFieldOptions);
        element.sendKeys(text);
    }

    public void enterVotingDuration(String x){
        threadSleep();
        WebElement element = driver.findElement(fieldVotingDuration);
        element.clear();
        threadSleep();
        element.sendKeys(x);
    }
    public void clickBtnVotingMessage(){
        threadSleep();
        WebElement element = driver.findElement(btnVotingMessage);
        element.click();
    }

    public void quitBrowser(){
        driver.quit();
    }
}
