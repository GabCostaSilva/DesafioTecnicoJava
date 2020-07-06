package unit.domain;

import com.github.javafaker.Faker;
import domain.factories.PessoaFactory;

public class TestAbstract {
    public Faker faker;
    public PessoaFactory pessoaFactory;
    public TestAbstract() {
        this.faker = new Faker();
        this.pessoaFactory = new PessoaFactory();
    }
}
