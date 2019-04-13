package net.automation.exam.questions;

import net.automation.exam.tasks.Load;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Presence;

import static net.automation.exam.ui.targets.WishlistTargets.*;

public class WishList implements Question<Boolean> {
    private String wishlist;
    private String item;

    public WishList(String item, String wishlist) {
        this.wishlist = wishlist;
        this.item = item;
    }

    public static Question<Boolean> containsItemNamed(String itemQuery, String wishlist) {
        return new WishList(itemQuery, wishlist);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Load.theAutomationExamPage(),
                Click.on(MY_ACCOUNT_LINK),
                Click.on(MY_WISHLIST_MENU_BUTTON),
                Click.on(getWishlistByname(wishlist))
        );
        return Presence.of(getWishlistItemByQuery(item)).viewedBy(actor).resolve();
    }
}
