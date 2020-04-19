package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;

public class StepsReplyFunction {
    GetDriver get = new GetDriver();
    ThemePage themePage = new ThemePage(get.getDriver());

    @Когда("^авторизация для проверки функции Ответить$")
    public void authorisationReplyFunction(){
        themePage.authorization();
    }

    @Когда("^выбрать тему$")
    public void selectTopic() {
        themePage.clickTopic();
    }

    @Когда("^нажать кнопку Ответить$")
    public void clickBtnAnswer() {
        themePage.clickBtnAnswer();
    }

    @Когда("^Набрать текст сообщения (.*)$")
    public void inputTextMessage(String text) {
        themePage.inputTextAnswer(text);
    }

    @Когда("^нажать кнопку Отправить ответ$")
    public void clickBtnSendAnswer() {
        themePage.clickBtnSendAnswer();
    }

    @Тогда("^проверить что ответ отправлен поиском сообщения (.*)$")
    public void assertCheckingSentMessage(String text){
        Assert.assertEquals(text,themePage.assertSentMessage(text));
        themePage.quitBrowser();
    }
}
