package steps;

import cucumber.api.java.ru.Когда;
import hooks.ExitProfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsExitProfile {
    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^кликнуть на иконку профиля$")
    public void clickBtnProfile() {
        getDriver();
        ExitProfile exitProfile = new ExitProfile(driver);
        exitProfile.authorization();
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
