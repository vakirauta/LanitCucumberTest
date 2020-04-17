package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ProfilePage;
import hooks.WebDriverSettings;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsChangeAvatar {
    WebDriverSettings settings = new WebDriverSettings();
    private WebDriver driver = settings.getDriver();

    @Когда("^авторизация для смены аватара$")
    public void authorisationChangeAvatar(){
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.authorization(driver);
    }

    @Когда("^кликнуть на профиль$")
    public void clickMyProfile() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickBtnProfile();
    }

    @Когда("^кликнуть Изменить аватар$")
    public void clickChangeAvatar() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickBtnChangeAvatar();
    }

    @Когда("^кликнуть Сгенерировать индивидуальную аватарку$")
    public void clickGenerateAnIndividualAvatar() {
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickBtnGenerateIndividualAvatar();
    }

      @Тогда("^проверка алерт сообщение (.*)$")
      public void getTextAlertMessage(String string){
          ProfilePage profilePage = new ProfilePage(driver);
          Assert.assertEquals(profilePage.getTextAlert(),string);
      }

      @Когда("^выйти из браузера после изменения аватара$")
      public void quitBrowser() {
          ProfilePage profilePage = new ProfilePage(driver);
          profilePage.quitBrowser();
      }
}
