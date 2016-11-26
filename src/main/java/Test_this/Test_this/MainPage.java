package Test_this.Test_this;

import org.openqa.selenium.By;

import java.io.IOException;

import static Test_this.DriverWrapper.getDriver;

public class MainPage {

//    private WebDriver driver;


//    public MainPage(WebDriver driver) {
//        this.driver = river;
//    }

    public void open() throws IOException {
        getDriver().get("http://rozetka.com.ua");
    }

    private final By SignInLink =  By.cssSelector("a[name='s" +
            "ignin']");
    private final By RegistrationLink = By.cssSelector("a.auth-f-signup-link");

    public void openRegistration() throws IOException {
        getDriver().findElement(SignInLink).click();
        getDriver().findElement(RegistrationLink).click();
    }
}