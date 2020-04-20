package steps;

import cucumber.api.java.ru.Когда;
import hooks.AuthorizationPage;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsAuthorization {
    Hook hook = new Hook();
    WebDriver driver = hook.getDriver();

    @Когда("^кликнуть на кнопку Войти$")
    public void clickOnTheLoginButton() {
        AuthorizationPage autho = new AuthorizationPage(driver);
        autho.getButton();
    }

    @Тогда("^проверка что появилось модальное окно авторизации$")
    public void assertFormAuthorization(){
        AuthorizationPage autho = new AuthorizationPage(driver);
        autho.assertFormAuthorization();
    }

    @Когда("^ввести логин (.+)$")
    public void inputLogin(String text){
        AuthorizationPage autho = new AuthorizationPage(driver);
        Assert.assertEquals(text,autho.inputLogin(text));
    }

    @Когда("^ввести пароль (.+)$")
    public void inputPassword(String text){
        AuthorizationPage autho = new AuthorizationPage(driver);
        Assert.assertEquals(text,autho.inputPass(text));
    }

    @Тогда("^подтвердить авторизацию кнопкой Войти$")
    public void authorization() {
        AuthorizationPage autho = new AuthorizationPage(driver);
        autho.clickSubmit();
    }

    @Тогда("^проверить авторизацию убедившись что появилась иконка профиля$")
    public void assertIconProfile(){
        AuthorizationPage autho = new AuthorizationPage(driver);
        autho.assertIconProfile();
    }
}
