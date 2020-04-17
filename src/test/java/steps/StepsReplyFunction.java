package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import hooks.WebDriverSettings;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsReplyFunction {

    WebDriverSettings settings = new WebDriverSettings();
    private String textMessage;
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для проверки функции Ответить$")
    public void authorisationReplyFunction(){
        ThemePage themePage = new ThemePage(driver);
        themePage.authorization(driver);
    }

    @Когда("^выбрать тему$")
    public void selectTopic() {
        ThemePage themePage = new ThemePage(driver);
        themePage.clickTopic();
    }

    @Когда("^нажать кнопку Ответить$")
    public void clickBtnAnswer() {
        ThemePage themePage = new ThemePage(driver);
        themePage.clickBtnAnswer();
    }

    @Когда("^текст сообщения (.*)$")
    public void textMessages(String text) {
        this.textMessage = text;
    }

    @Когда("^Набрать текст сообщения$")
    public void inputTextMessage() {
        ThemePage themePage = new ThemePage(driver);
        themePage.inputTextAnswer(textMessage);
    }

    @Когда("^нажать кнопку отправить ответ$")
    public void clickBtnSendAnswer() {
        ThemePage themePage = new ThemePage(driver);
        themePage.clickBtnSendAnswer();
    }

    @Тогда("^проверить что ответ отправлен поиском этого сообщения$")
    public void assertCheckingSentMessage(){
        ThemePage themePage = new ThemePage(driver);
        themePage.setMyAnswer(textMessage);
        Assert.assertEquals(textMessage,themePage.assertSentMEssage(textMessage));
    }

    @Когда("^выйти из браузера после отправки ответа$")
    public void quitBrowser(){
        ThemePage themePage = new ThemePage(driver);
        themePage.quitBrowser();
    }
}
