package net.automation.exam.features.wishlist;

import net.automation.exam.abilities.StoreAuthenticate;
import net.automation.exam.questions.WishList;
import net.automation.exam.tasks.AddWishlist;
import net.automation.exam.tasks.Load;
import net.automation.exam.tasks.SearchItem;
import net.automation.exam.tasks.SignIn;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class SearchItemAddWishListStory {
    private Actor benjamin = Actor.named("Benjamin")
            .whoCan(StoreAuthenticate.with("benjo123@gmail.com", "123456"));

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void benjaminCanBrowseTheWheb() {
        benjamin.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    @WithTag("finalExam:search_item_add_to_wishlist")
    public void user_should_be_able_to_search_an_item_and_add_to_wishlist() {
        givenThat(benjamin).wasAbleTo(Load.theAutomationExamPage());
        and(benjamin).wasAbleTo(SignIn.withHisCredentials());
        when(benjamin).attemptsTo(AddWishlist.called("Wife gifts"));
        when(benjamin).attemptsTo(SearchItem.addToWishlistNamed("Printed Chiffon"));
        then(benjamin).should(seeThat(WishList.containsItemNamed("Printed Chiffon", "Wife gifts")));
    }
}
