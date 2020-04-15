package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import hooks.AddSurvey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsAddSurvey {

    private WebDriver driver;
    private String getTextForQuestion;
    private String getTextFirstAnswer;
    private String getTextSecondAnswer;


    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers_for_Browsers\\chromedriver_win32_79\\chromedriver79.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.n7lanit.ru/");
        return driver;
    }

    @When("^click btn profile$")
    public void clickBtnProfile() {
        getDriver();
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.authorization();
        addSurvey.clickBtnProfile();
    }

    @When("^select tab view profile$")
    public void selectTabViewProfile() {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.clickViewProfile();
    }

    @When("^select topic$")
    public void selectTopics() {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.selectTopic();
    }

    @When("^click button add survey$")
    public void clickButtonAddSurvey() {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.clickBtnSurvey();
    }

    @Given("^text to be entered in the field of voting question (.+)$")
    public void textForVotingQuestion(String text){
        this.getTextForQuestion = text;
    }

    @When("^enter text in the question of voting field$")
    public void enterTextInTheQuestionOfVotingFieldToBeOrNotToBe() {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.fieldSurvey(getTextForQuestion);
    }

    @Given("^text to enter in the field the first answer (.+)$")
    public void textForTheFirstAnswer(String text){
        this.getTextFirstAnswer = text;
    }

    @When("^enter text in the available first options fields$")
    public void enterTextInTheAvailableOptionsFirstField() {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.fieldFirstSurvey(getTextFirstAnswer);
    }

    @Given("^text to enter in the field the second answer (.+)$")
    public void textForTheSecondAnswer(String text){
        this.getTextSecondAnswer = text;
    }


    @When("^enter text in the available second options fields$")
    public void enterTextInTheAvailableOptionsSecondField() {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.fieldSecondSurvey(getTextSecondAnswer);
    }

    @When("^enter the time in the Voting time field (.+)$")
    public void enterTheTimeInTheVotingTimeField(String text) {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.enterVotingDuration(text);
    }

    @When("^press the button Message with voting$")
    public void pressTheButtonMessageWithVoting() {
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.clickBtnVotingMessage();
    }

    @When("^quit browser after add poll$")
    public void quitBrowser(){
        AddSurvey addSurvey = new AddSurvey(driver);
        addSurvey.quitBrowser();
    }
}
