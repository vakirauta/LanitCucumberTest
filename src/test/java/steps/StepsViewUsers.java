package steps;

import cucumber.api.java.ru.Когда;
import hooks.UsersPage;
import org.openqa.selenium.WebDriver;

public class StepsViewUsers{
    Hook hook = new Hook();
    private WebDriver driver = hook.getDriver();


    @Когда("^авторизация для просмотра пользователей$")
    public void authorisationViewUsers(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.authorization();
    }

    @Когда("^выбрать вкладку Пользователи$")
    public void clickBtnUsers(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.clickBtnUsers();
    }

    @Когда("^выбрать вкладку Top posters$")
    public void clickBtnTopPosters(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.clickTopPosters();
    }

    @Когда("^выбрать вкладку Forum team$")
    public void clickBtnForumTeam(){
        UsersPage viewUsers = new UsersPage(driver);
        viewUsers.clickForumTeam();
        viewUsers.quitBrowser();
    }
}
