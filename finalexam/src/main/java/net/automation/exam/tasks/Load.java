package net.automation.exam.tasks;

import net.automation.exam.ui.IndexStorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Load implements Task {
    private IndexStorePage indexStorePage;

    public static Load theAutomationExamPage() {
        return instrumented(Load.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(indexStorePage));
    }
}
