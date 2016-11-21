package Test_this;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static Test_this.DriverWrapper.getDriver;

public class pushSubmit {
    private WebDriver driver;
    private final By Submit = By.cssSelector("span.btn-link-sign>button.btn-link-i");


    public pushSubmit(WebDriver driver){
        this.driver = driver;
    }


    public void submit() throws IOException {
        getDriver().findElement(By.cssSelector("span.btn-link-sign>button.btn-link-i")).click();
    }

}
