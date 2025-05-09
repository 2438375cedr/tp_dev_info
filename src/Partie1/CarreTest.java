package Partie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarreTest {
    Carre c0, c1, c2, c3, c4, c5, c6;

    @BeforeEach
    public void setUp() {
        c0 = new Carre();
        c1 = new Carre(7, "vert");
        c2 = new Carre(Carre.DIM_MIN - 1, "bleu");
        c3 = new Carre(Carre.DIM_MAX + 1, "bleu");
        c4 = new Carre(8, null);
        c5 = new Carre(9, "ver");
        c6 = new Carre(10, "orangeRougePale");
    }

    @Test
    void getCote() {
        assertEquals(Carre.COTE_DEFAUT, c0.getCote());
        assertEquals(7, c1.getCote());
        assertEquals(Carre.COTE_DEFAUT, c2.getCote());
        assertEquals(Carre.COTE_DEFAUT, c3.getCote());
    }

    @Test
    void getCouleur() {
        assertEquals(Carre.COUL_DEFAUT, c0.getCouleur());
        assertEquals("vert", c1.getCouleur());
        assertEquals("bleu", c2.getCouleur());
        assertEquals("bleu", c3.getCouleur());
        assertEquals(Carre.COUL_DEFAUT, c4.getCouleur());
        assertEquals(Carre.COUL_DEFAUT, c5.getCouleur());
        assertEquals("orangeRougePale", c6.getCouleur());
    }

    @Test
    void setCote() {
        assertFalse(c1.setCote(Carre.DIM_MIN - 1));
        assertEquals(7, c1.getCote());
        assertTrue(c1.setCote(Carre.DIM_MIN));
        assertEquals(Carre.DIM_MIN, c1.getCote());
        assertTrue(c1.setCote(10));
        assertEquals(10, c1.getCote());
        assertTrue(c1.setCote(Carre.DIM_MAX));
        assertEquals(Carre.DIM_MAX, c1.getCote());
        assertFalse(c1.setCote(Carre.DIM_MAX + 1));
        assertEquals(Carre.DIM_MAX, c1.getCote());
    }

    @Test
    void setCouleur() {
        c1.setCouleur(null);
        assertEquals("vert", c1.getCouleur());
        c1.setCouleur("ver");
        assertEquals("vert", c1.getCouleur());
        c1.setCouleur("rouge");
        assertEquals("rouge", c1.getCouleur());
        c1.setCouleur("orangeRougePale");
        assertEquals("orangeRougePale", c1.getCouleur());
    }

    @Test
    void validerCote() {
        assertFalse(Carre.validerCote(Carre.DIM_MIN - 1));
        assertTrue(Carre.validerCote(Carre.DIM_MIN));
        assertTrue(Carre.validerCote(15));
        assertTrue(Carre.validerCote(Carre.DIM_MAX));
        assertFalse(Carre.validerCote(Carre.DIM_MAX + 1));
    }

    @Test
    void validerCouleur() {
        assertFalse(Carre.validerCouleur(null));
        assertFalse(Carre.validerCouleur("rose"));
        assertTrue(Carre.validerCouleur("rouge"));
        assertTrue(Carre.validerCouleur("bleu"));
        assertTrue(Carre.validerCouleur("orangeRougePale"));
    }

    @Test
    void aire() {
        assertEquals(49, c1.aire());
        assertEquals(100, c6.aire());
    }

    @Test
    void perimetre() {
        assertEquals(28, c1.perimetre());
        assertEquals(40, c6.perimetre());
    }

    @Test
    void testEquals() {
        Carre c7 = new Carre(7, "vert");
        assertEquals(c1, c7);
        Carre c8 = new Carre(8, "vert");
        assertNotEquals(c1, c8);
        Carre c9 = new Carre(7, "bleu");
        assertNotEquals(c1, c9);
        assertNotEquals(null, c1);
        assertNotEquals("some string", c1);
    }
}

