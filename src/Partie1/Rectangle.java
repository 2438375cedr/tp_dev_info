package Partie1;

public class Rectangle {


    public static final int DIM_MIN = 2;
    public static final int DIM_MAX = 20;
    public static final int LARG_DEFAUT = 5;
    public static final int HAUT_DEFAUT = 3;
    public static final String COUL_DEFAUT = "blanc";
    public static final int LONGUEUR_COUL_MIN = 4;
    public static final int LONGUEUR_COUL_MAX = 15;

    private int largeur;
    private int hauteur;
    private String couleur;

    Rectangle()
    {
        this(LARG_DEFAUT, HAUT_DEFAUT, COUL_DEFAUT);
    }

    Rectangle(int pLarg, int pHaut, String pCoul)
    {
        boolean ok = setLargeur(pLarg) && setHauteur(pHaut)
                && setCouleur(pCoul);
        if (!ok)
        {
            largeur = LARG_DEFAUT;
            hauteur = HAUT_DEFAUT;
            couleur = COUL_DEFAUT;
        }
    }

    public int getLargeur()
    {
        return largeur;
    }

    public int getHauteur()
    {
        return hauteur;
    }

    public String getCouleur()
    {
        return couleur;
    }

    public boolean setLargeur(int pLarg)
    {
        boolean ok = validerLargeur(pLarg);
        if (ok)
            largeur = pLarg;
        return ok;
    }

    public static boolean validerLargeur(int pLarg)
    {
        return (pLarg >= DIM_MIN && pLarg <= DIM_MAX);
    }

    public boolean setHauteur(int pHaut)
    {
        boolean ok = validerHauteur(pHaut);
        if (ok)
            hauteur = pHaut;
        return ok;
    }

    public static boolean validerHauteur(int pHaut)
    {
        return (pHaut >= DIM_MIN && pHaut <= DIM_MAX);
    }

    public boolean setCouleur(String pCoul)
    {
        boolean ok = validerCouleur(pCoul);
        if (ok)
            couleur = pCoul;
        return ok;
    }

    public static boolean validerCouleur(String pCoul)
    {
        return (pCoul != null && pCoul.length() >= LONGUEUR_COUL_MIN
                && pCoul.length() <= LONGUEUR_COUL_MAX);
    }

    public int aire()
    {
        return largeur * hauteur;
    }

    public int perimetre()
    {
        return (largeur + hauteur) * 2;
    }

    public boolean memeLargeur(Rectangle parRec)
    {
        return this.largeur == parRec.largeur;
    }

    public boolean memeHauteur(Rectangle parRec)
    {
        return this.hauteur == parRec.hauteur;
    }

    @Override
    public boolean equals(Object pRec)
    {
        return pRec instanceof Rectangle
                && this.largeur == ((Rectangle) pRec).largeur
                && this.hauteur == ((Rectangle) pRec).hauteur
                && this.couleur.equals(((Rectangle) pRec).couleur);

    }

    @Override
    public String toString()
    {
        return "La largeur du rectangle est: " + getLargeur()
                + "\nLa hauteur du rectangle est: " + getHauteur()
                + "\nLa couleur du rectangle est: " + getCouleur();
    }


    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(3,5,"vert");
        System.out.println(rectangle);


    }
}
