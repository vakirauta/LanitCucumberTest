package hooks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class SearchPage{
  private final WebDriver driver;

  public String login = "Alexandr11";
  public String pass = "1ybrjkfc89";

  public SearchPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");
  private By btnSearch = xpath("//i[text()='search']");
  private By textArea = xpath("//input[@placeholder='Поиск']");
  private By textSearchMessage = xpath("//li[text()='Поиск не дал результатов.']");

  public void authorization() {
    WebElement element = driver.findElement(btnLog);
    element.click();
    driver.findElement(formLogin).sendKeys(login);
    driver.findElement(formPass).sendKeys(pass);
    clickSubmit(driver);
  }

  public void clickSubmit(WebDriver driver) {
    WebElement element = driver.findElement(btnEntry);
    element.click();
  }

  public void clickBtnSearch() {
    driver.navigate().refresh();
    WebElement element = driver.findElement(btnSearch);
    element.click();
  }

  public void clickTextAreaAndInputText(String text) {
    WebElement element = driver.findElement(textArea);
    element.sendKeys(text);
  }

  public String getUserName(String name) {
    WebElement element = driver.findElement(xpath(String.format("//h5[text()='%s']", name)));
    if (element != null) {
      Assert.assertTrue(element.isDisplayed());
      return element.getText();
    } else {
      WebElement element1 = driver.findElement(textSearchMessage);
      Assert.assertTrue(element1.isDisplayed());
      return element1.getText();
    }
  }

  public void quitBrowser() {
    driver.quit();
  }
}
