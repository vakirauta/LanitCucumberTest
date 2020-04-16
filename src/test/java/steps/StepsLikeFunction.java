package steps;

import cucumber.api.java.ru.Когда;
import hooks.ViewNewTopics;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;

public class StepsLikeFunction {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для проверки функции Лайк$")
    public void authorisationViewNewTopic(){
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
