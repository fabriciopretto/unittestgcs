/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
public class PedidoTest {
    
    public PedidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getData method, of class Pedido.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Pedido instance = new Pedido();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Pedido.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Pedido instance = new Pedido();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotal method, of class Pedido.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Pedido instance = new Pedido();
        double expResult = 0.0;
        double result = instance.getValorTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorTotal method, of class Pedido.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        double valorTotal = 0.0;
        Pedido instance = new Pedido();
        instance.setValorTotal(valorTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorFinal method, of class Pedido.
     */
    @Test
    public void testGetValorFinal() {
        System.out.println("getValorFinal");
        Pedido instance = new Pedido();
        double expResult = 0.0;
        double result = instance.getValorFinal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorFinal method, of class Pedido.
     */
    @Test
    public void testSetValorFinal() {
        System.out.println("setValorFinal");
        double valorFinal = 0.0;
        Pedido instance = new Pedido();
        instance.setValorFinal(valorFinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesconto method, of class Pedido.
     */
    @Test
    public void testGetDesconto() {
        System.out.println("getDesconto");
        Pedido instance = new Pedido();
        double expResult = 0.0;
        double result = instance.getDesconto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesconto method, of class Pedido.
     */
    @Test
    public void testSetDesconto() {
        System.out.println("setDesconto");
        double desconto = 0.0;
        Pedido instance = new Pedido();
        instance.setDesconto(desconto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularValorLiquido method, of class Pedido.
     */
    @Test
    public void testCalcularValorLiquido() {
        System.out.println("calcularValorLiquido");
        double percentualDesconto = 0.0;
        Pedido instance = new Pedido();
        double expResult = 0.0;
        double result = instance.calcularValorLiquido(percentualDesconto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
