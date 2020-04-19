package steps;

import authorizationSteps.GetDriver;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ProfilePage;
import org.junit.Assert;

public class StepsChangeAvatar {
  GetDriver get = new GetDriver();
  ProfilePage profilePage = new ProfilePage(get.getDriver());

  @Когда("^авторизация для смены аватара$")
  public void authorisationChangeAvatar() {
    profilePage.authorization();
  }

  @Когда("^кликнуть на профиль$")
  public void clickMyProfile() {
    profilePage.clickBtnProfile();
  }

  @Когда("^кликнуть Изменить аватар$")
  public void clickChangeAvatar() {
    profilePage.clickBtnChangeAvatar();
  }

  @Когда("^кликнуть Сгенерировать индивидуальную аватарку$")
  public void clickGenerateAnIndividualAvatar() {
    profilePage.clickBtnGenerateIndividualAvatar();
  }

  @Тогда("^проверка алерт сообщение (.*)$")
  public void getTextAlertMessage(String string) {
    Assert.assertEquals(string, profilePage.setTextAlert());
    profilePage.quitBrowser();
  }
}
