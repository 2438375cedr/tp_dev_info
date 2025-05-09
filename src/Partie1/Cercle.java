package Partie1;

public class Cercle {
    public static final double RAYON_MIN = 2;
    public static final double RAYON_MAX = 30;
    public static final double RAYON_DEFAUT = 5;
    public static final String COUL_DEFAUT = "jaune";
    public static final int LONGUEUR_COUL_MIN = 4;
    public static final int LONGUEUR_COUL_MAX = 15;

    private double rayon;
    private String couleur;

    public Cercle() {
       this(RAYON_DEFAUT, COUL_DEFAUT);
    }
    Cercle(double pRayon, String pCouleur){
        boolean ok = setRayon(pRayon) && setCouleur(pCouleur);
        if(!ok){
            rayon = RAYON_DEFAUT;
            couleur = COUL_DEFAUT;
        }
    }

    public static boolean validerRayon( double pRayon){return (pRayon>= RAYON_MIN && pRayon<=RAYON_MAX);}
    public double getRayon() {
        return rayon;
    }

    public boolean setRayon(double rayon) {
        if (validerRayon(rayon)) {
            this.rayon = rayon;
            return true;
        }
        return false;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean setCouleur(String couleur) {
        if (validerCouleur(couleur)) {
            this.couleur = couleur;
            return true;
        }
        return false;
    }
    public static boolean validerCouleur(String pCoul)
    {
        return (pCoul != null && pCoul.length() >= LONGUEUR_COUL_MIN
                && pCoul.length() <= LONGUEUR_COUL_MAX);
    }


    public double aire(){return  Math.PI* rayon*rayon;}

    public double perimetre()
    {
        return 2 *Math.PI*rayon;
    }

    public boolean memeRayon(Cercle pRayon){return this.rayon == pRayon.rayon;}

    @Override
    public boolean equals(Object pRayon)
    {
        return pRayon instanceof Cercle
                && this.rayon == ((Cercle) pRayon).rayon
                && this.couleur.equals(((Cercle) pRayon).couleur);


    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
