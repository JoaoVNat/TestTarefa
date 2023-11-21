package J.Martins;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class PrimeiroTesteTest {

    @Test
    public void PrimeiroTest(){

        List<PessoaGrupo> listaDePessoa = new PessoaGrupo().listaPessoaGP();
        List<PessoaGrupo> mulheres = listaDePessoa.stream()
                .filter(pessoaGrupo -> pessoaGrupo.getGenero().equals("Feminino"))
                        .collect(Collectors.toList());

        for (PessoaGrupo mulher : mulheres){
            Assert.assertEquals("Feminino",mulheres);
        }

    }
    
}