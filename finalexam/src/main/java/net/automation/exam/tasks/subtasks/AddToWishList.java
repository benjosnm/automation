package net.automation.exam.tasks.subtasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.automation.exam.ui.targets.ItemsTargets.getAddToWishListLinkButtonTargetByName;
import static net.automation.exam.ui.targets.ItemsTargets.getItemDivResultByName;

public class AddToWishList {
    public static Task itemQueryNamed(String query) {
        return Task.where(
                "Add item to wishlist",
                MoveMouse.to(getItemDivResultByName(query)),
                Click.on(getAddToWishListLinkButtonTargetByName(query))
        );
    }
}
