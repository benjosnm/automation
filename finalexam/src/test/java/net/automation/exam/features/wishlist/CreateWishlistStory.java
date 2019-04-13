package net.automation.exam.features.wishlist;

import net.automation.exam.abilities.StoreAuthenticate;
import net.automation.exam.questions.MyWhishlists;
import net.automation.exam.tasks.AddWishlist;
import net.automation.exam.tasks.Load;
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
public class CreateWishlistStory {
    private Actor benjamin = Actor.named("Benjamin")
            .whoCan(StoreAuthenticate.with("benjo123@gmail.com", "123456"));

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void benjaminCanBrowseTheWheb() {
        benjamin.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    @WithTag("finalExam:create_whislist")
    public void user_should_be_able_to_create_a_wishlist() {
        givenThat(benjamin).wasAbleTo(Load.theAutomationExamPage());
        and(benjamin).wasAbleTo(SignIn.withHisCredentials());
        when(benjamin).attemptsTo(AddWishlist.called("Wife gifts"));
        then(benjamin).should(seeThat(MyWhishlists.containsWishListCalled("Wife gifts")));
    }
}
