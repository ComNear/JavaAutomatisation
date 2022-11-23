package influential.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @FindBy(xpath = "//input[@name = 'customer.firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name = 'customer.lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name = 'customer.address.street']")
    private WebElement addressStreet;

    @FindBy(xpath = "//input[@name = 'customer.address.city']")
    private WebElement addressCity;

    @FindBy(xpath = "//input[@name = 'customer.address.state']")
    private WebElement addressState;

    @FindBy(xpath = "//input[@name = 'customer.address.zipCode']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@name = 'customer.phoneNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@name = 'customer.ssn']")
    private WebElement ssn;

    @FindBy(xpath = "//input[@name = 'customer.username']")
    private WebElement username;

    @FindBy(xpath = "//input[@name = 'customer.password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name = 'repeatedPassword']")
    private WebElement repeatedPassword;

    @FindBy(xpath = "//input[@type = 'submit' and @value = 'Register']")
    private WebElement submit;

    private final By signupComplete = By.xpath("//p[text() = 'Your account was created successfully. You are now logged in.']");

    public void fillFirstName(String firstNameInput) {

        firstName.sendKeys(firstNameInput);
    }

    public void fillLastName(String lastNameInput) {

        lastName.sendKeys(lastNameInput);
    }

    public void fillAddressStreet(String addressStreetInput) {

        addressStreet.sendKeys(addressStreetInput);
    }

    public void fillAddressCity(String addressCityInput) {

        addressCity.sendKeys(addressCityInput);
    }

    public void fillAddressState(String addressStateInput) {

        addressState.sendKeys(addressStateInput);
    }

    public void fillZipCode(String zipCodeInput) {

        zipCode.sendKeys(zipCodeInput);
    }

    public void fillPhoneNumber(String phoneNumberInput) {

        phoneNumber.sendKeys(phoneNumberInput);
    }

    public void fillSSN(String ssnInput) {

        ssn.sendKeys(ssnInput);
    }

    public void fillUsername(String usernameInput) {

        username.sendKeys(usernameInput);
    }

    public void fillPassword(String passwordInput) {

        password.sendKeys(passwordInput);
    }

    public void fillRepeatPassword(String repeatedPasswordInput) {

        repeatedPassword.sendKeys(repeatedPasswordInput);
    }

    public void submitForm() {
        submit.click();
    }

    public void checkSignUpSuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupComplete));
    }
}

