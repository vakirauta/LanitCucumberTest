package steps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.CategoryPage;
import org.openqa.selenium.WebDriver;

public class StepsCategorySelection{
    Hook hook = new Hook();
    WebDriver driver = hook.getDriver();


    @Когда("^авторизация для выбора темы$")
    public void authorisationCategorySelection(){
        CategoryPage selection = new CategoryPage(driver);
        selection.authorization();
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
        selection.quitBrowser();
    }
}
