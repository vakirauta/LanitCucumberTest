package hooks;

import authorizationSteps.AuthorizationSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class SearchPage extends AuthorizationSteps {
  private final WebDriver driver;

  public SearchPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnSearch = xpath("//i[text()='search']");
  private By textArea = xpath("//input[@placeholder='Поиск']");
  private By textSearchMessage = xpath("//li[text()='Поиск не дал результатов.']");

  public void clickBtnSearch() {
    threadSleep();
    WebElement element = driver.findElement(btnSearch);
    Assert.assertNotNull(element);
    element.click();
  }

  public void clickTextAreaAndInputText(String text) {
    WebElement element = driver.findElement(textArea);
    element.sendKeys(text);
  }

  public String getUserName(String name) {
    WebElement element = driver.findElement(xpath(String.format("//h5[text()='%s']", name)));
    if (element != null) {
      isElementdisplayed(element);
      return element.getText();
    } else {
      WebElement element1 = driver.findElement(textSearchMessage);
      isElementdisplayed(element1);
      return element1.getText();
    }
  }

  public void quitBrowser() {
    driver.quit();
  }
}
