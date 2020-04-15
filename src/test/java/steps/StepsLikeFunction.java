package steps;

import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import hooks.ViewNewTopics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsLikeFunction {

    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^авторизация для проверки функции Лайк$")
    public void authorisationViewNewTopic(){
        getDriver();
        ViewNewTopics newTopics = new ViewNewTopics(driver);
        newTopics.authorization(driver);
    }

    @Когда("^кликнуть по вкладке Новые$")
    public void clickButtonNew() {
        ViewNewTopics newTopics = new ViewNewTopics(driver);
        newTopics.clickBtnNew();
    }

    @Когда("^кликнуть по новой теме$")
    public void clickNewTopic() {
        ViewNewTopics newTopics = new ViewNewTopics(driver);
        newTopics.clickNewTopic();
    }

    @Когда("^кликнуть по кнопке Лайк$")
    public void clickBtnLike() {
        ViewNewTopics newTopics = new ViewNewTopics(driver);
        newTopics.clickBtnLike();
    }

    @Когда("^выйти из браузера после оценки$")
    public void quitBrowserAfterViewNewTopic() {
        ViewNewTopics newTopics = new ViewNewTopics(driver);
        newTopics.quitBrowser();
    }
}
