package steps;

import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import hooks.ReplyFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsReplyFunction {

    private String textMessage;

    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^авторизация для проверки функции Ответить$")
    public void authorisationReplyFunction(){
        getDriver();
        ReplyFunction replyFunction = new ReplyFunction(driver);
        replyFunction.authorization(driver);
    }

    @Когда("^выбрать тему$")
    public void selectTopic() {
        ReplyFunction replyFunction = new ReplyFunction(driver);
        replyFunction.clickTopic();
    }

    @Когда("^нажать кнопку Ответить$")
    public void clickBtnAnswer() {
        ReplyFunction replyFunction = new ReplyFunction(driver);
        replyFunction.clickBtnAnswer();
    }

    @Когда("^текст сообщения (.*)$")
    public void textMessages(String text) {
        this.textMessage = text;
    }

    @Когда("^Набрать текст сообщения$")
    public void inputTextMessage() {
        ReplyFunction replyFunction = new ReplyFunction(driver);
        replyFunction.inputTextAnswer(textMessage);
    }

    @Когда("^нажать кнопку отправить ответ$")
    public void clckBtnSendAnswer() {
        ReplyFunction replyFunction = new ReplyFunction(driver);
        replyFunction.clickBtnAnswer();
    }

    @Когда("^выйти из браузера после отправки ответа$")
    public void quitBrowser(){
        ReplyFunction replyFunction = new ReplyFunction(driver);
        replyFunction.quitBrowser();
    }
}
