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
