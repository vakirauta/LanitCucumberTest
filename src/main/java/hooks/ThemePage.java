package hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import retryingFindClick.RetryingFindClick;

import static org.openqa.selenium.By.*;

public class ThemePage extends RetryingFindClick {
  private WebDriver driver;

  public ThemePage(WebDriver driver) {
    this.driver = driver;
  }

  public String login = "Alexandr11";
  public String pass = "1ybrjkfc89";

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");
  private By btnMy = xpath("//div[@class='page-header-bg']//li[2]//a[1]");
  private By tabTheme = xpath("//a[contains(text(),'Темы')]");
  private By btnEdit = xpath("//button[@class='hidden-xs btn btn-default btn-sm pull-right']");
  private By textArea = xpath("//textarea[@id='editor-textarea']");
  private By btnNew = xpath("//div[@class='page-header-bg']//li[3]//a[1]");
  private By btnLike = xpath("//div[@class='post-footer']//button[1]");
  private By selectTopic = xpath("//div[2]/a");
  private By btnAnswer = xpath("//button[@class='btn btn-primary btn-block btn-outline']");
  private By formBody = xpath("//textarea[@id='editor-textarea']");
  private By btnNewTheme = xpath("//button[text()='Новая тема']");
  private By enterText = xpath("//input[@placeholder='Заголовок темы']");
  private By enterFieldText = id("editor-textarea");
  private By btnPublish = xpath("//button[text()='Опубликовать тему']");
  private By btnLikeText = xpath("//button[@class='btn btn-success btn-sm pull-left']");

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

  public void clickBtnNew() {
    WebElement element = driver.findElement(btnNew);
    element.click();
  }

  public void clickTabThemes() {
    retryingFindClick(driver,tabTheme);
  }

  public void clickNewTopic() {
    WebElement element = driver.findElement(selectTopic);
    element.click();
  }

  public void clickBtnLike() {
    retryingFindClick(driver,btnLike);
  }

  public String assertBtnText() {
    WebElement element = driver.findElement(btnLikeText);
    return element.getText();
  }

  public void clickTopic() {
    retryingFindClick(driver,selectTopic);
  }

  public void clickBtnAnswer() {
    driver.findElement(btnAnswer).click();
  }

  public void inputTextAnswer(String text) {
    WebElement element = driver.findElement(formBody);
    element.clear();
    element.sendKeys(text);
    element.submit();
  }

  public String assertSentMessage(String text) {
    WebElement element = driver.findElement(xpath(String.format("//p[text()='%s']", text)));
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
    clickTabThemes();
    WebElement element = driver.findElement(selectTopic);
    Assert.assertNotNull(element);
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
