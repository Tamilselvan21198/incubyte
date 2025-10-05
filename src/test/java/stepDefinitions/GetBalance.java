package stepDefinitions;

import driverManager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class GetBalance {
    WebDriver driver = DriverManager.getInstance().getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @Given("create a user account using the register button")
    public void createAUserAccountUsingTheRegisterButton() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        driver.manage().window().maximize();
        loginPage.clickRegisterButton();
        loginPage.enterFirstName("Sam");
        loginPage.enterLastName("doe7");
        loginPage.enterAddress("123 Main St");
        loginPage.enterCity("Anytown");
        loginPage.enterState("CA");
        loginPage.enterZipcode("12345");
        loginPage.enterPhoneNumber("123-456-7890");
        loginPage.enterSsn("123-45-6789");
        loginPage.enterUserName("samdoe7");
        loginPage.enterPassword("Test@123");
        loginPage.enterConfirmPassword("Test@123");
        loginPage.clickSignUpRegisterButton();
        System.out.println(homePage.getSuccessLoginText());
        String expectedText = "Your account was created successfully. You are now logged in.";
        String actualText = homePage.getSuccessLoginText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("click on the accounts overview link and navigate to the accounts overview page")
    public void clickOnTheAccountsOverviewLinkAndNavigateToTheAccountsOverviewPage() {
        homePage.clickAccountsOverview();
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getTotalBalance()));
    }

    @And("get the account balance from the screen")
    public void getTheAccountBalanceFromTheScreen() {
        String balance = homePage.getTotalBalanceText();
        System.out.println("Account Balance: " + balance);
        driver.quit();
    }
}
