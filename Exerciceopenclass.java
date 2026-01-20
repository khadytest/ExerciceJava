public class Exerciceopenclass {
    public static void main(String[] args) {
        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;

        // Etape 1 : créez une variable daysInWeek avec une valeur de 7
              int dayInWeek=7;
        // Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci
              firstDay +=7;
        // Etape 3 : créez une constante numérique nommée STARTINGDAY avec la nouvelle valeur de la variable firstDay
          final int STARTINGDAY=10;
        // Affiche le résultat
       System.out.println("There are " + dayInWeek+ " days in a week.\nYour starting day in the month is: " + STARTINGDAY);
    }
}
