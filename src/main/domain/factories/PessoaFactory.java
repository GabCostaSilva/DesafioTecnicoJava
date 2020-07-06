package domain.factories;

import com.github.javafaker.Faker;
import domain.entities.Pessoa;
import domain.enums.TipoDePessoa;

public class PessoaFactory extends AbstractFactory {
    Faker faker;

    public PessoaFactory() {
        this.faker = new Faker();
    }

    public Pessoa create() {
        Pessoa pessoa = new Pessoa();
        String dataNascimento = faker.date().birthday(12, 80).toString();

        pessoa.setId(faker.number().randomNumber());
        pessoa.setDataDeNascimento(dataNascimento);
        pessoa.setNome(faker.name().fullName());
        pessoa.setTipo(TipoDePessoa.getTipoAleatorio());

        return pessoa;
    }

    public Pessoa create(int age, TipoDePessoa tipo) {
        Pessoa pessoa = new Pessoa();
        String dataNascimento = faker.date().birthday(age, age).toString();

        pessoa.setId(faker.number().randomNumber());
        pessoa.setDataDeNascimento(dataNascimento);
        pessoa.setNome(faker.name().fullName());
        pessoa.setTipo(tipo);

        return pessoa;
    }
}
