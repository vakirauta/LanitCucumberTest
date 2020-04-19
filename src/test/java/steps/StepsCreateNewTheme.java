package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;

public class StepsCreateNewTheme {
    GetDriver get = new GetDriver();
    ThemePage newTheme = new ThemePage(get.getDriver());

    @Когда("^авторизация для создания темы$")
    public void authorisationCreateNewTheme(){
        newTheme.authorization();
    }

    @Когда("^кликнуть по кнопке Новая тема$")
    public void clickTheNewTopicButton() {
        newTheme.clickBtnNewTheme();
    }

    @Когда("^ввести текст (.+) в поле заголовка темы$")
    public void enterTextInTheSubjectTitleField(String text) {
        Assert.assertEquals(text,newTheme.enterCaptionText(text));
    }

    @Когда("^ввести основной текст (.+) для новой темы$")
    public void enterTheMainBodyOfTheTopic(String text) {
        Assert.assertEquals(text,newTheme.enterFieldText(text));
    }

    @Когда("^запостить тему$")
    public void postTopic() {
        newTheme.clickBtnPublish();
    }

    @Тогда("^убедится что тема создана проверив ee присутствие в списке тем$")
    public void assertNewTheme(){
        newTheme.assertNewTheme();
    }

}
