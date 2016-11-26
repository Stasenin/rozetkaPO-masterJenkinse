package Test_this;

import Test_this.Test_this.MainPage;
import Test_this.Test_this.RegistrattionPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static Test_this.DriverWrapper.getDriver;

public class RozetkaTest {
    MainPage mainPage;
    RegistrattionPage registrationPage;  //  это мы класс делаем переменной?



    @Before
    public void precondition(){
        /*System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();*///        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage = new MainPage();
        registrationPage = new RegistrattionPage(); // обявленную переменную инстанциируем. вызываем конструктор. а конструктор возвращает элемент данного класса.

    }

    @Test
    public void NegativeRegistrationTest() throws InterruptedException, IOException {
        mainPage.open();
        mainPage.openRegistration();
        registrationPage.login();
        registrationPage.password();
        registrationPage.email();
        registrationPage.submit();
        registrationPage.assertBGcolor();
        System.out.println("Passed: Right Error massage and bg input color.");

    }

   @After
   public void poscondition() throws IOException {
       getDriver().quit();
   }

}
