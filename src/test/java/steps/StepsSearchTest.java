package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import hooks.SearchPage;
import org.junit.Assert;

public class StepsSearchTest {
    GetDriver get = new GetDriver();
    SearchPage searchPage = new SearchPage(get.getDriver());

    @Когда("^авторизация для проверки функции поиска$")
    public void authorisationSearchTest(){
        searchPage.authorization();
    }

    @Когда("^кликнуть по иконке поиска$")
    public void clickBtnSearch() {
        searchPage.clickBtnSearch();
    }

    @Когда("^ввести текст (.+) в поле для поиска и проверить есть ли совпадения$")
    public void inputText(String text) {
        searchPage.clickTextAreaAndInputText(text);
        Assert.assertEquals(text,searchPage.getUserName(text));
        searchPage.quitBrowser();
    }
}
