package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators for elements on the login page
    private By registerButton = By.linkText("Register");
    private By firstNameField = By.id("customer.firstName");
    private By lastNameField = By.id("customer.lastName");
    private By addressField = By.id("customer.address.street");
    private By cityField = By.id("customer.address.city");
    private By stateField = By.id("customer.address.state");
    private By zipcodeField = By.id("customer.address.zipCode");
    private By phoneNumberField = By.id("customer.phoneNumber");
    private By ssnField = By.id("customer.ssn");
    private By userNameField = By.id("customer.username");
    private By passwordField = By.id("customer.password");
    private By confirmPasswordField = By.id("repeatedPassword");
    private By signUpRegisterButton = By.xpath("//*[@value='Register']");
    private By loginUserNameField = By.name("username");
    private By loginpasswordField = By.name("password");
    private By loginButton = By.xpath("//input[@value='Log In']");


    // Constructor to initialize the WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void enterCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void enterState(String state) {
        driver.findElement(stateField).sendKeys(state);
    }

    public void enterZipcode(String zipcode) {
        driver.findElement(zipcodeField).sendKeys(zipcode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void enterSsn(String ssn) {
        driver.findElement(ssnField).sendKeys(ssn);
    }

    public void enterUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickSignUpRegisterButton() {
        driver.findElement(signUpRegisterButton).click();
    }

    public void enterUsername(String username) {
        driver.findElement(loginUserNameField).sendKeys(username);
    }

    public void enterLoginPassword(String password) {
        driver.findElement(loginpasswordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

}

