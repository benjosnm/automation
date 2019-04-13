package net.automation.exam.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.automation.exam.ui.targets.WishlistTargets.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddWishlist implements Task {
    private String wishlistName;

    public AddWishlist(String wishlistName) {
        this.wishlistName = wishlistName;
    }

    public static AddWishlist called(String name) {
        return instrumented(AddWishlist.class, name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MY_WISHLIST_MENU_BUTTON),
                Enter.theValue(wishlistName).into(WISHLIST_NAME_INPUT),
                Click.on(SAVE_WISHLIST_BUTTON)
        );
    }
}
