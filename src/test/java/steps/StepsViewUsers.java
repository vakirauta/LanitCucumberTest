package steps;

import cucumber.api.java.ru.Когда;
import hooks.ViewUsers;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;

public class StepsViewUsers {

    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для просмотра пользователей$")
    public void authorisationViewUsers(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.authorization(driver);
    }

    @Когда("^кликнуть по вкладке Пользователи$")
    public void clickBtnUsers(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.clickBtnUsers();
    }

    @Когда("^кликнуть по вкладке Top posters$")
    public void clickBtnTopPosters(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.clickTopPosters();
    }

    @Когда("^кликнуть по вкладке Forum team$")
    public void clickBtnForumTeam(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.clickForumTeam();
    }

    @Когда("^выйти из браузера после просмотра пользователей$")
    public void quitBrowser(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.quitBrowser();
    }
}
