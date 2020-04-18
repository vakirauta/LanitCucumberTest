package hooks;

import authorizationSteps.AuthorizationSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class ProfilePage extends AuthorizationSteps {

  private final WebDriver driver;

  private By btnProfile = xpath("//img[@class='user-avatar']");
  private By btnChangeAvatar = xpath("//button[@class='btn-link']");
  private By btnGenerateIndividualAvatar = xpath("//button[contains(text(),'Сгенерировать')]");
  private By alert = cssSelector(".alert");
  private By btnExit = xpath("//button[text()='Выход']");

  public ProfilePage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickBtnProfile() {
    threadSleep();
    WebElement element = driver.findElement(btnProfile);
    Assert.assertNotNull(element);
    element.click();
  }

  public void clickBtnChangeAvatar() {
    WebElement element = driver.findElement(btnChangeAvatar);
    isElementdisplayed(element);
    element.click();
  }

  public void clickBtnGenerateIndividualAvatar() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element1 =
        wait.until(ExpectedConditions.presenceOfElementLocated(btnGenerateIndividualAvatar));
    Assert.assertNotNull(element1);
    element1.click();
  }

  public String setTextAlert() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
    return element1.getText();
  }

  public void clickBtnExit() {
    WebElement element = driver.findElement(btnExit);
    isElementdisplayed(element);
    element.click();
    driver.switchTo().alert().accept();
  }

  public void assertDisplayIconProfile() {
    WebElement element = driver.findElement(btnProfile);
    Assert.assertNotNull(element);
  }

  public void quitBrowser() {
    driver.quit();
  }
}
