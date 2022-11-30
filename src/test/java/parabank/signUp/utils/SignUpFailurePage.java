package parabank.signUp.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpFailurePage {

    private final By errorMassageLocator = By.xpath("//span[@class = 'error']");
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.firstName.errors']")
    private WebElement firstNameErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.lastName.errors']")
    private WebElement lastNameErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.address.street.errors']")
    private WebElement addressErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.address.city.errors']")
    private WebElement cityErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.address.state.errors']")
    private WebElement stateErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.address.zipCode.errors']")
    private WebElement zipCodeErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.ssn.errors']")
    private WebElement SNNErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.username.errors']")
    private WebElement usernameErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'customer.password.errors']")
    private WebElement passwordErrorText;
    @FindBy(xpath = "//span[@class = 'error' and @id = 'repeatedPassword.errors']")
    private WebElement repeatPasswordErrorText;

    public SignUpFailurePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void checkErrorRequiredFields() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(errorMassageLocator));
    }

    public String getErrorFirstNameText() {
        return firstNameErrorText.getText();
    }

    public String getErrorLastNameText() {
        return lastNameErrorText.getText();
    }

    public String getErrorAddressText() {
        return addressErrorText.getText();
    }

    public String getErrorCityText() {
        return cityErrorText.getText();
    }

    public String getErrorStateText() {
        return stateErrorText.getText();
    }

    public String getErrorZipCodeText() {
        return zipCodeErrorText.getText();
    }

    public String getErrorSNNText() {
        return SNNErrorText.getText();
    }

    public String getErrorUsernameText() {
        return usernameErrorText.getText();
    }

    public String getErrorPasswordText() {
        return passwordErrorText.getText();
    }

    public String getErrorConfirmPasswordText() {
        return repeatPasswordErrorText.getText();
    }

}
