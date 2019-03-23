package net.automation.practice.tasks;

import net.automation.practice.abilities.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.automation.practice.ui.register.RegisterElements.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubmitCreateAccount implements Task {
    public static SubmitCreateAccount withActorInformation() {
        return instrumented(SubmitCreateAccount.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGN_IN_LINK),
                Enter.theValue(UserInformation.as(actor).getCredential().getEmail()).into(SIGN_IN_EMAIL_INPUT),
                Click.on(SUBMIT_CREATE_BUTTON)
        );
    }
}
