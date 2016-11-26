package Test_this.Test_this;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

import static Test_this.DriverWrapper.getDriver;

public class RegistrattionPage {
//    private WebDriver driver;
//    private final By Email = By.xpath("input[name='email']");


//    public RegistrattionPage(WebDriver driver){
//        this.driver = driver;
//    }

    public void login() throws IOException {
        getDriver().findElement(By.xpath("//*[@name=\'title\']")).sendKeys("Some login", Keys.TAB );
    }

    public  void password() throws IOException {
        getDriver().findElement(By.cssSelector("input[type='password']")).sendKeys("Some password", Keys.TAB );
    }

    public  void email() throws IOException {
        getDriver().findElement(By.cssSelector("input[name='email']")).sendKeys("@&(*#$&( @gamale.come", Keys.TAB );
    }

    public void submit() throws IOException {
        getDriver().findElement(By.cssSelector("span.btn-link-sign>button.btn-link-i")).click();
    }

    public void assertBGcolor(){
      try{  Assert.assertTrue( getDriver().findElement(By.xpath("//input[contains(@style, 'background-color: rgb(255, 214, 214)')]")).isDisplayed());
    } catch (NoSuchElementException GGsee) {
            System.out.println("The color was not displayed");  } catch (IOException e) {
          e.printStackTrace();
      }
    }

}
