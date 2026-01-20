import java.util.Scanner;

public class LesConditions {
    public static void main(String [] args){
        //  condition if else
        int money=2000;
        if(money==2000) {
            System.out.println("les deux valeurs sont les memes");
        }
        else{
            System.out.println("les deux valeurs ne sont pas les memes");
        }
        // condition switch
        int choix;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi une valeur");

        choix = scanner.nextInt();
        switch(choix){
            case 1:
                System.out.println("Bonjour");
                break;

            case 2:
                System.out.println("Hello");
                break;

            case 3:
                System.out.println("Hello mbarkout");
                break;

            default: // default est executé quand le choix n'est pas dans la liste définie
                System.out.println("Choix incorrect");
                break;
        }


    }
}
