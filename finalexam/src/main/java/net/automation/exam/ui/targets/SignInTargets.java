package net.automation.exam.ui.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInTargets {
    public static Target SIGN_IN_LINK = Target.the("Sign in link").locatedBy("//a[@class=\"login\"]");
    public static Target SIGN_IN_EMAIL_INPUT = Target.the("Email").located(By.id("email"));
    public static Target SIGN_IN_PWD_INPUT = Target.the("Password").located(By.id("passwd"));
    public static Target SIGN_IN_BUTTON = Target.the("Submit login").located(By.id("SubmitLogin"));
}
