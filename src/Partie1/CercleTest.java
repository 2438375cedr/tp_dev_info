
package Partie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CercleTest {
    Cercle c0, c1, c2, c3, c4, c5, c6, c7, c8;

    @BeforeEach
    public void testRectangle()
    {
        c0 = new Cercle();
    }

    @BeforeEach
    void setUp() {
        c1 = new Cercle(10, "bleu");

        // Tests sur rayon
        c2 = new Cercle(Cercle.RAYON_MIN - 1, "rouge");
        c3 = new Cercle(Cercle.RAYON_MIN, "rouge");
        c4 = new Cercle(Cercle.RAYON_MAX, "rouge");
        c5 = new Cercle(Cercle.RAYON_MAX + 1, "rouge");

        // Tests sur couleur
        c6 = new Cercle(10, null);
        c7 = new Cercle(10, "rou");
        c8 = new Cercle(10, "orangeRougeFoncee");
    }

    @Test
    void testGetRayon() {
        assertEquals(Cercle.RAYON_DEFAUT, c0.getRayon());
        assertEquals(10, c1.getRayon());
        assertEquals(Cercle.RAYON_DEFAUT, c2.getRayon());
        assertEquals(Cercle.RAYON_MIN, c3.getRayon());
        assertEquals(Cercle.RAYON_MAX, c4.getRayon());
        assertEquals(Cercle.RAYON_DEFAUT, c5.getRayon());
    }

    @Test
    void testGetCouleur() {
        assertEquals(Cercle.COUL_DEFAUT, c0.getCouleur());
        assertEquals("bleu", c1.getCouleur());
        assertEquals("rouge", c3.getCouleur());
        assertEquals(Cercle.COUL_DEFAUT, c6.getCouleur());
        assertEquals(Cercle.COUL_DEFAUT, c7.getCouleur());
        assertEquals(Cercle.COUL_DEFAUT, c8.getCouleur());
    }

    @Test
    void testSetRayon() {
        c1.setRayon(12); // valeur valide
        assertEquals(12, c1.getRayon());

        c1.setRayon(Cercle.RAYON_MIN - 1);
        assertEquals(12, c1.getRayon());
    }

    @Test
    void testSetCouleur() {
        c1.setCouleur("vert");
        assertEquals("vert", c1.getCouleur());

        c1.setCouleur("abc"); // trop court
        assertEquals("vert", c1.getCouleur());

        c1.setCouleur(null); // null
        assertEquals("vert", c1.getCouleur());
    }

    @Test
    void testValiderRayon() {
        assertFalse(Cercle.validerRayon(Cercle.RAYON_MIN - 1));
        assertTrue(Cercle.validerRayon(Cercle.RAYON_MIN));
        assertTrue(Cercle.validerRayon(12));
        assertTrue(Cercle.validerRayon(Cercle.RAYON_MAX));
        assertFalse(Cercle.validerRayon(Cercle.RAYON_MAX + 1));
    }

    @Test
    void testValiderCouleur() {
        assertFalse(Cercle.validerCouleur(null));
        assertFalse(Cercle.validerCouleur("abc"));
        assertTrue(Cercle.validerCouleur("rouge"));
        assertTrue(Cercle.validerCouleur("orangeRouge"));
    }

    @Test
    void testAire() {
        Cercle c = new Cercle(2, "bleu");
        assertEquals(Math.PI * 4, c.aire(), 0.0001);
    }

    @Test
    void testPerimetre() {
        Cercle c = new Cercle(3, "rouge");
        assertEquals(2 * Math.PI * 3, c.perimetre(), 0.0001);
    }

    @Test
    void testMemeRayon() {
        Cercle cA = new Cercle(5, "bleu");
        Cercle cB = new Cercle(5, "rouge");
        Cercle cC = new Cercle(6, "rouge");
        assertTrue(cA.memeRayon(cB));
        assertFalse(cA.memeRayon(cC));
    }

    @Test
    void testEquals() {
    }

}