package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

   private WebDriver driver;

   // -------- WEB ELEMENT ----------//
   @FindBy(xpath = "//a[text()='Register']")
   private WebElement registerLink;


   // -------- CONSTRUCTOR ----------//
   public HomePage(WebDriver inputDriver) {
      driver=inputDriver;
      driver.get("https://parabank.parasoft.com/parabank/index.htm");
      PageFactory.initElements(driver, this);
   }



   // -------- USE ACTIONS ----------//
   public Registration clickRegister() {
      registerLink.click();
      return new Registration(driver);
   }
}
