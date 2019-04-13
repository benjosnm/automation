package net.automation.exam.tasks;

import net.automation.exam.tasks.subtasks.AddToWishList;
import net.automation.exam.tasks.subtasks.MainSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchItem implements Task {
    private String item;

    public SearchItem(String item) {
        this.item = item;
    }

    public static SearchItem addToWishlistNamed(String item) {
        return instrumented(SearchItem.class, item);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MainSearch.itemByName(item),
                AddToWishList.itemQueryNamed(item)
        );
    }
}
