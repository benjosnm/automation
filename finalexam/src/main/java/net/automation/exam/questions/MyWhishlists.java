package net.automation.exam.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;

import static net.automation.exam.ui.targets.WishlistTargets.getWishlistByname;

public class MyWhishlists implements Question<Boolean> {
    private String whishlistItem;

    public MyWhishlists(String whishlistItem) {
        this.whishlistItem = whishlistItem;
    }

    public static Question<Boolean> containsWishListCalled(String item) {
        return new MyWhishlists(item);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Presence.of(getWishlistByname(whishlistItem)).viewedBy(actor).resolve();
    }
}
