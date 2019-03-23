package net.automation.practice.tasks;

import net.automation.practice.ui.store.IndexApplicationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Load implements Task {
    private IndexApplicationPage indexApplicationPage;

    public static Load theAutomationPracticeIndexPage() {
        return instrumented(Load.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(indexApplicationPage));
    }
}
