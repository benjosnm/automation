package net.automation.exam.ui.targets;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemsTargets {
    public static Target SEARCH_QUERY_TOP = Target.the("Top search").located(By.id("search_query_top"));

    public static Target getItemDivResultByName(String name) {
        return Target.the("Item DIV that contains in name " + name)
                .locatedBy("//div[@class='product-container']//a[contains(text(), '{0}')]").of(name);
    }


    public static Target getAddToWishListLinkButtonTargetByName(String itemName) {
        return Target.the("add to wishlist button")
                .locatedBy("//div[@class='product-container']//a[contains(text(), '{0}')]" +
                        "//parent::*//parent::*//parent::*//a[contains(@class,'addToWishlist')]").of(itemName);
    }
}
