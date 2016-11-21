package Test_this;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class LoginField {

    private WebDriver driver;

    private final By Login = By.cssSelector("input.auth-input-text[name='title']");

    public LoginField (WebDriver driver){
        this.driver = driver;
    }

    public String generateLogin(){
        char[] chars = "AdNkTcDmSD19723".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String generated_login = sb.toString();
        return generated_login;
    }
    public void login() {
        driver.findElement(By.xpath("//*[@name=\'title\']")).sendKeys("Some login", Keys.TAB );
    }

    public void typeLogin(){
        driver.findElement(By.xpath("//*[@name=\'title\']")).sendKeys(generateLogin(), Keys.TAB );
    }


}
