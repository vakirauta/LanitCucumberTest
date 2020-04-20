package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsEditTopic{
    Hook hook = new Hook();
    private WebDriver driver = hook.getDriver();


    @Когда("^авторизация для редактирования темы$")
    public void authorisationEditTopic(){
        ThemePage editing = new ThemePage(driver);
        editing.authorization();
    }

    @Когда("^выбрать вкладку Темы$")
    public void clickTabTheme(){
        ThemePage editing = new ThemePage(driver);
        editing.clickTabThemes();
    }

    @Когда("^выбрать вкладку Мои$")
    public void clickTheMyTab() {
        ThemePage editing = new ThemePage(driver);
        editing.clickBtnMy();
    }

    @Когда("^кликнуть на выбранную тему$")
    public void clickOnSelectedTopic() {
        ThemePage editing = new ThemePage(driver);
        editing.topicSelection();
    }

    @Когда("^кликнуть кнопку Изменить$")
    public void clickEdit() {
        ThemePage editing = new ThemePage(driver);
        editing.clickBtnEdit();
    }

    @Когда("^ввести новый текст (.+) и внести изменения$")
    public void changeTopicText(String text) {
        ThemePage editing = new ThemePage(driver);
        editing.clickTextArea(text);
    }

    @Тогда("^убедиться что тема изменена на (.+)$")
    public void assertAlertMessage(String text){
        ThemePage editing = new ThemePage(driver);
        Assert.assertEquals(text,editing.getNewTextTopic(text));
        editing.quitBrowser();
    }
}
