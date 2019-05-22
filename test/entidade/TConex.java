/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import apoio.ConexaoBD;
import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pretto
 */
// Fonte: https://www.devmedia.com.br/criando-testes-de-unidades-com-o-junit-4-usando-anotacoes/4798
public class TConex {

    Connection conexao;

    public TConex() {
    }

    // antes da classe de testes executar
    @BeforeClass
    public static void setUpClass() {
    }

    // apos a classe de testes executar
    @AfterClass
    public static void tearDownClass() {
    }

    // antes de iniciar os testes dos metodos
    @Before
    public void setUp() {
        conexao = null;
    }

    // apos execucao dos metodos
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}    
    @Test
    public void testarConexao() {
        assertNotEquals(conexao, new ConexaoBD().getInstance().getConnection());
    }
}
