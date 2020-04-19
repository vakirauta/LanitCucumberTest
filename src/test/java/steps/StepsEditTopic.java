package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;

public class StepsEditTopic {
    GetDriver get = new GetDriver();
    ThemePage editing = new ThemePage(get.getDriver());

    @Когда("^авторизация для редактирования темы$")
    public void authorisationEditTopic(){
        editing.authorization();
    }

    @Когда("^кликнуть по вкладке Темы$")
    public void clickTabTheme(){
        editing.clickTabThemes();
    }

    @Когда("^кликнуть по вкладке Мои$")
    public void clickTheMyTab() {
        editing.clickBtnMy();
    }

    @Когда("^кликнуть на выбранную тему$")
    public void clickOnSelectedTopic() {
        editing.topicSelection();
    }

    @Когда("^кликнуть кнопку Изменить$")
    public void clickEdit() {
        editing.clickBtnEdit();
    }

    @Когда("^ввести новый текст (.+) и внести изменения$")
    public void changeTopicText(String text) {
        editing.clickTextArea(text);
    }

    @Тогда("^убедиться что тема изменена на (.+)$")
    public void assertAlertMessage(String text){
        Assert.assertEquals(text,editing.getNewTextTopic(text));
        editing.quitBrowser();
    }
}
