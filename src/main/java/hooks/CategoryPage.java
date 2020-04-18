package hooks;

import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class CategoryPage extends WebDriverSettings {
  private final WebDriver driver;

  public CategoryPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnCategory = xpath("//a[@href='/categories/']");
  private By selectCategory = xpath("//h4[@class='media-heading']/a");
  private By selectTopic = xpath("//a[@class='item-title thread-title']");
  private By titleHeader = xpath("//div[@class='container']//h1");

  public void isElementdisplayed(WebElement element) {
    Assert.assertTrue(element.isDisplayed());
  }

  public void clickCategory() {
    threadSleep();
    WebElement element = driver.findElement(btnCategory);
    isElementdisplayed(element);
    element.click();
  }

  public void assertTitleHeader() {
    WebElement element = driver.findElement(titleHeader);
    isElementdisplayed(element);
  }

  public void selectWithCategory() {
    WebElement element = driver.findElement(selectCategory);
    if (element != null) {
      element.click();
    } else {
      throw new PendingException("Категория отсутствует");
    }
  }

  public void clickTopic() {
    WebElement element = driver.findElement(selectTopic);
    if (element != null) {
      element.click();
    } else {
      throw new PendingException("Тема отсутствует");
    }
  }

  public void quitBrowser() {
    driver.quit();
  }
}
