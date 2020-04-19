package hooks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class AuthorizationPage{

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
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(btnLog)));
    element.click();
  }

  public void assertFormAuthorization() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element1 =
        wait.until(ExpectedConditions.presenceOfElementLocated(formAuthorization));
    Assert.assertNotNull(element1);
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

  public void assertIconProfile() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(iconProfile));
    Assert.assertNotNull(element1);
    driver.quit();
  }

  public void quitBrowser() {
    driver.quit();
  }
}
