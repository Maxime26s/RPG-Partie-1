public abstract class Sort{
    private int cout;
    private String nom;

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void lancerSort(Personnage personnage);
}

