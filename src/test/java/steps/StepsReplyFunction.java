package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;

public class StepsReplyFunction {
    private String textMessage;

    @Когда("^авторизация для проверки функции Ответить$")
    public void authorisationReplyFunction(){
        ThemePage themePage = new ThemePage(precondition.driver);
        themePage.authorization(precondition.driver);
    }

    @Когда("^выбрать тему$")
    public void selectTopic() {
        ThemePage themePage = new ThemePage(precondition.driver);
        themePage.clickTopic();
    }

    @Когда("^нажать кнопку Ответить$")
    public void clickBtnAnswer() {
        ThemePage themePage = new ThemePage(precondition.driver);
        themePage.clickBtnAnswer();
    }

    @Когда("^текст сообщения (.*)$")
    public void textMessages(String text) {
        this.textMessage = text;
    }

    @Когда("^Набрать текст сообщения$")
    public void inputTextMessage() {
        ThemePage themePage = new ThemePage(precondition.driver);
        themePage.inputTextAnswer(textMessage);
    }

    @Когда("^нажать кнопку отправить ответ$")
    public void clickBtnSendAnswer() {
        ThemePage themePage = new ThemePage(precondition.driver);
        themePage.clickBtnSendAnswer();
    }

    @Тогда("^проверить что ответ отправлен поиском этого сообщения$")
    public void assertCheckingSentMessage(){
        ThemePage themePage = new ThemePage(precondition.driver);
        Assert.assertEquals(textMessage,themePage.assertSentMessage(textMessage));
    }

    @Когда("^выйти из браузера после отправки ответа$")
    public void quitBrowser(){
        ThemePage themePage = new ThemePage(precondition.driver);
        themePage.quitBrowser();
    }
}
