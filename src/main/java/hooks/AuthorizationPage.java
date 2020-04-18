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
    element.click();
  }

  public void assertFormAuthorization(){
    threadSleep();
    WebElement element = driver.findElement(formAuthorization);
     isElementdisplayed(element);
  }

  public String inputLogin(String login) {
    WebElement element = driver.findElement(formLogin);
    element.sendKeys(login);
    return element.getAttribute("value");
  }

  public String inputPass(String pass) {
    WebElement element = driver.findElement(formPass);
    element.sendKeys(pass);
    return element.getAttribute("value");
  }

  public void clickSubmit() {
    WebElement element = driver.findElement(btnEntry);
    element.click();
  }

  public void assertIconProfile(){
    threadSleep();
    WebElement element = driver.findElement(iconProfile);
    isElementdisplayed(element);
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
