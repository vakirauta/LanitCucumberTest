package hooks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class ProfilePage extends WebDriverSettings {

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
    isElementdisplayed(element);
    element.click();
  }

  public void clickBtnChangeAvatar() {
    WebElement element = driver.findElement(btnChangeAvatar);
    isElementdisplayed(element);
    element.click();
  }

  public void clickBtnGenerateIndividualAvatar() {
    threadSleep();
    WebElement element = driver.findElement(btnGenerateIndividualAvatar);
    isElementdisplayed(element);
    element.click();
  }

  public String setTextAlert() {
    threadSleep();
    WebElement element = driver.findElement(alert);
    return element.getText();
  }

  public void clickBtnExit() {
    WebElement element = driver.findElement(btnExit);
    isElementdisplayed(element);
    element.click();
    driver.switchTo().alert().accept();
  }

  public void assertDisplayIconProfile(){
    WebElement element = driver.findElement(btnProfile);
    Assert.assertFalse(element.isDisplayed());
  }

  public void quitBrowser() {
    driver.quit();
  }
}
