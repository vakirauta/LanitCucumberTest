package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class CategoryPage {
  private WebDriver driver;

  public String login = "Alexandr11";
  public String pass = "1ybrjkfc89";

  public CategoryPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");
  private By btnCategory = xpath("//li[2]/a");
  private By selectCategory = xpath("//h4[@class='media-heading']/a");
  private By selectTopic = xpath("//a[@class='item-title thread-title']");
  private By titleHeader = xpath("//div[@class='container']//h1");

  public void isElementdisplayed(WebElement element) {
    Assert.assertTrue(element.isDisplayed());
  }

  public void authorization() {
    WebElement element = driver.findElement(btnLog);
    element.click();
    driver.findElement(formLogin).sendKeys(login);
    driver.findElement(formPass).sendKeys(pass);
    clickSubmit();
  }

  public void clickSubmit() {
    WebElement element = driver.findElement(btnEntry);
    element.click();
  }

  public void clickCategory() {
    driver.navigate().refresh();
    WebElement element = driver.findElement(btnCategory);
    element.click();
  }

  public void assertTitleHeader() {
    WebElement element = driver.findElement(titleHeader);
    isElementdisplayed(element);
  }

  public void selectWithCategory() {
    WebElement element = driver.findElement(selectCategory);
    element.click();
  }

  public void clickTopic() {
    WebElement element = driver.findElement(selectTopic);
    element.click();
    driver.quit();
  }

  public void quitBrowser() {
    driver.quit();
  }
}
