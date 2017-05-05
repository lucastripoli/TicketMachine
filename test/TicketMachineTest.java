
import br.calebe.ticketmachine.core.TicketMachine;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucastripoli
 */
public class TicketMachineTest {

    @Test
    public void testarGetSaldo() {
        int valor = 100;
        TicketMachine tm = new TicketMachine(500);
        try {
            tm.inserir(valor);
        } catch (Exception ex) {
            System.out.println("bloco catch");
        }
        assertEquals(valor, tm.getSaldo());

    }

    @Test
    public void testarGetTroco() {
        TicketMachine tm = new TicketMachine(500);
        assertNull(tm.getTroco());
    }

    @Test
    public void testarImprimir() {
      int valor = 100;
       String result = "*****************\n";
        result += "*** R$ " + valor + ",00 ****\n";
        result += "*****************\n";
        
        TicketMachine tm = new TicketMachine(35);
        try {
            tm.inserir(valor);
            assertEquals(result, tm.imprimir());
        } catch (Exception ex) {

        }

         }
    }
