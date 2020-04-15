package steps;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import hooks.Authorization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsAuthorization {

    private WebDriver driver;

    private String login;
    private String password;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }
    @Когда("^кликнуть на кнопку Войти$")
    public void clickOnTheLoginButton() {
        getDriver();
        Authorization autho = new Authorization(driver);
        autho.getButton();
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
        Authorization autho = new Authorization(driver);
        autho.inputLogin(login);
    }

    @Когда("^ввести пароль$")
    public void inputPassword(){
        Authorization autho = new Authorization(driver);
        autho.inputPass(password);
    }

    @Когда("^подтвердить авторизацию кнопкой Войти$")
    public void authorization() {
        Authorization autho = new Authorization(driver);
        autho.clickSubmit();
    }

    @Когда("^выход из браузера после авторизации$")
    public void quitBrowser() {
        Authorization autho = new Authorization(driver);
        autho.quitBrowser();
    }
}
