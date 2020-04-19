package authorizationSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetDriver {
    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

}
