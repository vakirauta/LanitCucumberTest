package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import hooks.CreateNewTheme;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCreateNewTheme {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    private String textForTitle;
    private String textForBody;

    @Когда("^авторизация для создания темы$")
    public void authorisationCreateNewTheme(){
        CategorySelection selection = new CategorySelection(driver);
        selection.authorization(driver);
    }

    @Когда("^кликнуть по кнопке Новая тема$")
    public void clickTheNewTopicButton() {
        CreateNewTheme newTheme = new CreateNewTheme(driver);
        newTheme.clickBtnNewTheme();
    }

    @Дано("^текст заголовка для новой темы (.+)$")
    public void getTextForTitle(String text){
        this.textForTitle = text;
    }


    @Когда("^ввести текст в поле заголовка темы$")
    public void enterTextInTheSubjectTitleField() {
        CreateNewTheme newTheme = new CreateNewTheme(driver);
        newTheme.enterCaptionText(textForTitle);
    }

    @Дано("^основной текст темы (.+)$")
    public void getTextForBody(String text){
        this.textForBody = text;
    }

    @Когда("^ввести основной текст для новой темы$")
    public void enterTheMainBodyOfTheTopic() {
        CreateNewTheme newTheme = new CreateNewTheme(driver);
        newTheme.enterFieldText(textForBody);
    }

    @Когда("^запостить тему$")
    public void postTopic() {
        CreateNewTheme newTheme = new CreateNewTheme(driver);
        newTheme.clickBtnPublish();
    }

    @Когда("^выйти после создания новой темы$")
    public void quitBrowser() {
        CreateNewTheme newTheme = new CreateNewTheme(driver);
        newTheme.quitBrowser();
    }
}
