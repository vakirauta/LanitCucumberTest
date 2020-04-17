package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class AuthorizationPage extends WebDriverSettings{

  private final WebDriver driver;

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");
  private By formAuthorization = xpath("//div[@class='modal-content']");
  private By iconProfile = xpath("//img[@class='user-avatar']");

  public AuthorizationPage(WebDriver driver) {
    this.driver = driver;
  }



  public void getButton() {
    threadSleep();
    WebElement element = driver.findElement(btnLog);
    isElementDisplayed(element);
    element.click();
  }

  public void assertFormAuthorization(){
    threadSleep();
    WebElement element = driver.findElement(formAuthorization);
    isElementDisplayed(element);
  }

  public String inputLogin(String login) {
    threadSleep();
    WebElement element = driver.findElement(formLogin);
    isElementDisplayed(element);
    element.sendKeys(login);
    return element.getAttribute("value");
  }

  public String inputPass(String pass) {
    threadSleep();
    WebElement element = driver.findElement(formPass);
    isElementDisplayed(element);
    element.sendKeys(pass);
    return element.getAttribute("value");
  }

  public void clickSubmit() {
    WebElement element = driver.findElement(btnEntry);
    isElementDisplayed(element);
    element.click();
    threadSleep();
  }

  public void assertIconProfile(){
    WebElement element = driver.findElement(iconProfile);
    isElementDisplayed(element);
  }

  public void quitBrowser() {
    driver.quit();
  }

  public void threadSleep() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
