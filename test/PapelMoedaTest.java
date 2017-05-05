/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lucastripoli
 */
public class PapelMoedaTest {
    
 
    
    @Test
    public void getValortest(){
        int valor = 500;
        int quantidade = 100;
        PapelMoeda pm = new PapelMoeda(valor, quantidade);
        assertEquals(valor, pm.getValor());
    }
    
    @Test
    public void getQuantidadetest(){
        int valor = 500;
        int quantidade = 100;
        PapelMoeda pm = new PapelMoeda(valor, quantidade);
        assertEquals(quantidade, pm.getQuantidade());
    }
    
    @Test
    public void setValortest(){
        int valor = 500;
        int quantidade = 100;
        PapelMoeda pm = new PapelMoeda(valor, quantidade);
        valor = 123;
        pm.setValor(valor);
        assertEquals(valor, pm.valor);
    }
            
            
    @Test
    public void setQuantidade(){
        int valor = 500;
        int quantidade = 100;
        PapelMoeda pm = new PapelMoeda(valor, quantidade);
        quantidade = 123;
        pm.setQuantidade(quantidade);
        assertEquals(quantidade, pm.quantidade);
    }
    
}
