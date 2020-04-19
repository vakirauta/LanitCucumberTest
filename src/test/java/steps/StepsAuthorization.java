package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import hooks.AuthorizationPage;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;

public class StepsAuthorization {

    GetDriver get = new GetDriver();
    AuthorizationPage autho = new AuthorizationPage(get.getDriver());

    @Когда("^кликнуть на кнопку Войти$")
    public void clickOnTheLoginButton() {
        autho.getButton();
    }

    @Тогда("^проверка что появилось модальное окно авторизации$")
    public void assertFormAuthorization(){
        autho.assertFormAuthorization();
    }

    @Когда("^ввести логин (.+)$")
    public void inputLogin(String text){
        Assert.assertEquals(text,autho.inputLogin(text));
    }

    @Когда("^ввести пароль (.+)$")
    public void inputPassword(String text){
        Assert.assertEquals(text,autho.inputPass(text));
    }

    @Тогда("^подтвердить авторизацию кнопкой Войти$")
    public void authorization() {
        autho.clickSubmit();
    }

    @Тогда("^проверить авторизацию убедившись что появилась иконка профиля$")
    public void assertIconProfile(){
        autho.assertIconProfile();
    }
}
