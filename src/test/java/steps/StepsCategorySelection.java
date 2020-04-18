package steps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.CategoryPage;

public class StepsCategorySelection {

    @Когда("^авторизация для выбора темы$")
    public void authorisationCategorySelection(){
        CategoryPage selection = new CategoryPage(precondition.driver);
        selection.authorization(precondition.driver);
    }

    @Когда("^выбрать вкладку Категории$")
    public void clickBtnSelection() {
        CategoryPage selection = new CategoryPage(precondition.driver);
        selection.clickCategory();
    }

    @Тогда("^убедится что вкладка выбрана проверкой названия Заголовка$")
    public void assertTitleHeader(){
        CategoryPage selection = new CategoryPage(precondition.driver);
        selection.assertTitleHeader();
    }

    @Когда("^выбрать категорию$")
    public void selectCategory() {
        CategoryPage selection = new CategoryPage(precondition.driver);
        selection.selectWithCategory();
    }

    @Когда("^просмотреть тему$")
    public void viewTopic() {
        CategoryPage selection = new CategoryPage(precondition.driver);
        selection.clickTopic();
    }

    @Когда("^выйти из браузера после просмотра темы$")
    public void quitBrowser(){
        CategoryPage selection = new CategoryPage(precondition.driver);
        selection.quitBrowser();
    }
}
