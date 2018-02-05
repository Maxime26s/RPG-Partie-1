public class Magicien extends Personnage{
    private int magie;
    private Sort[] sort = new Sort[2];

    public Magicien() {
        setDef(1);
        setPv(60);
    }

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        this.magie = magie;
    }

    public Sort[] getSort() {
        return sort;
    }

    public void setSort(Sort[] sort) {
        this.sort = sort;
    }

    public void attaque(Personnage personnage){
        int rng=(int)(Math.random()*2);
        if(getSort()[rng].getCout()<=magie) {
            System.out.println("Le "+getNom()+" attaque!");
            System.out.println("Le "+getNom()+" utilise "+getSort()[rng].getNom()+", ce qui lui coûte "+getSort()[rng].getCout()+" points de magie.");
            magie=magie-getSort()[rng].getCout();
            System.out.println("Il lui reste "+magie+" points de magie.");
            System.out.print("Le "+personnage.getNom()+" perd ");
            sort[rng].lancerSort(personnage);
            System.out.println(" points de vie. Il lui en reste "+personnage.getPv()+".");
        }
        else{
            System.out.println("Le "+getNom()+" n'a pas assez de magie pour "+getSort()[rng].getNom()+"!");
        }
    }
}
