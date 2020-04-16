package steps;

import cucumber.api.java.ru.Когда;
import hooks.ReplyFunction;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;

public class StepsReplyFunction {

    WebDriverSettings settings = new WebDriverSettings();
    private String textMessage;
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для проверки функции Ответить$")
    public void authorisationReplyFunction(){
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
