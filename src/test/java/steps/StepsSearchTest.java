package steps;

import cucumber.api.java.ru.Когда;
import hooks.SearchPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsSearchTest{
    Hook hook = new Hook();
    private WebDriver driver = hook.getDriver();


    @Когда("^авторизация для проверки функции поиска$")
    public void authorisationSearchTest(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.authorization();
    }

    @Когда("^кликнуть по иконке поиска$")
    public void clickBtnSearch() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickBtnSearch();
    }

    @Когда("^ввести текст (.+) в поле для поиска и проверить есть ли совпадения$")
    public void inputText(String text) {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickTextAreaAndInputText(text);
        Assert.assertEquals(text,searchPage.getUserName(text));
        searchPage.quitBrowser();
    }
}
