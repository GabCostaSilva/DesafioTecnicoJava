package data.factories;

import com.github.javafaker.Faker;

public abstract class AbstractFactory {
    Faker faker;
    public AbstractFactory() {
        this.faker = new Faker();
    }
}
