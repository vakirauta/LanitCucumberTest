package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;

public class StepsLikeFunction {

    @Когда("^авторизация для проверки функции Лайк$")
    public void authorisationViewNewTopic(){
        ThemePage newTopics = new ThemePage(precondition.driver);
        newTopics.authorization(precondition.driver);
    }
    @Когда("^нажать по вкладке Темы$")
    public void clickTabTheme(){
        ThemePage newTopics = new ThemePage(precondition.driver);
        newTopics.clickTabTheme();
    }

    @Когда("^кликнуть по вкладке Новые$")
    public void clickButtonNew() {
        ThemePage newTopics = new ThemePage(precondition.driver);
        newTopics.clickBtnNew();
    }

    @Когда("^кликнуть по новой теме$")
    public void clickNewTopic() {
        ThemePage newTopics = new ThemePage(precondition.driver);
        newTopics.clickNewTopic();
    }

    @Когда("^кликнуть по кнопке Лайк$")
    public void clickBtnLike() {
        ThemePage newTopics = new ThemePage(precondition.driver);
        newTopics.clickBtnLike();
    }

    @Тогда("^проверим что вместо кнопки Лайк появится кнопка с текстом (.+)$")
    public void assertBtnText(String text){
        ThemePage newTopics = new ThemePage(precondition.driver);
        Assert.assertEquals(text,newTopics.assertBtnText());
    }

    @Когда("^выйти из браузера после оценки$")
    public void quitBrowserAfterViewNewTopic() {
        ThemePage newTopics = new ThemePage(precondition.driver);
        newTopics.quitBrowser();
    }
}
