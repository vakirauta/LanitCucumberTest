package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class ThemePage extends WebDriverSettings {

  private WebDriver driver;
  private String newTextTopic;
  private String myAnswer;

  private By btnMy = xpath("//div[@id='page-mount']//li[2]/a");
  private By tabTheme = xpath("//a[contains(text(),'Темы')]");
  private By btnEdit = xpath("//button[@class='hidden-xs btn btn-default btn-sm pull-right']");
  private By textArea = xpath("//textarea[@id='editor-textarea']");
  private By btnNew = xpath("//a[contains(text(),'Новые')]");
  private By btnLike = xpath("//button[contains(.,'Лайк')]");
  private By selectTopic = xpath("//a[@class='item-title thread-title']");
  private By btnAnswer = xpath("//button[text()='Ответить']");
  private By formBody = xpath("//textarea[@id='editor-textarea']");
  private By btnSendAnswer = xpath("//button[text()='Отправить ответ']");
  private By btnNewTheme = xpath("//button[text()='Новая тема']");
  private By enterText = xpath("//input[@placeholder='Заголовок темы']");
  private By enterFieldText = id("editor-textarea");
  private By btnPublish = xpath("//button[text()='Опубликовать тему']");
  private By assertMyAnswer = xpath("//p[text()= "+ myAnswer+"]");
  private By btnLikeText = xpath("//button[text()='Нравится']");

  public void clickBtnNew() {
    threadSleep();
    WebElement element = driver.findElement(btnNew);
    element.click();
  }

  public void clickTabTheme(){
    WebElement element = driver.findElement(tabTheme);
    isElementDisplayed(element);
    element.click();
  }

  public void clickNewTopic() {
    threadSleep();
    WebElement element = driver.findElement(selectTopic);
    isElementDisplayed(element);
    element.click();
  }

  public void clickBtnLike() {
    threadSleep();
    WebElement element = driver.findElement(btnLike);
    isElementDisplayed(element);
    element.click();
  }

  public String assertBtnText(){
    WebElement element = driver.findElement(btnLikeText);
    isElementDisplayed(element);
    String text = element.getText();
    return text;
  }

  public void clickTopic() {
    threadSleep();
    WebElement element = driver.findElement(selectTopic);
    isElementDisplayed(element);
    element.click();
  }

  public void clickBtnAnswer() {
    threadSleep();
    WebElement element = driver.findElement(btnAnswer);
    isElementDisplayed(element);
    element.click();
  }

  public void inputTextAnswer(String text) {
    threadSleep();
    WebElement element = driver.findElement(formBody);
    isElementDisplayed(element);
    element.sendKeys(text);
  }

  public void clickBtnSendAnswer() {
    threadSleep();
    WebElement element = driver.findElement(btnSendAnswer);
    isElementDisplayed(element);
    element.click();
  }

  public void setMyAnswer(String text){
    this.myAnswer = text;
  }

  public String assertSentMEssage(String text){
    threadSleep();
    WebElement element = driver.findElement(xpath(String.format("//p[text()= '%s']",text)));
    isElementDisplayed(element);
    String answer = element.getText();
    return answer;
  }

  public void clickBtnNewTheme() {
    WebElement element = driver.findElement(btnNewTheme);
    isElementDisplayed(element);
    element.click();
    threadSleep();
  }

  public String enterCaptionText(String text) {
    WebElement element = driver.findElement(enterText);
    isElementDisplayed(element);
    element.sendKeys(text);
    return element.getAttribute("value");
  }

  public String enterFieldText(String text) {
    threadSleep();
    WebElement element = driver.findElement(enterFieldText);
    isElementDisplayed(element);
    element.sendKeys(text);
    return element.getAttribute("innerHTML");
  }

  public void clickBtnPublish() {
    WebElement element = driver.findElement(btnPublish);
    isElementDisplayed(element);
    element.click();
  }

  public void assertNewTheme(){
    clickTabTheme();
    threadSleep();
    WebElement element = driver.findElement(selectTopic);
    isElementDisplayed(element);
    isElementDisplayed(element);
  }

  public ThemePage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickBtnMy() {
    WebElement element = driver.findElement(btnMy);
    isElementDisplayed(element);
    element.click();
    threadSleep();
  }

  public void topicSelection() {
    WebElement element = driver.findElement(selectTopic);
    if (element != null) {
      element.click();
      threadSleep();
    } else {
      System.out.println(element + " отсутствует");
    }
  }

  public void clickBtnEdit() {
    WebElement element = driver.findElement(btnEdit);
    isElementDisplayed(element);
    element.click();
    threadSleep();
  }

  public void clickTextArea(String text) {
    WebElement element = driver.findElement(textArea);
    element.clear();
    element.sendKeys(text);
    threadSleep();
    element.submit();
  }

  public void setNewTextTopic(String text){
    this.newTextTopic = text;
  }

  public String getNewTextTopic(String text){
    threadSleep();
    WebElement element = driver.findElement(xpath(String.format("//p[text()='%s']", text)));
    String newText = element.getText();
    return newText;
  }

  public void quitBrowser() {
    driver.quit();
  }
}
