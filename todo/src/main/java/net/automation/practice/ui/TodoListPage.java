package net.automation.practice.ui;

import net.serenitybdd.screenplay.targets.Target;

public class TodoListPage {
    public static Target NEEDS_TO_BE_DONE_INPUT = Target.the("need to be done input").locatedBy("//form/input");
    public static Target TODO_LABEL_LIST = Target.the("need to be done label").locatedBy("//label[@class='ng-binding']");
}
