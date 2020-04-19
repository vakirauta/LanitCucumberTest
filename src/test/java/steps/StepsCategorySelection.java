package steps;
import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.CategoryPage;

public class StepsCategorySelection {
    GetDriver get = new GetDriver();
    CategoryPage selection = new CategoryPage(get.getDriver());

    @Когда("^авторизация для выбора темы$")
    public void authorisationCategorySelection(){
        selection.authorization();
    }

    @Когда("^выбрать вкладку Категории$")
    public void clickBtnSelection() {
        selection.clickCategory();
    }

    @Тогда("^убедится что вкладка выбрана проверкой названия Заголовка$")
    public void assertTitleHeader(){
        selection.assertTitleHeader();
    }

    @Когда("^выбрать категорию$")
    public void selectCategory() {
        selection.selectWithCategory();
    }

    @Когда("^просмотреть тему$")
    public void viewTopic() {
        selection.clickTopic();
    }
}
