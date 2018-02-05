public class MagicienRouge extends Magicien{
    public MagicienRouge() {
        setNom("Magicien Rouge");
        setMagie(40);
        getSort()[0]=new Empoisonnement();
        getSort()[1]=new MortSubite();
    }
}
