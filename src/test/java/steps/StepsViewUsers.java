package steps;

import cucumber.api.java.ru.Когда;
import hooks.UsersPage;

public class StepsViewUsers {

    @Когда("^авторизация для просмотра пользователей$")
    public void authorisationViewUsers(){
        UsersPage viewUsers = new UsersPage(precondition.driver);
        viewUsers.authorization(precondition.driver);
    }

    @Когда("^кликнуть по вкладке Пользователи$")
    public void clickBtnUsers(){
        UsersPage viewUsers = new UsersPage(precondition.driver);
        viewUsers.clickBtnUsers();
    }

    @Когда("^кликнуть по вкладке Top posters$")
    public void clickBtnTopPosters(){
        UsersPage viewUsers = new UsersPage(precondition.driver);
        viewUsers.clickTopPosters();
    }

    @Когда("^кликнуть по вкладке Forum team$")
    public void clickBtnForumTeam(){
        UsersPage viewUsers = new UsersPage(precondition.driver);
        viewUsers.clickForumTeam();
    }

    @Когда("^выйти из браузера после просмотра пользователей$")
    public void quitBrowser(){
        UsersPage viewUsers = new UsersPage(precondition.driver);
        viewUsers.quitBrowser();
    }
}
