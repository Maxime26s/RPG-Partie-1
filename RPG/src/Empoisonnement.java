public class Empoisonnement extends Sort{
    private int nbCast=0;
    public Empoisonnement() {
        setCout(2);
        setNom("Empoisonnement");
    }

    public void lancerSort(Personnage personnage){
        nbCast++;
        personnage.setPv(personnage.getPv()-(nbCast*2));
        System.out.print(nbCast*2);
    }
}
