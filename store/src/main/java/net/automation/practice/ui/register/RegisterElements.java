package net.automation.practice.ui.register;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterElements {
    public static Target SIGN_IN_LINK = Target.the("Sign in link").locatedBy("//a[@class='login']");
    public static Target SIGN_IN_EMAIL_INPUT = Target.the("Email").located(By.id("email_create"));
    public static Target SUBMIT_CREATE_BUTTON = Target.the("Submit create button").located(By.id("SubmitCreate"));

    public static Target HEADER_INFO_FULL_NAME = Target.the("Full name header information").locatedBy("//a[@title=\"View my customer account\"]/span");

    // Create account form elements.
    public static Target FIRST_NAME_CUSTOMER_INPUT = Target.the("First name customer input").located(By.id("customer_firstname"));
    public static Target LAST_NAME_CUSTOMER_INPUT = Target.the("Last name customer input").located(By.id("customer_lastname"));
    public static Target PASSWORD_INPUT = Target.the("Password input").located(By.id("passwd"));
    public static Target ADDRESS_INPUT = Target.the("Address input").located(By.id("address1"));
    public static Target ZIP_CODE_INPUT = Target.the("Zip code input").located(By.id("postcode"));
    public static Target CITY_INPUT = Target.the("City input").located(By.id("city"));
    public static Target STATE_DROPDOWN = Target.the("State dropdown").located(By.id("id_state"));
    public static Target MOBILE_INPUT = Target.the("Mobile input").located(By.id("phone_mobile"));
    public static Target SUBMIT_ACCOUNT_BUTTON = Target.the("Submit account button").located(By.id("submitAccount"));
}
