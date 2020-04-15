package steps;

import cucumber.api.java.ru.Когда;
import hooks.CategorySelection;
import hooks.ViewUsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsViewUsers {

    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^авторизация для просмотра пользователей$")
    public void authorisationViewUsers(){
        getDriver();
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.authorization(driver);
    }

    @Когда("^кликнуть по вкладке Пользователи$")
    public void clickBtnUsers(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.clickBtnUsers();
    }

    @Когда("^кликнуть по вкладке Top posters$")
    public void clickBtnTopPosters(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.clickTopPosters();
    }

    @Когда("^кликнуть по вкладке Forum team$")
    public void clickBtnForumTeam(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.clickForumTeam();
    }

    @Когда("^выйти из браузера после просмотра пользователей$")
    public void quitBrowser(){
        ViewUsers viewUsers = new ViewUsers(driver);
        viewUsers.quitBrowser();
    }
}
