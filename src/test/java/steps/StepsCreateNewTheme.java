package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import hooks.CreateNewTheme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCreateNewTheme {

    private WebDriver driver;
    private String textForTitle;
    private String textForBody;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^кликнуть по кнопке Новая тема$")
    public void clickTheNewTopicButton() {
        getDriver();
        CreateNewTheme newTheme = new CreateNewTheme(driver);
        newTheme.authorization();
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
