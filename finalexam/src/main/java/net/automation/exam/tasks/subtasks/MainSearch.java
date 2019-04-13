package net.automation.exam.tasks.subtasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.automation.exam.ui.targets.ItemsTargets.SEARCH_QUERY_TOP;

public class MainSearch {
    public static Task itemByName(String searchedItem) {
        return Task.where("Search item using main search",
                Enter.theValue(searchedItem).into(SEARCH_QUERY_TOP).thenHit(Keys.ENTER));
    }
}
