package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ChangeAvatar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsChangeAvatar {
    private WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @Когда("^кликнуть на профиль$")
    public void clickMyProfile() {
        getDriver();
        ChangeAvatar changeAvatar = new ChangeAvatar(driver);
        changeAvatar.authorization();
        changeAvatar.clickBtnProfile();
    }

    @Когда("^кликнуть Изменить аватар$")
    public void clickChangeAvatar() {
        ChangeAvatar changeAvatar = new ChangeAvatar(driver);
        changeAvatar.clickBtnChangeAvatar();
    }

    @Когда("^кликнуть Сгенерировать индивидуальную аватарку$")
    public void clickGenerateAnIndividualAvatar() {
        ChangeAvatar changeAvatar = new ChangeAvatar(driver);
        changeAvatar.clickBtnGenerateIndividualAvatar();
    }

      @Тогда("^алерт сообщение (.*)$")
      public void getTextAlertMessage(String string) throws Throwable {
          ChangeAvatar changeAvatar = new ChangeAvatar(driver);
          String alertMessage = changeAvatar.getTextAlert();
          if(!alertMessage.equals(string)) {
              throw new PendingException();
          }
      }

      @Когда("^выйти из браузера после изменения аватара$")
      public void quitBrowser() {
          ChangeAvatar changeAvatar = new ChangeAvatar(driver);
          changeAvatar.quitBrowser();
      }
}
