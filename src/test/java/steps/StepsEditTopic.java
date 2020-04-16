package steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import hooks.EditingTopic;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsEditTopic {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    private String newText;

    @Когда("^авторизация для редактирования темы$")
    public void authorisationEditTopic(){
        EditingTopic editing = new EditingTopic(driver);
        editing.authorization(driver);
    }

    @Когда("^кликнуть по вкладе Мои$")
    public void clickTheMyTab() {
        EditingTopic editing = new EditingTopic(driver);
        editing.clickBtnMy();
    }

    @Когда("^кликнуть на выбранную тему$")
    public void clickOnSelectedTopic() {
        EditingTopic editing = new EditingTopic(driver);
        editing.topicSelection();
    }

    @Когда("^кликнуть кнопку Изменить$")
    public void clickEdit() {
        EditingTopic editing = new EditingTopic(driver);
        editing.clickBtnEdit();
    }

    @Дано("^новый текст (.+)$")
    public void getNewText(String text){
        this.newText = text;
    }

    @Когда("^ввести новый текст и внести изменения$")
    public void changeTopicText() {
        EditingTopic editing = new EditingTopic(driver);
        editing.clickTextArea(newText);
    }

    @Когда("^выйти из браузера после изменения темы$")
    public void quitBrowser() {
        EditingTopic editing = new EditingTopic(driver);
        editing.quitBrowser();
    }

}
