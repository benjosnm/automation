package net.automation.practice.questions;

import net.serenitybdd.screenplay.Question;

import java.util.List;

public class TheItems {
    public static Question<List<String>> displayed() {
        return new DisplayedItems();
    }
}
