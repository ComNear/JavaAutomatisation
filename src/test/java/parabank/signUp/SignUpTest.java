package parabank.signUp;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import parabank.NumberGenerator;
import parabank.signUp.utils.HomePage;
import parabank.signUp.utils.SignUpFailurePage;
import parabank.signUp.utils.SignUpPage;

import java.util.random.RandomGenerator;

public class SignUpTest extends AbstractWebDriverTest {

    @Test
    public void signUp() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.getStarted();

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);

        signUpPage.fillFirstName("first_name_" + NumberGenerator.generateNumber(1000));
        signUpPage.fillLastName("last_name_" + NumberGenerator.generateNumber(1000));
        signUpPage.fillAddressStreet("customer_street_" + NumberGenerator.generateNumber(1000));
        signUpPage.fillAddressCity("customer_city_" + NumberGenerator.generateNumber(1000));
        signUpPage.fillAddressState("customer_state_" + NumberGenerator.generateNumber(1000));
        signUpPage.fillZipCode("" + NumberGenerator.generateNumber(1000));
        signUpPage.fillPhoneNumber(NumberGenerator.generatePhoneNumber());
        signUpPage.fillSSN("" + NumberGenerator.generateNumber(1000));
        signUpPage.fillUsername("customer_username_" + RandomGenerator.getDefault().nextInt(0, 100));
        signUpPage.fillPassword("123456789");
        signUpPage.fillRepeatPassword("123456789");

        signUpPage.submitForm();
        signUpPage.checkSignUpSuccess();
    }

    @Test
    public void signUpFailure() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.getStarted();

        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.submitForm();

        SignUpFailurePage signUpFailurePage = PageFactory.initElements(driver, SignUpFailurePage.class);
        signUpFailurePage.checkErrorRequiredFields();

        Assert.assertEquals(signUpFailurePage.getErrorFirstNameText(), "First name is required.");
        Assert.assertEquals(signUpFailurePage.getErrorLastNameText(), "Last name is required.");
        Assert.assertEquals(signUpFailurePage.getErrorAddressText(), "Address is required.");
        Assert.assertEquals(signUpFailurePage.getErrorCityText(), "City is required.");
        Assert.assertEquals(signUpFailurePage.getErrorStateText(), "State is required.");
        Assert.assertEquals(signUpFailurePage.getErrorZipCodeText(), "Zip Code is required.");
        Assert.assertEquals(signUpFailurePage.getErrorSNNText(), "Social Security Number is required.");
        Assert.assertEquals(signUpFailurePage.getErrorUsernameText(), "Username is required.");
        Assert.assertEquals(signUpFailurePage.getErrorPasswordText(), "Password is required.");
        Assert.assertEquals(signUpFailurePage.getErrorConfirmPasswordText(), "Password confirmation is required.");
    }
}
