package Partie1;

public class Carre extends Rectangle {
    public static final int COTE_DEFAUT = 4;

    public Carre() {
        super(COTE_DEFAUT, COTE_DEFAUT, COUL_DEFAUT);
    }

    public Carre(int cote, String couleur) {
        super(cote, cote, couleur);
        if (!validerCote(cote) || !validerCouleur(couleur)) {
            setLargeur(COTE_DEFAUT);
            setHauteur(COTE_DEFAUT);
            setCouleur(COUL_DEFAUT);
        }
    }

    public int getCote() {
        return getLargeur();
    }

    public boolean setCote(int cote) {
        if (validerCote(cote)) {
            super.setLargeur(cote);
            super.setHauteur(cote);
            return true;
        }
        return false;
    }

    public static boolean validerCote(int cote) {
        return (cote >= DIM_MIN && cote <= DIM_MAX);
    }

    @Override
    public boolean setLargeur(int pLarg) {
        return setCote(pLarg); // force carré rule
    }

    @Override
    public boolean setHauteur(int pHaut) {
        return setCote(pHaut); // force carré rule
    }

    @Override
    public String toString() {
        return "Le côté du carré est: " + getCote() +
                "\nLa couleur du carré est: " + getCouleur();
    }

    public static void main(String[] args) {
        Carre carre = new Carre(6, "rouge");
        System.out.println(carre);
        System.out.println("Aire: " + carre.aire());
        System.out.println("Périmètre: " + carre.perimetre());

        System.out.println("\nModification du côté à 8...");
        carre.setCote(8);
        System.out.println(carre);
    }

}