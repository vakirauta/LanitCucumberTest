package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.CategoryPage;
import hooks.ThemePage;
import hooks.WebDriverSettings;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsCreateNewTheme {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    private String textForTitle;
    private String textForBody;

    @Когда("^авторизация для создания темы$")
    public void authorisationCreateNewTheme(){
        CategoryPage selection = new CategoryPage(driver);
        selection.authorization(driver);
    }

    @Когда("^кликнуть по кнопке Новая тема$")
    public void clickTheNewTopicButton() {
        ThemePage newTheme = new ThemePage(driver);
        newTheme.clickBtnNewTheme();
    }

    @Дано("^текст заголовка для новой темы (.+)$")
    public void getTextForTitle(String text){
        this.textForTitle = text;
    }


    @Когда("^ввести текст в поле заголовка темы$")
    public void enterTextInTheSubjectTitleField() {
        ThemePage newTheme = new ThemePage(driver);
        Assert.assertEquals(textForTitle,newTheme.enterCaptionText(textForTitle));
    }

    @Дано("^основной текст темы (.+)$")
    public void getTextForBody(String text){
        this.textForBody = text;
    }

    @Когда("^ввести основной текст для новой темы$")
    public void enterTheMainBodyOfTheTopic() {
        ThemePage newTheme = new ThemePage(driver);
        Assert.assertEquals(textForBody,newTheme.enterFieldText(textForBody));
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
    }

    @Когда("^выйти после создания новой темы$")
    public void quitBrowser() {
        ThemePage newTheme = new ThemePage(driver);
        newTheme.quitBrowser();
    }
}
