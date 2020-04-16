package steps;
import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCategorySelection {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для выбора темы$")
    public void authorisationCategorySelection(){
        CategorySelection selection = new CategorySelection(driver);
        selection.authorization(driver);
    }

    @Когда("^выбрать вкладку Категории$")
    public void clickBtnSelection() {
        CategorySelection selection = new CategorySelection(driver);
        selection.clickCategory();
    }

    @Когда("^выбрать категорию$")
    public void selectCategory() {
        CategorySelection selection = new CategorySelection(driver);
        selection.selectWithCategory();
    }

    @Когда("^просмотреть любую тему$")
    public void viewTopic() {
        CategorySelection selection = new CategorySelection(driver);
        selection.clickTopic();
    }

    @Когда("^выйти из браузера после просмотра темы$")
    public void quitBrowser(){
        CategorySelection selection = new CategorySelection(driver);
        selection.quitBrowser();
    }
}
