package steps;

import cucumber.api.java.ru.Когда;
import hooks.UsersPage;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;

public class StepsViewUsers {

    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для просмотра пользователей$")
    public void authorisationViewUsers(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.authorization(driver);
    }

    @Когда("^кликнуть по вкладке Пользователи$")
    public void clickBtnUsers(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.clickBtnUsers();
    }

    @Когда("^кликнуть по вкладке Top posters$")
    public void clickBtnTopPosters(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.clickTopPosters();
    }

    @Когда("^кликнуть по вкладке Forum team$")
    public void clickBtnForumTeam(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.clickForumTeam();
    }

    @Когда("^выйти из браузера после просмотра пользователей$")
    public void quitBrowser(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.quitBrowser();
    }
}
