/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucastripoli
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    
    @Test
    public void testarGetSaldo(){
        int valor = 500 ;
        TicketMachine tm = new TicketMachine(100);
        try{
             tm.inserir(valor);
        }catch(Exception ex){
            
        }
        assertEquals(valor, tm.getSaldo());
    }
    
    @Test
    public void testarGetTroco(){
        TicketMachine tm = new TicketMachine(500);
         assertNotNull(tm.getTroco());
    }
    
    @Test
    public void testarImprimir(){
         String result = "*****************\n";
        result += "*** R$ " + "500.00" + ",00 ****\n";
        result += "*****************\n";
        int valor = 500;
        TicketMachine tm = new TicketMachine(valor);
        try{
            tm.inserir(valor);
            assertEquals(result, tm.imprimir());
        }catch(Exception ex){
            
        }
         
        
    }
    
    
}
