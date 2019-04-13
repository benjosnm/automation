package net.automation.exam.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class StoreAuthenticate implements Ability {
    private final String username;
    private final String pwd;

    public StoreAuthenticate(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public String getPwd() {
        return pwd;
    }

    public static StoreAuthenticate with(String username, String pwd) {
        return new StoreAuthenticate(username, pwd);
    }

    public static StoreAuthenticate as(Actor actor) {
        return actor.abilityTo(StoreAuthenticate.class);
    }
}
