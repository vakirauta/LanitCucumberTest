package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;

public class StepsEditTopic {

    private String newText;

    @Когда("^авторизация для редактирования темы$")
    public void authorisationEditTopic(){
        ThemePage editing = new ThemePage(precondition.driver);
        editing.authorization(precondition.driver);
    }

    @Когда("^кликнуть по вкладке Темы$")
    public void clickTabTheme(){
        ThemePage editing = new ThemePage(precondition.driver);
        editing.clickTabTheme();
    }

    @Когда("^кликнуть по вкладе Мои$")
    public void clickTheMyTab() {
        ThemePage editing = new ThemePage(precondition.driver);
        editing.clickBtnMy();
    }

    @Когда("^кликнуть на выбранную тему$")
    public void clickOnSelectedTopic() {
        ThemePage editing = new ThemePage(precondition.driver);
        editing.topicSelection();
    }

    @Когда("^кликнуть кнопку Изменить$")
    public void clickEdit() {
        ThemePage editing = new ThemePage(precondition.driver);
        editing.clickBtnEdit();
    }

    @Дано("^новый текст (.+)$")
    public void getNewText(String text){
        this.newText = text;
    }

    @Когда("^ввести новый текст и внести изменения$")
    public void changeTopicText() {
        ThemePage editing = new ThemePage(precondition.driver);
        editing.clickTextArea(newText);
    }

    @Тогда("^убедиться что тема изменена проверкой нового текста$")
    public void assertAlertMessage(){
        ThemePage editing = new ThemePage(precondition.driver);
//        editing.setNewTextTopic(newText);
        Assert.assertEquals(newText,editing.getNewTextTopic(newText));
    }

    @Когда("^выйти из браузера после изменения темы$")
    public void quitBrowser() {
        ThemePage editing = new ThemePage(precondition.driver);
        editing.quitBrowser();
    }

}
