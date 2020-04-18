package steps;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import hooks.AuthorizationPage;
import hooks.WebDriverSettings;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsAuthorization {
    WebDriverSettings settings = new WebDriverSettings();
    private final WebDriver driver = settings.getDriver();

    private String login;
    private String password;

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

    @Дано("^логин (.+)$")
    public void setLogin(String login) {
        this.login = login;
    }

    @Дано("^пароль (.+)$")
    public void setPassword(String pass) {
        this.password = pass;
    }

    @Когда("^ввести логин$")
    public void inputLogin(){
        AuthorizationPage autho = new AuthorizationPage(driver);
        Assert.assertEquals(login,autho.inputLogin(login));
    }

    @Когда("^ввести пароль$")
    public void inputPassword(){
        AuthorizationPage autho = new AuthorizationPage(driver);
        Assert.assertEquals(password,autho.inputPass(password));
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


    @Когда("^выход из браузера после авторизации$")
    public void quitBrowser() {
        AuthorizationPage autho = new AuthorizationPage(driver);
        autho.quitBrowser();
    }
}
