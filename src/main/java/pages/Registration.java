package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
   public WebDriver driver;

   // -------- WEB ELEMENT ----------//
   @FindBy(id="customer.firstName")
   private WebElement firstName;

   @FindBy(id="customer.lastName")
   private WebElement lastName;

   @FindBy(id="customer.address.street")
   private WebElement address;

   @FindBy(id="customer.address.city")
   private WebElement city;

   @FindBy(id="customer.address.state")
   private WebElement state;

   @FindBy(id="customer.address.zipCode")
   private WebElement zipcode;

   @FindBy(id="customer.phoneNumber")
   private WebElement phoneNubmer;

   @FindBy(id="customer.ssn")
   private WebElement ssn;

   @FindBy(id="customer.username")
   private WebElement username;

   @FindBy(id="customer.password")
   private WebElement password;

   @FindBy(id="repeatedPassword")
   private WebElement passwordconfrim;

   @FindBy(xpath="//input[@value='Register']")
   private WebElement registerButton;



   // -------- CONSTRUCTOR ----------//
   public Registration(WebDriver inputDriver) {
      driver = inputDriver;
      PageFactory.initElements(driver, this);
   }



   // -------- USE ACTIONS ----------//
   public boolean register() {

      return false;
   }
}
