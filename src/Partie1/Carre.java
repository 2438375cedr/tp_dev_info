package Partie1;

public class Carre {
    public static final int COTE_DEFAUT = 5;
    public static final String COUL_DEFAUT = "bleu";
    public static final int DIM_MIN = 1;
    public static final int DIM_MAX = 30;

    private int cote;
    private String couleur;

    public Carre() {
        this.cote = COTE_DEFAUT;
        this.couleur = COUL_DEFAUT;
    }

    public Carre(int cote, String couleur) {
        if (validerCote(cote)) {
            this.cote = cote;
        } else {
            this.cote = COTE_DEFAUT;
        }

        if (validerCouleur(couleur)) {
            this.couleur = couleur;
        } else {
            this.couleur = COUL_DEFAUT;
        }
    }

    public int getCote() {
        return cote;
    }

    public boolean setCote(int cote) {
        if (validerCote(cote)) {
            this.cote = cote;
            return true;
        }
        return false;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if (validerCouleur(couleur)) {
            this.couleur = couleur;
        }
    }

    public int aire() {
        return cote * cote;
    }

    public int perimetre() {
        return 4 * cote;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Carre)) return false;
        Carre autre = (Carre) o;
        return this.cote == autre.cote && this.couleur.equals(autre.couleur);
    }

    public static boolean validerCote(int cote) {
        return cote >= DIM_MIN && cote <= DIM_MAX;
    }

    public static boolean validerCouleur(String couleur) {
        return couleur != null &&
                (couleur.equals("rouge") || couleur.equals("vert") ||
                        couleur.equals("bleu") || couleur.equals("orangeRougePale"));
    }
}