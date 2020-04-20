package hooks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class ProfilePage{
  private WebDriver driver;

  public String login = "Alexandr11";
  public String pass = "1ybrjkfc89";

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");
  private By btnProfile = xpath("//img[@class='user-avatar']");
  private By btnChangeAvatar = xpath("//button[@class='btn-link']");
  private By btnGenerateIndividualAvatar = xpath("//button[contains(text(),'Сгенерировать')]");
  private By alert = cssSelector(".alert");
  private By btnExit = xpath("//button[text()='Выход']");

  public ProfilePage(WebDriver driver) {
    this.driver = driver;
  }

  public void authorization() {
    WebElement element = driver.findElement(btnLog);
    element.click();
    driver.findElement(formLogin).sendKeys(login);
    driver.findElement(formPass).sendKeys(pass);
    clickSubmit(driver);
  }

  public void clickSubmit(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnEntry));
    element.click();
  }

  public void clickBtnProfile() {
    WebDriverWait wait = new WebDriverWait(driver,10);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnProfile));
    element.click();
  }

  public void clickBtnChangeAvatar() {
    WebDriverWait wait = new WebDriverWait(driver,10);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnChangeAvatar));
    Assert.assertTrue(element.isDisplayed());
    element.click();

  }

  public void clickBtnGenerateIndividualAvatar() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnGenerateIndividualAvatar));
    element.click();
  }

  public String setTextAlert() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
    return element1.getText();
  }

  public void clickBtnExit() {
    WebElement element = driver.findElement(btnExit);
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
