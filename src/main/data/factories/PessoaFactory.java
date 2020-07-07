package data.factories;

import domain.entities.Pessoa;
import domain.enums.EnumTipoDePessoa;

import java.time.LocalDate;
import java.util.UUID;

public class PessoaFactory extends AbstractFactory {
    public PessoaFactory() {
        super();
    }
    public Pessoa create() {
        Pessoa pessoa = new Pessoa();
        String dataNascimento = faker.number().numberBetween(1940, LocalDate.now().getYear() - 18) + "-12" + "-01";

        pessoa.setId(UUID.randomUUID());
        pessoa.setDataDeNascimento(dataNascimento);
        pessoa.setNome(faker.name().fullName());
        pessoa.setTipo(EnumTipoDePessoa.getTipoAleatorio());

        return pessoa;
    }

    public Pessoa create(int age, EnumTipoDePessoa tipo) {
        Pessoa pessoa = new Pessoa();
        String dataNascimento =
        LocalDate.now().getYear() - (age + 1) + "-12" + "-01";

        pessoa.setId(UUID.randomUUID());
        pessoa.setDataDeNascimento(dataNascimento);
        pessoa.setNome(faker.name().fullName());
        pessoa.setTipo(tipo);

        return pessoa;
    }
}
