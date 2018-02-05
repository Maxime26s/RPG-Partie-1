public class PicDeGlace extends Sort{
    public PicDeGlace() {
        setCout(5);
        setNom("Pic de Glace");
    }

    public void lancerSort(Personnage personnage){
        personnage.setPv(personnage.getPv()-(7-personnage.getDef()));
        System.out.print(7-personnage.getDef());
    }
}
