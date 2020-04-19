package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ProfilePage;

public class StepsExitProfile {
    GetDriver get = new GetDriver();
    ProfilePage profilePage = new ProfilePage(get.getDriver());

    @Когда("^авторизация для проверки выходы из профиля$")
    public void authorisationExitProfile(){
        profilePage.authorization();
    }

    @Когда("^кликнуть на иконку профиля$")
    public void clickBtnProfile() {
        profilePage.clickBtnProfile();
    }

    @Когда("^кликнуть кнопку Выход$")
    public void clickBtnOut() {
        profilePage.clickBtnExit();
    }

    @Тогда("^убедиться что вышли из Профиля методом проверки отсутствия элемента иконки Профиля$")
    public void assertIconProfile(){
        profilePage.assertDisplayIconProfile();
    }
}
