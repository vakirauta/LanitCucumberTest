package steps;

import cucumber.api.java.ru.Когда;
import hooks.ViewNewTopics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsViewNewTopic {

    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^кликнуть по вкладке Новые$")
    public void clickButtonNew() {
        getDriver();
        ViewNewTopics newTopics = new ViewNewTopics(driver);
        newTopics.authorization();
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