package net.automation.exam.ui.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WishlistTargets {
    public static Target MY_ACCOUNT_LINK = Target.the("My account button").locatedBy("//div[@class='header_user_info']/a");
    public static Target MY_WISHLIST_MENU_BUTTON = Target.the("My whishlist menu").locatedBy("//a[@title='My wishlists']");
    public static Target WISHLIST_NAME_INPUT = Target.the("Wishlist name").located(By.id("name"));
    public static Target SAVE_WISHLIST_BUTTON = Target.the("save wishlist").located(By.id("submitWishlist"));

    public static Target getWishlistByname(String itemName) {
        return Target.the("Wishlist called " + itemName)
                .locatedBy("//tr[contains(@id,'wishlist_')]//a[contains(text(),'{0}')]").of(itemName);
    }

    public static Target getWishlistItemByQuery(String query) {
        return Target.the("Wishlist item name contains " + query)
                .locatedBy("//div[@class='wlp_bought']//p[contains(text(), '{0}')]").of(query);
    }
}
