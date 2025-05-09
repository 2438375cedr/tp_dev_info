package Partie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    Rectangle r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14,
            r15, r16;

    @BeforeEach
    public void testRectangle()
    {
        r0 = new Rectangle();
    }

    @BeforeEach
    public void testRectangleIntIntString()
    {
        // Tout valide
        r1 = new Rectangle(6, 8, "bleu");

        // Tests sur largeur
        r2 = new Rectangle(Rectangle.DIM_MIN - 1, 8, "bleu");
        r3 = new Rectangle(Rectangle.DIM_MIN, 8, "bleu");
        r4 = new Rectangle(6, 8, "bleu");
        r5 = new Rectangle(Rectangle.DIM_MAX, 8, "bleu");
        r6 = new Rectangle(Rectangle.DIM_MAX + 1, 8, "bleu");

        // Tests sur hauteur
        r7 = new Rectangle(6, Rectangle.DIM_MIN - 1, "bleu");
        r8 = new Rectangle(6, Rectangle.DIM_MIN, "bleu");
        r9 = new Rectangle(6, 8, "bleu");
        r10 = new Rectangle(6, Rectangle.DIM_MAX, "bleu");
        r11 = new Rectangle(6, Rectangle.DIM_MAX + 1, "bleu");

        // Tests sur couleur
        r12 = new Rectangle(6, 8, null);
        r13 = new Rectangle(6, 8, "ver");
        r14 = new Rectangle(6, 8, "vert");
        r15 = new Rectangle(6, 8, "orangeRougePale");
        r16 = new Rectangle(6, 8, "orangeRougeFonce");
    }



    @Test
    @Disabled
    void getLargeur() {
        /*
		la largeur de r0 = largeur par defaut
		la largeur de r1 = 6
		la largeur de r2 = largeur par defaut
		la largeur de r3 = dimension minimale
		la largeur de r4 = 6
		la largeur de r5 = dimension maximale
		la largeur de r6 = largeur par defaut
		 */
        assertTrue(r0.getLargeur() == Rectangle.LARG_DEFAUT);
        assertTrue(r1.getLargeur() == 6);
        assertTrue(r2.getLargeur() == Rectangle.LARG_DEFAUT);
        assertTrue(r3.getLargeur() == Rectangle.DIM_MIN);
        assertTrue(r4.getLargeur() == 6);
        assertTrue(r5.getLargeur() == Rectangle.DIM_MAX);
        assertTrue(r6.getLargeur() == Rectangle.LARG_DEFAUT);
    }

    @Test
    @Disabled
    void getHauteur() {
        /*
		hauteur de r0 = Hauteur par défaut
		hauteur de r1 = 8
		hauteur de r7 = Hauteur par défaut
		hauteur de r8 = Dimension minimale
		hauteur de r9 = 8
		hauteur de r10 = Dimension maximale
		hauteur de r11 = Hauteur par défaut
		 */
        assertTrue(r0.getHauteur() == Rectangle.HAUT_DEFAUT);
        assertTrue(r1.getHauteur() == 8);
        assertTrue(r7.getHauteur() == Rectangle.HAUT_DEFAUT);
        assertTrue(r8.getHauteur() == Rectangle.DIM_MIN);
        assertTrue(r9.getHauteur() == 8);
        assertTrue(r10.getHauteur() == Rectangle.DIM_MAX);
        assertTrue(r11.getHauteur() == Rectangle.HAUT_DEFAUT);
    }

    @Test
    @Disabled
    void getCouleur() {
/*
		couleur de r0 = couleur par défaut
		couleur de r1 = bleu
		couleur de r12 = couleur par défaut
		couleur de r13 = couleur par défaut
		couleur de r14 = vert
		couleur de r15 = orangeRougePale
		couleur de r16 = couleur par défaut
		 */
        assertEquals(r0.getCouleur(), Rectangle.COUL_DEFAUT);
        assertEquals(r1.getCouleur(), "bleu");
        assertEquals(r12.getCouleur(), Rectangle.COUL_DEFAUT);
        assertEquals(r13.getCouleur(), Rectangle.COUL_DEFAUT);
        assertEquals(r14.getCouleur(), "vert");
        assertEquals(r15.getCouleur(), "orangeRougePale");
        assertEquals(r16.getCouleur(), Rectangle.COUL_DEFAUT);
    }

    @Test
    void setLargeur() {
     /*
		affectez à r1 la largeur dimension minimale -1 PUIS testez qu'elle est égale à 6
		affectez à r1 la largeur dimension minimale  PUIS testez qu'elle est égale à dimension minimale
		affectez à r1 7 PUIS testez qu'elle est égale à 7
		affectez à r1 la largeur dimension maximale + 1 PUIS testez qu'elle est égale à dimension maximale

		 */
        r1.setLargeur(Rectangle.DIM_MIN - 1);
        assertTrue(r1.getLargeur() == 6);
        r1.setLargeur(Rectangle.DIM_MIN);
        assertTrue(r1.getLargeur() == Rectangle.DIM_MIN);
        r1.setLargeur(7);
        assertTrue(r1.getLargeur() == 7);
        r1.setLargeur(Rectangle.DIM_MAX);
        assertTrue(r1.getLargeur() == Rectangle.DIM_MAX);
        r1.setLargeur(Rectangle.DIM_MAX + 1);
        assertTrue(r1.getLargeur() == Rectangle.DIM_MAX);
    }


    @Test
    void validerLargeur() {
       /*
       Montrez que dimension minimale - 1 pour la largeur n'est pas valide
       Montrez que dimension minimale pour la largeur est valide
       Montrez que la largeur 9 est valide
       Montrez que dimension maximale + 1 pour la largeur n'est pas valide

        */
        assertFalse(Rectangle.validerLargeur(Rectangle.DIM_MIN - 1));
        assertTrue(Rectangle.validerLargeur(Rectangle.DIM_MIN));
        assertTrue(Rectangle.validerLargeur(9));
        assertTrue(Rectangle.validerLargeur(Rectangle.DIM_MAX));
        assertFalse(Rectangle.validerLargeur(Rectangle.DIM_MAX + 1));

    }

    @Test
    void setHauteur() {
        /*
		affectez à r1 l hauteur dimension minimale -1 PUIS testez qu'elle est égale à 8
		affectez à r1 l hauteur  dimension minimale  PUIS testez qu'elle est égale à dimension minimale
		affectez à r1 9 PUIS testez qu'elle est égale à 9
		affectez à r1 l hauteur  dimension maximale + 1 PUIS testez qu'elle est égale à dimension maximale
		 */
        r1.setHauteur(Rectangle.DIM_MIN - 1);
        assertTrue(r1.getHauteur() == 8);
        r1.setHauteur(Rectangle.DIM_MIN);
        assertTrue(r1.getHauteur() == Rectangle.DIM_MIN);
        r1.setHauteur(9);
        assertTrue(r1.getHauteur() == 9);
        r1.setHauteur(Rectangle.DIM_MAX);
        assertTrue(r1.getHauteur() == Rectangle.DIM_MAX);
        r1.setHauteur(Rectangle.DIM_MAX + 1);
        assertTrue(r1.getHauteur() == Rectangle.DIM_MAX);

    }

    @Test
    void validerHauteur() {
        /*
        Montrez que dimension minimale - 1 n'est pas une hauteur valide
        Montrez que dimension minimale est  une hauteur valide
        Montrez que 11 est une hauteur valide
        Montrez que dimension maximale est une hauteur valide
        Montrez que dimension maximale + 1 n'est pas une hauteur valide

         */
        assertFalse(Rectangle.validerHauteur(Rectangle.DIM_MIN - 1));
        assertTrue(Rectangle.validerHauteur(Rectangle.DIM_MIN));
        assertTrue(Rectangle.validerHauteur(11));
        assertTrue(Rectangle.validerHauteur(Rectangle.DIM_MAX));
        assertFalse(Rectangle.validerHauteur(Rectangle.DIM_MAX + 1));
    }
    @Test
    void setCouleur() {
        /*
        affectez null à la couleur de r1 puis montrez que la couleur est bleu
         affectez ver à la couleur de r1 puis montrez que la couleur est bleu
         affectez vert à la couleur de r1 puis montrez que la couleur est vert
         affectez orangeRougePale à la couleur de r1 puis montrez que la couleur est orangeRougePale
         affectez orangeRougeFonce à la couleur de r1 puis montrez que la couleur est orangeRougeFonce

         */

        r1.setCouleur(null);
        assertEquals(r1.getCouleur(), "bleu");
        r1.setCouleur("ver");
        assertEquals(r1.getCouleur(), "bleu");
        r1.setCouleur("vert");
        assertEquals(r1.getCouleur(), "vert");
        r1.setCouleur("orangeRougePale");
        assertEquals(r1.getCouleur(), "orangeRougePale");
        r1.setCouleur("orangeRougeFonce");
        assertEquals(r1.getCouleur(), "orangeRougePale");
    }
    @Test
    void validerCouleur() {
        /*
        montrez que null n'est pas une couleur valide
        montrez que ver n'est pas une couleur valide
        montrez que vert est une couleur valide
        montrez que orangeRougePale est une couleur valide
        montrez que orangeRougeFonce n'est pas une couleur valide

         */
        assertFalse(Rectangle.validerCouleur(null));
        assertFalse(Rectangle.validerCouleur("ver"));
        assertTrue(Rectangle.validerCouleur("vert"));
        assertTrue(Rectangle.validerCouleur("orangeRougePale"));
        assertFalse(Rectangle.validerCouleur("orangeRougeFonce"));
    }
    @Test
    void aire() {
        /*
        montrez que aire de r1 est égal à 48
         */
        assertTrue(r1.aire() == 48);
    }
    @Test
    void perimetre() {
         /*
        montrez que perimetre de r1 est égal à 28
         */
        assertTrue(r1.perimetre() == 28);
    }
    @Test
    void memeLargeur() {
        /*
        affectez 9 à la largeur de r1 et r2
        et montrez que r1 et r2 ont la même largeur.
        affectez 7 à la largeur de r2
        et montrea que r1 et r2 n'ont pas la même largeur
         */

        r1.setLargeur(9);
        r2.setLargeur(9);
        assertTrue(r1.memeLargeur(r2));
        r2.setLargeur(7);
        assertFalse(r1.memeLargeur(r2));
    }
    @Test
    void memeHauteur() {
        /*
         affectez 9 à l hauteur de r1 et r2
        et montrez que r1 et r2 ont la même hauteur.
        affectez 7 à l hauteur de r2
        et montrea que r1 et r2 n'ont pas la même largeur
         */

        r1.setHauteur(9);
        r2.setHauteur(9);
        assertTrue(r1.memeHauteur(r2));
        r2.setHauteur(7);
        assertFalse(r1.memeHauteur(r2));
    }
}
