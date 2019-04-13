package net.automation.exam.tasks;

import net.automation.exam.abilities.StoreAuthenticate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.automation.exam.ui.targets.SignInTargets.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignIn implements Task {
    public static SignIn withHisCredentials() {
        return instrumented(SignIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_IN_LINK),
                Enter.theValue(StoreAuthenticate.as(actor).getUsername()).into(SIGN_IN_EMAIL_INPUT),
                Enter.theValue(StoreAuthenticate.as(actor).getPwd()).into(SIGN_IN_PWD_INPUT),
                Click.on(SIGN_IN_BUTTON)
        );
    }
}
