package unit.domain;

import com.github.javafaker.Faker;
import data.factories.PessoaFactory;
import data.factories.familia.FamiliaFactory;
import org.junit.Before;
import org.mockito.MockitoAnnotations;

public class TestAbstract {
    public Faker faker;
    public PessoaFactory pessoaFactory;
    public FamiliaFactory familiaFactory;

    public TestAbstract() {
        this.faker = new Faker();
        this.pessoaFactory = new PessoaFactory();
        this.familiaFactory = new FamiliaFactory();
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

}
