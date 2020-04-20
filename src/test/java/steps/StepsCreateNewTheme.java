package steps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsCreateNewTheme{
    Hook hook = new Hook();
    private WebDriver driver = hook.getDriver();


    @Когда("^авторизация для создания темы$")
    public void authorisationCreateNewTheme(){
        ThemePage newTheme = new ThemePage(driver);
        newTheme.authorization();
    }

    @Когда("^кликнуть по кнопке Новая тема$")
    public void clickTheNewTopicButton() {
        ThemePage newTheme = new ThemePage(driver);
        newTheme.clickBtnNewTheme();
    }

    @Когда("^ввести текст (.+) в поле заголовка темы$")
    public void enterTextInTheSubjectTitleField(String text) {
        ThemePage newTheme = new ThemePage(driver);
        Assert.assertEquals(text,newTheme.enterCaptionText(text));
    }

    @Когда("^ввести основной текст (.+) для новой темы$")
    public void enterTheMainBodyOfTheTopic(String text) {
        ThemePage newTheme = new ThemePage(driver);
        Assert.assertEquals(text,newTheme.enterFieldText(text));
    }

    @Когда("^запостить тему$")
    public void postTopic() {
        ThemePage newTheme = new ThemePage(driver);
        newTheme.clickBtnPublish();
    }

    @Тогда("^убедится что тема создана проверив ee присутствие в списке тем$")
    public void assertNewTheme(){
        ThemePage newTheme = new ThemePage(driver);
        newTheme.assertNewTheme();
        newTheme.quitBrowser();
    }

}
