package net.automation.practice.task;

import net.automation.practice.interactions.Refresh;
import net.automation.practice.resources.ApplicationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private final Collection<String> items;
    private final String todoListDescription;
    private ApplicationHomePage applicationHomePage;

    public Start(Collection<String> items, String todoListDescription) {
        this.items = items;
        this.todoListDescription = todoListDescription;
    }

    public static Start withAnEmptyTodoList() {
        return instrumented(Start.class, Collections.EMPTY_LIST, "no items list");
    }

    public static Start withAFilledTodoList(List<String> items) {
        return instrumented(Start.class, items, "non empty list");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(applicationHomePage),
                Refresh.theBrowserSession()
                //,Check.whether(items.isEmpty()).otherwise()
        );
    }
}
