package net.automation.practice.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddTodoItems implements Task {
    private final List<String> items;

    public AddTodoItems(List<String> items) {
        this.items = items;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        items.forEach(
                item -> actor.attemptsTo(AddATodoItem.called(item))
        );
    }

    public static AddTodoItems called(List<String> items) {
        return instrumented(AddTodoItems.class, items);
    }
}
