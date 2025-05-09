package Partie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    Triangle t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;

    @BeforeEach
    public void setUp() {
        t0 = new Triangle();
        t1 = new Triangle(6, 8, "bleu");
        t2 = new Triangle(Triangle.DIM_MIN - 1, 8, "bleu");
        t3 = new Triangle(6, Triangle.DIM_MIN - 1, "bleu");
        t4 = new Triangle(6, 8, null);
        t5 = new Triangle(6, 8, "ver");
        t6 = new Triangle(Triangle.DIM_MAX, 8, "bleu");
        t7 = new Triangle(6, Triangle.DIM_MAX, "rouge");
        t8 = new Triangle(6, 8, "vert");
        t9 = new Triangle(6, 8, "jaune");
        t10 = new Triangle(6, 8, "orangeRougePale");
        t11 = new Triangle(6, 8, "orangeRougeFonce");
        t12 = new Triangle(6, 8, "bleu");
        t13 = new Triangle(6, 8, "rouge");
        t14 = new Triangle(6, 8, "vert");
        t15 = new Triangle(6, 8, "jaune");
    }

    @Test
    public void testGetBase() {
        assertEquals(6, t1.getBase());
        assertEquals(Triangle.BASE_DEFAUT, t0.getBase());
    }

    @Test
    public void testGetHauteur() {
        assertEquals(8, t1.getHauteur());
        assertEquals(Triangle.HAUT_DEFAUT, t0.getHauteur());
    }

    @Test
    public void testGetCouleur() {
        assertEquals("bleu", t1.getCouleur());
        assertEquals(Triangle.COUL_DEFAUT, t0.getCouleur());
    }

    @Test
    public void testSetBase() {
        t1.setBase(Triangle.DIM_MIN - 1);
        assertEquals(6, t1.getBase());
        t1.setBase(Triangle.DIM_MIN);
        assertEquals(Triangle.DIM_MIN, t1.getBase());
        t1.setBase(7);
        assertEquals(7, t1.getBase());
        t1.setBase(Triangle.DIM_MAX + 1);
        assertEquals(7, t1.getBase());
    }

    @Test
    public void testSetHauteur() {
        t1.setHauteur(Triangle.DIM_MIN - 1);
        assertEquals(8, t1.getHauteur());
        t1.setHauteur(Triangle.DIM_MIN);
        assertEquals(Triangle.DIM_MIN, t1.getHauteur());
        t1.setHauteur(9);
        assertEquals(9, t1.getHauteur());
        t1.setHauteur(Triangle.DIM_MAX + 1);
        assertEquals(9, t1.getHauteur());
    }

    @Test
    public void testSetCouleur() {
        t1.setCouleur(null);
        assertEquals("bleu", t1.getCouleur());
        t1.setCouleur("ver");
        assertEquals("bleu", t1.getCouleur());
        t1.setCouleur("vert");
        assertEquals("vert", t1.getCouleur());
        t1.setCouleur("orangeRougePale");
        assertEquals("orangeRougePale", t1.getCouleur());
        t1.setCouleur("orangeRougeFonce");
        assertEquals("orangeRougePale", t1.getCouleur());
    }

    @Test
    public void testAire() {
        assertEquals(24.0, t1.aire(), 0.0001);
    }

    @Test
    public void testPerimetre() {
        assertEquals(23, t1.perimetre());
        assertEquals(16, t2.perimetre());
        assertEquals(12, t3.perimetre());
    }

    @Test
    public void testEquals() {
        assertEquals(t1, t12);
        assertNotEquals(t1, t13);
        assertNotEquals(t1, t14);
        assertNotEquals(t1, t15);
    }

    @Test
    public void testMemeBase() {
        Triangle t16 = new Triangle(6, 8, "vert");
        Triangle t17 = new Triangle(7, 8, "bleu");
        assertTrue(t1.memeBase(t16));
        assertFalse(t1.memeBase(t17));
    }

    @Test
    public void testMemeHauteur() {
        Triangle t18 = new Triangle(6, 8, "vert");
        Triangle t19 = new Triangle(6, 9, "bleu");
        assertTrue(t1.memeHauteur(t18));
        assertFalse(t1.memeHauteur(t19));
    }

}


