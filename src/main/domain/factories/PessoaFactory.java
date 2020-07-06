package domain.factories;

import com.github.javafaker.Faker;
import domain.entities.Pessoa;
import domain.enums.TipoDePessoa;

import java.time.LocalDate;

public class PessoaFactory extends AbstractFactory {
    Faker faker;

    public PessoaFactory() {
        this.faker = new Faker();
    }

    public Pessoa create() {
        Pessoa pessoa = new Pessoa();
        String dataNascimento = faker.number().numberBetween(1940, LocalDate.now().getYear() - 18) + "-12" + "-01";

        pessoa.setId(faker.number().randomNumber());
        pessoa.setDataDeNascimento(dataNascimento);
        pessoa.setNome(faker.name().fullName());
        pessoa.setTipo(TipoDePessoa.getTipoAleatorio());

        return pessoa;
    }

    public Pessoa create(int age, TipoDePessoa tipo) {
        Pessoa pessoa = new Pessoa();
        String dataNascimento =
        LocalDate.now().getYear() - (age + 1) + "-12" + "-01";

        pessoa.setId(faker.number().randomNumber());
        pessoa.setDataDeNascimento(dataNascimento);
        pessoa.setNome(faker.name().fullName());
        pessoa.setTipo(tipo);

        return pessoa;
    }
}
