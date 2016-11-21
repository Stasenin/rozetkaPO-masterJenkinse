package Test_this;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class email {
    private WebDriver driver;
    private final By Email = By.cssSelector("input[name='email']");


    public email(WebDriver driver){
        this.driver = driver;
    }

    public String generateWRong(){
        char[] chars = ")!~+-><*^&$@@?(".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String generatedWrongEmail = sb.toString();
        return generatedWrongEmail;
    }

    public void typeWrongEmail(){
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(generateWRong(), Keys.TAB );
    }
    public  void email() {
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("@&(*#$&( @gamale.come", Keys.TAB );
    }

    public void waitForEmailToLoad(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
    }

}
