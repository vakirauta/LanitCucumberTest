package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsReplyFunction{
    Hook hook = new Hook();
    private WebDriver driver = hook.getDriver();


    @Когда("^авторизация для проверки функции Ответить$")
    public void authorisationReplyFunction(){
        ThemePage themePage = new ThemePage(driver);
        themePage.authorization();
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

    @Когда("^Набрать текст сообщения (.*)$")
    public void inputTextMessage(String text) {
        ThemePage themePage = new ThemePage(driver);
        themePage.inputTextAnswer(text);
    }

    @Тогда("^проверить что ответ отправлен поиском сообщения (.*)$")
    public void assertCheckingSentMessage(String text){
        ThemePage themePage = new ThemePage(driver);
        Assert.assertEquals(text,themePage.assertSentMessage(text));
        themePage.quitBrowser();
    }
}
