package steps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import hooks.ProfilePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepsChangeAvatar{
  Hook hook = new Hook();
  private WebDriver driver = hook.getDriver();


  @Когда("^авторизация для смены аватара$")
  public void authorisationChangeAvatar() {
    ProfilePage profilePage = new ProfilePage(driver);
    profilePage.authorization();
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

  @Тогда("^проверка алерт сообщения (.*)$")
  public void getTextAlertMessage(String string) {
    ProfilePage profilePage = new ProfilePage(driver);
    Assert.assertEquals(profilePage.setTextAlert(),string);
    profilePage.quitBrowser();
  }
}
