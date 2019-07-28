package test.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class AccounteRelated {

   private WebDriver driver;

   @BeforeTest
   public void setup() {
      String path = System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", path);
      driver = new ChromeDriver();
      driver.manage().window().maximize();
   }


   @Test
   public void testcase_t1234() {
      HomePage home = new HomePage(driver);
      home.clickRegister();
   }
}
