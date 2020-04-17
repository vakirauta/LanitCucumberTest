package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class SearchPage extends WebDriverSettings {
  private final WebDriver driver;

  private String userName;

  public SearchPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnSearch = xpath("//i[text()='search']");
  private By textArea = xpath("//input[@placeholder='Поиск']");
  private By choiseSearch = xpath("//h5[text()=" + userName + "]");
  private By textSearchMessage = xpath("//li[text()='Поиск не дал результатов.']");

  public void clickBtnSearch() {
    WebElement element = driver.findElement(btnSearch);
    isElementDisplayed(element);
    element.click();
    threadSleep();
  }

  public void clickTextAreaAndInputText(String text) {
    WebElement element = driver.findElement(textArea);
    isElementDisplayed(element);
    element.sendKeys(text);
    threadSleep();
  }

  public String getMessage() {
    threadSleep();
    WebElement element = driver.findElement(textSearchMessage);
    isElementDisplayed(element);
    String text = element.getText();
    return text;
  }

  public String getUserName(String name) {
    threadSleep();
    WebElement element = driver.findElement(xpath(String.format("//h5[text()='%s']", name)));
    isElementDisplayed(element);
    String search = element.getText();
    return search;
  }

  public void quitBrowser() {
    driver.quit();
  }
}
