package hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import retryingFindClick.RetryingFindClick;

import static org.openqa.selenium.By.xpath;

public class UsersPage extends RetryingFindClick {
  private WebDriver driver;

  public String login = "Alexandr11";
  public String pass = "1ybrjkfc89";

  public UsersPage(WebDriver driver) {
    this.driver = driver;
  }

  private By btnLog = xpath("//button[text()='Войти']");
  private By formLogin = xpath("//input[@id='id_username']");
  private By formPass = xpath("//input[@id='id_password']");
  private By btnEntry = xpath("//button[@type='submit']");
  private By btnUsers = xpath("//a[@href='/users/']");
  private By btnTopPosters = xpath("//a[@href='/users/active-posters/']");
  private By btnForumTeam = xpath("//a[@href='/users/forum-team/']");

  public void authorization() {
    WebElement element = driver.findElement(btnLog);
    element.click();
    driver.findElement(formLogin).sendKeys(login);
    driver.findElement(formPass).sendKeys(pass);
    clickSubmit(driver);
  }

  public void clickSubmit(WebDriver driver) {
    WebElement element = driver.findElement(btnEntry);
    element.click();
  }

  public void clickBtnUsers() {
    retryingFindClick(driver,btnUsers);
  }

  public void clickTopPosters() {
    WebElement element = driver.findElement(btnTopPosters);
    element.click();
  }

  public void clickForumTeam() {
    WebElement element = driver.findElement(btnForumTeam);
    element.click();
  }

  public void quitBrowser() {
    driver.quit();
  }
}
