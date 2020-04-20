package steps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ProfilePage;
import org.openqa.selenium.WebDriver;

public class StepsExitProfile{
    Hook hook = new Hook();
    private WebDriver driver = hook.getDriver();


    @Когда("^авторизация для проверки выходы из профиля$")
    public void authorisationExitProfile(){
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.authorization();
    }

    @Когда("^кликнуть на иконку профиля$")
    public void clickBtnProfile() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickBtnProfile();
    }

    @Когда("^кликнуть кнопку Выход$")
    public void clickBtnOut() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickBtnExit();
    }

    @Тогда("^убедиться что вышли из Профиля методом проверки отсутствия элемента иконки Профиля$")
    public void assertIconProfile(){
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.assertDisplayIconProfile();
        profilePage.quitBrowser();
    }
}
