package steps;
import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCategorySelection {
    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^авторизация для выбора темы$")
    public void authorisationCategorySelection(){
        getDriver();
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
