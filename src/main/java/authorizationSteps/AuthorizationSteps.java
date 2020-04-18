package authorizationSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class AuthorizationSteps {

  public String getLogin() {
    return "Alexandr11";
  }

  public String getPass() {
    return "1ybrjkfc89";
  }

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");


  public void authorization(WebDriver driver) {
    WebElement element = driver.findElement(btnLog);
    element.click();
    driver.findElement(formLogin).sendKeys(getLogin());
    driver.findElement(formPass).sendKeys(getPass());
    clickSubmit(driver);
  }

  public void isElementdisplayed(WebElement element) {
    Assert.assertTrue(element.isDisplayed());
  }

  public void clickSubmit(WebDriver driver) {
    WebElement element = driver.findElement(btnEntry);
    element.click();
  }

  public void threadSleep() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
