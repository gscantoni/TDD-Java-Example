package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Relogio;

class RelogioTest {

    @Test
    void testSetHora() {
        Relogio relogio = new Relogio();
        relogio.setHora(2);
        assertEquals(2, relogio.getHora());
    }
    @Test
    void testSetMinuto() {
        Relogio relogio = new Relogio();
        relogio.setMinuto(25);
        assertEquals(25, relogio.getMinuto());
    }

    @Test
    void testSetSegundo() {
        Relogio relogio = new Relogio();
        relogio.setSegundo(50);
        assertEquals(50, relogio.getSegundo());
    }
    @Test
    void testReiniciarParaMeiaNoite() {
        Relogio relogio = new Relogio();
        relogio.setHora(2);
        relogio.setMinuto(25);
        relogio.setSegundo(50);
        relogio.reiniciarParaMeiaNoite();
        assertEquals(0, relogio.getHora());
        assertEquals(0, relogio.getMinuto());
        assertEquals(0, relogio.getSegundo());
    }
    @Test
    void testMarcaIntervalo() {
        Relogio relogio = new Relogio();
        relogio.setHora(12);
        relogio.setMinuto(0);
        relogio.setSegundo(0);
        
        relogio.marcaIntervalo(1, 30, 0, 2, 0, 0);
        
        assertEquals("1:30:00", relogio.getIntervaloInicio());
        assertEquals("2:00:00", relogio.getIntervaloFim());
        assertEquals("00:30:00", relogio.getTempoDecorrido());
    }
    @Test
    void testFormato24h() {
        Relogio relogio = new Relogio();
        relogio.setHora(15);
        relogio.setMinuto(45);
        relogio.setSegundo(0);
        assertEquals("15:45:00", relogio.getHoraFormato24h());
    }
