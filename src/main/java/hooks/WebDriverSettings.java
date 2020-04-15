package hooks;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class WebDriverSettings {
    private String login = "Alexandr11";
    private String pass = "1ybrjkfc89";

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    By btnLog = xpath("//button[text()='Войти']");
    By formLogin = xpath("//input[@id='id_username']");
    By formPass = xpath("//input[@id='id_password']");
    By btnEntry = xpath("//button[@type='submit']");

    public void threadSleep(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
