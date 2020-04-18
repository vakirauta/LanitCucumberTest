package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ProfilePage;
import org.junit.Assert;

public class StepsChangeAvatar {

    @Когда("^авторизация для смены аватара$")
    public void authorisationChangeAvatar(){
        ProfilePage profilePage = new ProfilePage(precondition.driver);
        profilePage.authorization(precondition.driver);
    }

    @Когда("^кликнуть на профиль$")
    public void clickMyProfile() {
        ProfilePage profilePage = new ProfilePage(precondition.driver);
        profilePage.clickBtnProfile();
    }

    @Когда("^кликнуть Изменить аватар$")
    public void clickChangeAvatar() {
        ProfilePage profilePage = new ProfilePage(precondition.driver);
        profilePage.clickBtnChangeAvatar();
    }

    @Когда("^кликнуть Сгенерировать индивидуальную аватарку$")
    public void clickGenerateAnIndividualAvatar() {
        ProfilePage profilePage = new ProfilePage(precondition.driver);
        profilePage.clickBtnGenerateIndividualAvatar();
    }

      @Тогда("^проверка алерт сообщение (.*)$")
      public void getTextAlertMessage(String string){
          ProfilePage profilePage = new ProfilePage(precondition.driver);
          Assert.assertEquals(string,profilePage.setTextAlert());
      }

      @Когда("^выйти из браузера после изменения аватара$")
      public void quitBrowser() {
          ProfilePage profilePage = new ProfilePage(precondition.driver);
          profilePage.quitBrowser();
      }
}
