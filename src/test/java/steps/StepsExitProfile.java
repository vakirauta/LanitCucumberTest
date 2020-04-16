package steps;

import cucumber.api.java.ru.Когда;
import hooks.ExitProfile;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsExitProfile {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для проверки выходы из профиля$")
    public void authorisationExitProfile(){
        ExitProfile exitProfile = new ExitProfile(driver);
        exitProfile.authorization(driver);
    }

    @Когда("^кликнуть на иконку профиля$")
    public void clickBtnProfile() {
        ExitProfile exitProfile = new ExitProfile(driver);
        exitProfile.clickBtnProfile();
    }

    @Когда("^кликнуть кнопку Выход$")
    public void clickBtnOut() {
        ExitProfile exitProfile = new ExitProfile(driver);
        exitProfile.clickBtnExit();
    }

    @Когда("^выйти из браузера после выхода из профиля$")
    public void quitBrowser() {
        ExitProfile exitProfile = new ExitProfile(driver);
        exitProfile.quitBrowser();
    }
}
