package net.automation.practice.features.operation;

import net.automation.practice.task.Start;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

@RunWith(SerenityRunner.class)
public class AddNewTodosStory {
    private Actor benjamin = Actor.named("Benjamin");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void benjaminCanBrowseTheWeb() {
        benjamin.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void should_be_able_to_add_the_first_item() {
        givenThat(benjamin).wasAbleTo(Start.withAnEmptyTodoList());
        //when(benjamin).attemptsTo(AddATodoItem.called("Buy some milk"));
        //then(benjamin).should(seeThat(TheItems.displayed(), hasItem("")));
    }
}
