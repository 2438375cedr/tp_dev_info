package Partie1;

public class Triangle {
    public static final int DIM_MIN = 1;
    public static final int DIM_MAX = 30;
    public static final int BASE_DEFAUT = 5;
    public static final int HAUT_DEFAUT = 5;
    public static final String COUL_DEFAUT = "bleu";
    private int base;
    private int hauteur;
    private String couleur;

    public Triangle() {
        this.base = BASE_DEFAUT;
        this.hauteur = HAUT_DEFAUT;
        this.couleur = COUL_DEFAUT;
    }

    public Triangle(int base, int hauteur, String couleur) {
        setBase(base);
        setHauteur(hauteur);
        setCouleur(couleur);
    }

    public int getBase() {
        return base;
    }

    public int getHauteur() {
        return hauteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setBase(int base) {
        if (validerBase(base)) {
            this.base = base;
        }
    }

    public void setHauteur(int hauteur) {
        if (validerHauteur(hauteur)) {
            this.hauteur = hauteur;
        }
    }

    public void setCouleur(String couleur) {
        if (validerCouleur(couleur)) {
            this.couleur = couleur;
        }
    }

    public double aire() {
        return (base * hauteur) / 2.0;
    }

    public int perimetre() {
        double side = Math.sqrt(Math.pow(base / 2.0, 2) + Math.pow(hauteur, 2));
        return (int) (base + 2 * side);
    }


    public boolean memeBase(Triangle autre) {
        return autre != null && this.base == autre.base;
    }

    public boolean memeHauteur(Triangle autre) {
        return autre != null && this.hauteur == autre.hauteur;
    }

    public static boolean validerBase(int base) {
        return base >= DIM_MIN && base <= DIM_MAX;
    }

    public static boolean validerHauteur(int hauteur) {
        return hauteur >= DIM_MIN && hauteur <= DIM_MAX;
    }

    public static boolean validerCouleur(String couleur) {
        return couleur != null &&
                (couleur.equals("bleu") || couleur.equals("rouge") ||
                        couleur.equals("vert") || couleur.equals("jaune") ||
                        couleur.equals("orangeRougePale"));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle)) return false;
        Triangle other = (Triangle) obj;
        return this.base == other.base &&
                this.hauteur == other.hauteur &&
                this.couleur.equals(other.couleur);
    }

    @Override
    public String toString() {
        return "Triangle de base " + base + ", de hauteur " + hauteur +
                " et de couleur " + couleur;
    }
}

