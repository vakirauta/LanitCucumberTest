package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
    WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
