package Test_this;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AssertErrorMassage {
    private WebDriver driver;
    private final By Email = By.xpath("input[name='email']");


    public AssertErrorMassage(WebDriver driver){
        this.driver = driver;
    }


    public void assertBGcolor(){
      try{  Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@style, 'background-color: rgb(255, 214, 214)')]")).isDisplayed());
    } catch (NoSuchElementException GGsee) {
            System.out.println("The color was not displayed");  }
        }

}
