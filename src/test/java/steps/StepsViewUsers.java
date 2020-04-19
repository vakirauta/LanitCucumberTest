package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import hooks.UsersPage;

public class StepsViewUsers {
    GetDriver get = new GetDriver();
    UsersPage viewUsers = new UsersPage(get.getDriver());

    @Когда("^авторизация для просмотра пользователей$")
    public void authorisationViewUsers(){
        viewUsers.authorization();
    }

    @Когда("^выбрать вкладку Пользователи$")
    public void clickBtnUsers(){
        viewUsers.clickBtnUsers();
    }

    @Когда("^выбрать вкладку Top posters$")
    public void clickBtnTopPosters(){
        viewUsers.clickTopPosters();
    }

    @Когда("^выбрать вкладку Forum team$")
    public void clickBtnForumTeam(){
        viewUsers.clickForumTeam();
    }
}
