package net.automation.practice.features.register;

import net.automation.practice.abilities.UserInformation;
import net.automation.practice.factories.RandomActorFactory;
import net.automation.practice.questions.HeaderInformation;
import net.automation.practice.tasks.FillCreationForm;
import net.automation.practice.tasks.Load;
import net.automation.practice.tasks.SubmitCreateAccount;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class CreateAccountStory {
    private RandomActorFactory factory = new RandomActorFactory();
    private Actor randomActor = factory.getActor(Locale.US);

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void randomActorCanBrowseTheWeb() {
        randomActor.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    @WithTag("register:create_account")
    public void create_account_should_display_username_in_header_info() {
        givenThat(randomActor).wasAbleTo(Load.theAutomationPracticeIndexPage());
        and(randomActor).wasAbleTo(SubmitCreateAccount.withActorInformation());
        when(randomActor).attemptsTo(FillCreationForm.withActorInformation());
        then(randomActor).should(seeThat(HeaderInformation.displayed(), is(UserInformation.as(randomActor).getFullName())));
    }
}
