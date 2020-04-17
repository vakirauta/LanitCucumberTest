package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.SearchPage;
import hooks.WebDriverSettings;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsSearchTest {

    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    private String userName;
    private String textMessage;

    @Когда("^авторизация для проверки функции поиска$")
    public void authorisationSearchTest(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.authorization(driver);
    }

    @Когда("^кликнуть по иконке поиска$")
    public void clickBtnSearch() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickBtnSearch();
    }

    @Дано("^текст для ввода (.*)$")
    public void textForInput(String text) {
        this.userName = text;
    }

    @Когда("^ввести текст в поле для поиска$")
    public void inputText() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickTextAreaAndInputText(userName);
    }

    @Дано("^если нет совпадений то выводится текст сообщения (.*)$")
    public void textMessage(String text) {
        this.textMessage = text;
    }

    @Тогда("^проверяем есть ли совпадения$")
    public void clickOnTheProposedOption(){
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertEquals(userName,searchPage.getUserName(userName));
    }

    @Когда("^выйти из браузера после проверки поиска$")
    public void quitBrowser() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.quitBrowser();
    }
}
