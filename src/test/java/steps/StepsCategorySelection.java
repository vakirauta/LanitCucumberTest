package steps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.CategoryPage;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;

public class StepsCategorySelection {
    WebDriverSettings settings = new WebDriverSettings();
    private final WebDriver driver = settings.getDriver();

    @Когда("^авторизация для выбора темы$")
    public void authorisationCategorySelection(){
        CategoryPage selection = new CategoryPage(driver);
        selection.authorization(driver);
    }

    @Когда("^выбрать вкладку Категории$")
    public void clickBtnSelection() {
        CategoryPage selection = new CategoryPage(driver);
        selection.clickCategory();
    }

    @Тогда("^убедится что вкладка выбрана проверкой названия Заголовка$")
    public void assertTitleHeader(){
        CategoryPage selection = new CategoryPage(driver);
        selection.assertTitleHeader();
    }

    @Когда("^выбрать категорию$")
    public void selectCategory() {
        CategoryPage selection = new CategoryPage(driver);
        selection.selectWithCategory();
    }

    @Когда("^просмотреть тему$")
    public void viewTopic() {
        CategoryPage selection = new CategoryPage(driver);
        selection.clickTopic();
    }

    @Когда("^выйти из браузера после просмотра темы$")
    public void quitBrowser(){
        CategoryPage selection = new CategoryPage(driver);
        selection.quitBrowser();
    }
}
