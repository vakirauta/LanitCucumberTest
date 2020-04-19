package hooks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class ThemePage{

  private WebDriver driver;

  public String login = "Alexandr11";
  public String pass = "1ybrjkfc89";

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");
  private By btnMy = xpath("//div[@id='page-mount']//li[2]/a");
  private By tabTheme = xpath("//a[contains(text(),'Темы')]");
  private By btnEdit = xpath("//button[@class='hidden-xs btn btn-default btn-sm pull-right']");
  private By textArea = xpath("//textarea[@id='editor-textarea']");
  private By btnNew = xpath("//a[contains(text(),'Новые')]");
  private By btnLike = xpath("//button[text()='Лайк']");
  private By selectTopic = xpath("//a[@class='item-title thread-title']");
  private By btnAnswer = xpath("//button[@class='btn btn-primary btn-sm pull-right']");
  private By formBody = xpath("//textarea[@id='editor-textarea']");
  private By btnSendAnswer = xpath("//button[text()='Отправить ответ']");
  private By btnNewTheme = xpath("//button[text()='Новая тема']");
  private By enterText = xpath("//input[@placeholder='Заголовок темы']");
  private By enterFieldText = id("editor-textarea");
  private By btnPublish = xpath("//button[text()='Опубликовать тему']");
  private By btnLikeText = xpath("//button[text()='Нравится']");

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

  public void clickTabTheme() {
    driver.navigate().refresh();
    WebElement element = driver.findElement(tabTheme);
    Assert.assertTrue(element.isDisplayed());
    element.click();
  }

  public void clickTabThemes() {
    driver.navigate().refresh();
    WebElement element = driver.findElement(tabTheme);
    Assert.assertTrue(element.isDisplayed());
    element.click();
  }

  public void clickNewTopic() {
    WebElement element = driver.findElement(selectTopic);
    Assert.assertNotNull(element);
    element.click();
  }

  public void clickBtnLike() {
    driver.navigate().refresh();
    WebElement element = driver.findElement(btnLike);
    element.click();
  }

  public String assertBtnText() {
    WebElement element = driver.findElement(btnLikeText);
    return element.getText();
  }

  public void clickTopic() {
    driver.navigate().refresh();
    WebElement element = driver.findElement(selectTopic);
    Assert.assertNotNull(element);
    element.click();
  }

  public void clickBtnAnswer() {
    driver.navigate().refresh();
    WebElement element = driver.findElement(btnAnswer);
    Assert.assertNotNull(element);
    element.click();
  }

  public void inputTextAnswer(String text) {
    WebElement element = driver.findElement(formBody);
    element.clear();
    element.sendKeys(text);
  }

  public void clickBtnSendAnswer() {
    WebElement element = driver.findElement(btnSendAnswer);
    Assert.assertNotNull(element);
    element.click();
  }

  public String assertSentMessage(String text) {
    WebElement element = driver.findElement(xpath(String.format("//p[text()='%s']", text)));
    Assert.assertTrue(element.isDisplayed());
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
    driver.quit();
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
