package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By successLoginText = By.xpath("//div[@id='rightPanel']/p");
    private By accountsOverview = By.linkText("Accounts Overview");
    private By totalBalance = By.xpath("//*[@id='accountTable']/tbody/tr[2]/td[2]/b");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public By getTotalBalance() {
        return totalBalance;
    }

    public String getSuccessLoginText() {
        return driver.findElement(successLoginText).getText();
    }

    public void clickAccountsOverview() {
        driver.findElement(accountsOverview).click();
    }

    public String getTotalBalanceText() {
        return driver.findElement(totalBalance).getText();
    }

}
