package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsLikeFunction{
    Hook hook = new Hook();
    private WebDriver driver = hook.getDriver();


    @Когда("^авторизация для проверки функции Лайк$")
    public void authorisationViewNewTopic(){
        ThemePage newTopics = new ThemePage(driver);
        newTopics.authorization();
    }

    @Когда("^нажать на вкладку Темы$")
    public void clickTabTheme(){
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickTabThemes();
    }

    @Когда("^нажать на вкладку Новые$")
    public void clickButtonNew() {
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickBtnNew();
    }

    @Когда("^кликнуть по новой теме$")
    public void clickNewTopic() {
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickNewTopic();
    }

    @Когда("^кликнуть по кнопке Лайк$")
    public void clickBtnLike() {
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickBtnLike();
    }

    @Тогда("^проверим что вместо кнопки Лайк появится кнопка с текстом (.+)$")
    public void assertBtnText(String text){
        ThemePage newTopics = new ThemePage(driver);
        Assert.assertEquals(text,newTopics.assertBtnText());
        newTopics.quitBrowser();
    }
}
