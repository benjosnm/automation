package net.automation.practice.factories;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import net.automation.practice.models.AddressInformation;
import net.automation.practice.models.UserCredential;
import net.automation.practice.abilities.UserInformation;
import net.serenitybdd.screenplay.Actor;

import java.util.Locale;

public class RandomActorFactory {
    private static FakeValuesService fakeValuesService;
    private static Faker faker;

    public static Actor getActor(Locale actorLocale) {
        fakeValuesService = new FakeValuesService(actorLocale, new RandomService());
        faker = new Faker(actorLocale);

        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();

        UserCredential userCredential = new UserCredential(
                fakeValuesService.bothify("??????_####@testmail.com"),
                fakeValuesService.bothify("??????_####"));

        AddressInformation addressInformation = new AddressInformation(
                faker.address().fullAddress(),
                faker.address().city(),
                faker.address().state(),
                "00000"
        );

        Actor randomActor = Actor.named(firstname).whoCan(UserInformation.is(
                firstname,
                lastname,
                userCredential,
                faker.phoneNumber().cellPhone(),
                addressInformation
        ));

        return randomActor;
    }
}
