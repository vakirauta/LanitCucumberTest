package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import hooks.SearchTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsSearchTest {

    private WebDriver driver;
    private String userName;
    private String textMessage;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^авторизация для проверки функции поиска$")
    public void authorisationSearchTest(){
        getDriver();
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
