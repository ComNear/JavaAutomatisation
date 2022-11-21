package influential.signUp;
import influential.NumberGenerator;
import influential.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import java.util.random.RandomGenerator;

public class SignUp extends WebDriverSettings {

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
        signUpPage.checkErrorRequiredFields();

        Assert.assertEquals(signUpPage.getErrorFirstNameText(), "First name is required.");
        Assert.assertEquals(signUpPage.getErrorLastNameText(), "Last name is required.");
        Assert.assertEquals(signUpPage.getErrorAddressText(), "Address is required.");
        Assert.assertEquals(signUpPage.getErrorCityText(), "City is required.");
        Assert.assertEquals(signUpPage.getErrorStateText(), "State is required.");
        Assert.assertEquals(signUpPage.getErrorZipCodeText(), "Zip Code is required.");
        Assert.assertEquals(signUpPage.getErrorSNNText(), "Social Security Number is required.");
        Assert.assertEquals(signUpPage.getErrorUsernameText(), "Username is required.");
        Assert.assertEquals(signUpPage.getErrorPasswordText(), "Password is required.");
        Assert.assertEquals(signUpPage.getErrorConfirmPasswordText(), "Password confirmation is required.");
    }
}
