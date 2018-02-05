public class MortSubite extends Sort{
    public MortSubite() {
        setCout(5);
        setNom("Mort Subite");
    }

    public void lancerSort(Personnage personnage){
        if((int)(Math.random()*10)==5){
            System.out.print(personnage.getPv());
            personnage.setPv(personnage.getPv()-personnage.getPv());
        }
        else{
            System.out.print(0);
        }
    }
}
