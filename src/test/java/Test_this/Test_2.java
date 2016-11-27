package Test_this;

import Test_this.Test_this.MainPage;
import Test_this.Test_this.RegistrattionPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static Test_this.DriverWrapper.getDriver;

public class Test_2 {
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
        System.out.println("Passed: RUN TEST 2");

    }

   @After
   public void poscondition() throws IOException {
       getDriver().quit();
   }

}
