package Test_this;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class PasswordField {

    private WebDriver driver;

    private final By Password = By.cssSelector("input[type='password']");

    public PasswordField(WebDriver driver){
        this.driver = driver;
    }

    public String generatePassword(){
        char[] chars = "AdNkTcDmSD19723".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String generated_password = sb.toString();
        return generated_password;
    }
    public  void password() {
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Some password", Keys.TAB );
    }
    public void typePassword(){
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(generatePassword(), Keys.TAB );
    }


}
