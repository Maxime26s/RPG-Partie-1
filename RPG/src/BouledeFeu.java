public class BouledeFeu extends Sort{
    public BouledeFeu() {
        setCout(5);
        setNom("Boule de Feu");
    }

    public void lancerSort(Personnage personnage){
        personnage.setPv(personnage.getPv()-5);
        System.out.print(5);
    }
}
