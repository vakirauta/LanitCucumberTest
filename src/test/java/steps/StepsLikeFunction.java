package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;

public class StepsLikeFunction {
    GetDriver get = new GetDriver();
    ThemePage newTopics = new ThemePage(get.getDriver());

    @Когда("^авторизация для проверки функции Лайк$")
    public void authorisationViewNewTopic(){
        newTopics.authorization();
    }

    @Когда("^нажать на вкладку Темы$")
    public void clickTabTheme(){
        newTopics.clickTabTheme();
    }

    @Когда("^нажать на вкладку Новые$")
    public void clickButtonNew() {
        newTopics.clickBtnNew();
    }

    @Когда("^кликнуть по новой теме$")
    public void clickNewTopic() {
        newTopics.clickNewTopic();
    }

    @Когда("^кликнуть по кнопке Лайк$")
    public void clickBtnLike() {
        newTopics.clickBtnLike();
    }

    @Тогда("^проверим что вместо кнопки Лайк появится кнопка с текстом (.+)$")
    public void assertBtnText(String text){
        Assert.assertEquals(text,newTopics.assertBtnText());
        newTopics.quitBrowser();
    }
}
