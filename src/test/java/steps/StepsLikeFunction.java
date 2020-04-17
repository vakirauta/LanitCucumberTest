package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ThemePage;
import hooks.WebDriverSettings;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsLikeFunction {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();
    private String textBtn;

    @Когда("^авторизация для проверки функции Лайк$")
    public void authorisationViewNewTopic(){
        ThemePage newTopics = new ThemePage(driver);
        newTopics.authorization(driver);
    }
    @Когда("^нажать по вкладке Темы$")
    public void clickTabTheme(){
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickTabTheme();
    }

    @Когда("^кликнуть по вкладке Новые$")
    public void clickButtonNew() {
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickBtnNew();
    }

    @Когда("^кликнуть по новой теме$")
    public void clickNewTopic() {
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickNewTopic();
    }

    @Когда("^кликнуть по кнопке Лайк$")
    public void clickBtnLike() {
        ThemePage newTopics = new ThemePage(driver);
        newTopics.clickBtnLike();
    }

    @Тогда("^проверим что вместо вместо кнопки Лайк появится кнопка с текстом (.+)$")
    public void assertBtnText(String text){
        ThemePage newTopics = new ThemePage(driver);
        this.textBtn = text;
        Assert.assertEquals(textBtn,newTopics.assertBtnText());
    }


    @Когда("^выйти из браузера после оценки$")
    public void quitBrowserAfterViewNewTopic() {
        ThemePage newTopics = new ThemePage(driver);
        newTopics.quitBrowser();
    }
}
