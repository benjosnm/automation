package net.automation.practice.task;

import net.automation.practice.interactions.Refresh;
import net.automation.practice.resources.ApplicationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private final List<String> items;
    private final String todoListDescription;
    private ApplicationHomePage applicationHomePage;

    public Start(List<String> items, String todoListDescription) {
        this.items = items;
        this.todoListDescription = todoListDescription;
    }

    public static Start withAnEmptyTodoList() {
        return instrumented(Start.class, Collections.EMPTY_LIST, "no items list");
    }

    public static Start withATodoListContaining(String... items) {
        return withATodoListContaining(Arrays.asList(items));
    }

    public static Start withATodoListContaining(List<String> items) {
        return instrumented(Start.class, items, "non empty list");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(applicationHomePage),
                Refresh.theBrowserSession(),
                Check.whether(items.isEmpty())
                        .otherwise(AddTodoItems.called(items))
        );
    }
}
