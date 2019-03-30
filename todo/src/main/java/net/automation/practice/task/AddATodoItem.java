package net.automation.practice.task;

import net.automation.practice.ui.TodoListPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddATodoItem {
    public static Task called(String item) {
        return Task.where("add an item to todo in the list: #item",
                Enter.theValue(item).into(TodoListPage.NEEDS_TO_BE_DONE_INPUT).thenHit(Keys.ENTER)
        );
    }

}
