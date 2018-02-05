import java.util.Scanner;

/**
 * Created by SimMa1733207 on 2018-01-29.
 */
public class Simulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choix=0;
        Personnage personnage1 = null;
        Personnage personnage2 = null;
        System.out.println("Bienvenue dans RPG Simulator!");
        while(choix<1||choix>4) {
            System.out.println("Veuillez choisir le premier personnage");
            System.out.println(" 1- Barbare");
            System.out.println(" 2- Paladin");
            System.out.println(" 3- Magicien noir");
            System.out.println(" 4- Magicien rouge");
            System.out.println("Votre choix : ");
            choix = sc.nextInt();
            switch(choix){
                case 1:
                    personnage1 = new Barbare();
                    break;
                case 2:
                    personnage1 = new Paladin();
                    break;
                case 3:
                    personnage1 = new MagicienNoir();
                    break;
                case 4:
                    personnage1 = new MagicienRouge();
                    break;
                default:
                    System.out.println("ERREUR: Entrer un numero valide");
                    break;
            }
        }
        choix=0;
        while(choix<1||choix>4) {
            System.out.println("Veuillez choisir le deuxième personnage");
            System.out.println(" 1- Barbare");
            System.out.println(" 2- Paladin");
            System.out.println(" 3- Magicien noir");
            System.out.println(" 4- Magicien rouge");
            System.out.println("Votre choix : ");
            choix = sc.nextInt();
            switch(choix){
                case 1:
                    personnage2 = new Barbare();
                    break;
                case 2:
                    personnage2 = new Paladin();
                    break;
                case 3:
                    personnage2 = new MagicienNoir();
                    break;
                case 4:
                    personnage2 = new MagicienRouge();
                    break;
                default:
                    System.out.println("ERREUR: Entrer un numero valide");
                    break;
            }
        }
        choix=0;
        while(true) {
            System.out.println("");
            if(personnage1.getPv()>0){
                personnage1.attaque(personnage2);
            }
            else{
                System.out.println("Le "+personnage1.getNom()+" est mort, le "+personnage2.getNom()+" a gagné!");
                System.exit(0);
            }
            System.out.println("");
            if(personnage2.getPv()>0){
                personnage2.attaque(personnage1);
            }
            else{
                System.out.println("Le "+personnage2.getNom()+" est mort, le "+personnage1.getNom()+" a gagné!");
                System.exit(0);
            }
            if (personnage1 instanceof Magicien&&personnage2 instanceof Magicien&&((Magicien) personnage1).getMagie()<2&&((Magicien) personnage2).getMagie()<2){
                System.out.println("Les deux magiciens n'ont plus de magie. C'est un match nul!");
                System.exit(0);
            }
        }
    }
}