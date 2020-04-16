package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.CategorySelection;
import hooks.ChangeAvatar;
import hooks.WebDriverSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsChangeAvatar {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для смены аватара$")
    public void authorisationChangeAvatar(){
        ChangeAvatar changeAvatar = new ChangeAvatar(driver);
        changeAvatar.authorization(driver);
    }

    @Когда("^кликнуть на профиль$")
    public void clickMyProfile() {
        ChangeAvatar changeAvatar = new ChangeAvatar(driver);
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
