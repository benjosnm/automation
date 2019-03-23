package net.automation.practice.tasks;

import net.automation.practice.abilities.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.automation.practice.ui.register.RegisterElements.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillCreationForm implements Task {
    public static FillCreationForm withActorInformation() {
        return instrumented(FillCreationForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(UserInformation.as(actor).getFirstName()).into(FIRST_NAME_CUSTOMER_INPUT),
                Enter.theValue(UserInformation.as(actor).getLastName()).into(LAST_NAME_CUSTOMER_INPUT),
                Enter.theValue(UserInformation.as(actor).getCredential().getPwd()).into(PASSWORD_INPUT),
                Enter.theValue(UserInformation.as(actor).getAddressInformation().getAddress()).into(ADDRESS_INPUT),
                Enter.theValue(UserInformation.as(actor).getAddressInformation().getCity()).into(CITY_INPUT),
                Enter.theValue(UserInformation.as(actor).getAddressInformation().getZipCode()).into(ZIP_CODE_INPUT),
                SelectFromOptions.byVisibleText(UserInformation.as(actor).getAddressInformation().getState()).from(STATE_DROPDOWN),
                Enter.theValue(UserInformation.as(actor).getPhoneNumber()).into(MOBILE_INPUT),
                Click.on(SUBMIT_ACCOUNT_BUTTON)
        );
    }
}
