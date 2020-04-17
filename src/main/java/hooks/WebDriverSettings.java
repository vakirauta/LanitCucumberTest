package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class WebDriverSettings {

  private String login = "Alexandr11";
  private String pass = "1ybrjkfc89";

  public String getLogin() {
    return login;
  }

  public String getPass() {
    return pass;
  }

  By btnLog = xpath("//button[text()='Войти']");
  By formLogin = xpath("//input[@id='id_username']");
  By formPass = xpath("//input[@id='id_password']");
  By btnEntry = xpath("//button[@type='submit']");

  public WebDriver getDriver() {
    System.setProperty(
        "webdriver.chrome.driver",
        "src\\main\\resources\\chromedriver79.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://dev.n7lanit.ru/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
  }

  public void authorization(WebDriver driver) {
    WebElement element = driver.findElement(btnLog);
    element.click();
    threadSleep();
    driver.findElement(formLogin).sendKeys(getLogin());
    driver.findElement(formPass).sendKeys(getPass());
    clickSubmit(driver);
  }

  public void isElementDisplayed(WebElement element) {
    Assert.assertTrue(element.isDisplayed());
  }

  public void clickSubmit(WebDriver driver) {
    WebElement element = driver.findElement(btnEntry);
    isElementDisplayed(element);
    element.click();
    threadSleep();
  }

  public void threadSleep() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
