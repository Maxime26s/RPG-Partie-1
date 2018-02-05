public class MagicienNoir extends Magicien{
    public MagicienNoir() {
        setNom("Magicien Noir");
        setMagie(50);
        getSort()[0]=new BouledeFeu();
        getSort()[1]=new PicDeGlace();
    }
}
