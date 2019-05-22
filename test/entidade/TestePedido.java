/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author pretto
 */
public class TestePedido {

    @Test
    public void testCalcularValorLiquido() {
        double valorLiquidoEsperado = 900;

        Pedido pedido = new Pedido();

        pedido.setData("10/04/2019");
        pedido.setValorTotal(1000);

        assertEquals(valorLiquidoEsperado, pedido.calcularValorLiquido(10), 0.001);
    }

}
