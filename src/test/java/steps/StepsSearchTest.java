package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import hooks.SearchTest;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;

public class StepsSearchTest {

    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    private String userName;
    private String textMessage;

    @Когда("^авторизация для проверки функции поиска$")
    public void authorisationSearchTest(){
        SearchTest searchTest = new SearchTest(driver);
        searchTest.authorization(driver);
    }

    @Когда("^кликнуть по иконке поиска$")
    public void clickBtnSearch() {
        SearchTest searchTest = new SearchTest(driver);
        searchTest.clickBtnSearch();
    }

    @Дано("^текст для ввода (.*)$")
    public void textForInput(String text) {
        this.userName = text;
    }

    @Когда("^ввести текст в поле для поиска$")
    public void inputText() {
        SearchTest searchTest = new SearchTest(driver);
        searchTest.clickTextAreaAndInputText(userName);
    }

    @Дано("^если нет совпадений то выводится текст сообщения (.*)$")
    public void textMessage(String text) {
        this.textMessage = text;
    }

    @Когда("^проверяем есть ли совпадения$")
    public void clickOnTheProposedOption(){
        SearchTest searchTest = new SearchTest(driver);
        searchTest.getUserName(userName);
    }

    @Когда("^выйти из браузера после проверки поиска$")
    public void quitBrowser() {
        SearchTest searchTest = new SearchTest(driver);
        searchTest.quitBrowser();
    }
}
