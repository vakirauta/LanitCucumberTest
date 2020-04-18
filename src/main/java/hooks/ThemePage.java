package hooks;

import authorizationSteps.AuthorizationSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.*;

public class ThemePage extends AuthorizationSteps {

  private final WebDriver driver;

  private By btnMy = xpath("//div[@id='page-mount']//li[2]/a");
  private By tabTheme = xpath("//a[contains(text(),'Темы')]");
  private By btnEdit = xpath("//button[@class='hidden-xs btn btn-default btn-sm pull-right']");
  private By textArea = xpath("//textarea[@id='editor-textarea']");
  private By btnNew = xpath("//a[contains(text(),'Новые')]");
  private By btnLike = xpath("//button[text()='Лайк']");
  private By selectTopic = xpath("//a[@class='item-title thread-title']");
  private By btnAnswer = xpath("//button[text()='Ответить']");
  private By formBody = xpath("//textarea[@id='editor-textarea']");
  private By btnSendAnswer = xpath("//button[text()='Отправить ответ']");
  private By btnNewTheme = xpath("//button[text()='Новая тема']");
  private By enterText = xpath("//input[@placeholder='Заголовок темы']");
  private By enterFieldText = id("editor-textarea");
  private By btnPublish = xpath("//button[text()='Опубликовать тему']");
  private By btnLikeText = xpath("//button[text()='Нравится']");

  public void clickBtnNew() {
    WebElement element = driver.findElement(btnNew);
    element.click();
  }

  public void clickTabTheme() {
    threadSleep();
    WebElement element = driver.findElement(tabTheme);
    Assert.assertNotNull(element);
    element.click();
  }

  public void clickNewTopic() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(selectTopic));
    Assert.assertNotNull(element1);
    element1.click();
  }

  public void clickBtnLike() {

    WebElement element = driver.findElement(btnLike);
    element.click();
  }

  public String assertBtnText() {
    threadSleep();
    WebElement element = driver.findElement(btnLikeText);
    return element.getText();
  }

  public void clickTopic() {
    threadSleep();
    WebElement element = driver.findElement(selectTopic);
    Assert.assertNotNull(element);
    element.click();
  }

  public void clickBtnAnswer() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(btnAnswer));
    Assert.assertNotNull(element1);
    element1.click();
  }

  public void inputTextAnswer(String text) {
    WebElement element = driver.findElement(formBody);
    element.sendKeys(text);
  }

  public void clickBtnSendAnswer() {
    threadSleep();
    WebElement element = driver.findElement(btnSendAnswer);
    element.click();
  }

  public String assertSentMessage(String text) {
    threadSleep();
    WebElement element = driver.findElement(xpath(String.format("//p[text()= '%s']", text)));
    isElementdisplayed(element);
    return element.getText();
  }

  public void clickBtnNewTheme() {
    WebElement element = driver.findElement(btnNewTheme);
    element.click();
  }

  public String enterCaptionText(String text) {
    WebElement element = driver.findElement(enterText);
    element.sendKeys(text);
    return element.getAttribute("value");
  }

  public String enterFieldText(String text) {
    WebElement element = driver.findElement(enterFieldText);
    element.sendKeys(text);
    return element.getAttribute("innerHTML");
  }

  public void clickBtnPublish() {
    WebElement element = driver.findElement(btnPublish);
    element.click();
  }

  public void assertNewTheme() {
    clickTabTheme();
    WebElement element = driver.findElement(selectTopic);
    Assert.assertNotNull(element);
  }

  public ThemePage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickBtnMy() {
    WebElement element = driver.findElement(btnMy);
    element.click();
  }

  public void topicSelection() {
    WebElement element = driver.findElement(selectTopic);
    if (element != null) {
      element.click();
    } else {
      System.out.println(element + " отсутствует");
    }
  }

  public void clickBtnEdit() {
    WebElement element = driver.findElement(btnEdit);
    element.click();
  }

  public void clickTextArea(String text) {
    WebElement element = driver.findElement(textArea);
    element.clear();
    element.sendKeys(text);
    element.submit();
  }

  public String getNewTextTopic(String text) {
    WebElement element = driver.findElement(xpath(String.format("//p[text()='%s']", text)));
    return element.getText();
  }

  public void quitBrowser() {
    driver.quit();
  }
}
