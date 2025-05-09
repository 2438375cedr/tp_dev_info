package Partie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarreTest {

    Carre c0, c1, c2, c3, c4, c5;

    @BeforeEach
    public void setUp() {
        c0 = new Carre();
        c1 = new Carre(4, "bleu");
        c2 = new Carre(Rectangle.DIM_MIN - 1, "bleu");
        c3 = new Carre(Rectangle.DIM_MIN, "bleu");
        c4 = new Carre(Rectangle.DIM_MAX, "rouge");
        c5 = new Carre(5, "couleurInvalide");
    }

    @Test
    void getCote() {
        assertEquals(Rectangle.LARG_DEFAUT, c0.getCote());
        assertEquals(4, c1.getCote());
        assertEquals(Rectangle.LARG_DEFAUT, c2.getCote());
        assertEquals(Rectangle.DIM_MIN, c3.getCote());
        assertEquals(Rectangle.DIM_MAX, c4.getCote());
        assertEquals(Rectangle.LARG_DEFAUT, c5.getCote());
    }

    @Test
    void getCouleur() {
        assertEquals(Rectangle.COUL_DEFAUT, c0.getCouleur());
        assertEquals("bleu", c1.getCouleur());
        assertEquals("bleu", c2.getCouleur());
        assertEquals("bleu", c3.getCouleur());
        assertEquals("rouge", c4.getCouleur());
        assertEquals(Rectangle.COUL_DEFAUT, c5.getCouleur());
    }

    @Test
    void setCote() {
        assertFalse(c1.setCote(Rectangle.DIM_MIN - 1));
        assertEquals(4, c1.getCote());

        assertTrue(c1.setCote(Rectangle.DIM_MIN));
        assertEquals(Rectangle.DIM_MIN, c1.getCote());

        assertTrue(c1.setCote(7));
        assertEquals(7, c1.getCote());

        assertTrue(c1.setCote(Rectangle.DIM_MAX));
        assertEquals(Rectangle.DIM_MAX, c1.getCote());

        assertFalse(c1.setCote(Rectangle.DIM_MAX + 1));
        assertEquals(Rectangle.DIM_MAX, c1.getCote());
    }

    @Test
    void aireEtPerimetre() {
        Carre c = new Carre(4, "bleu");
        assertEquals(16, c.aire());
        assertEquals(16, c.perimetre());
    }

    @Test
    void equalsCarre() {
        Carre cA = new Carre(5, "rouge");
        Carre cB = new Carre(5, "rouge");
        Carre cC = new Carre(6, "rouge");
        Carre cD = new Carre(5, "vert");

        assertEquals(cA, cB);
        assertNotEquals(cA, cC);
        assertNotEquals(cA, cD);
        assertNotEquals(null, cA);
        assertNotEquals(cA, new Rectangle(5, 5, "rouge"));
    }
}

