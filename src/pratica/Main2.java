package pratica;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        /*
        System.out.println("------------------ES1----------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero N che indica quanti elementi vuoi inserire");
        int N = sc.nextInt();
        List<Arrays[]> array=  new ArrayList<>();
        System.out.println("Scrivi le " + N + " parole che vuoi inserire");
        Set<String> parole= new HashSet<>();
        for (int i = 0; i  < N ; i++) {
        String parola = sc.next();
        parole.add(parola);
            System.out.println(parole);
        }
        System.out.println(parole);
        sc.close();
*/

        System.out.println("------------------ES2----------------------");

        Scanner sc2 = new Scanner(System.in);
        List<Integer> listNumeri= new ArrayList<>();
        System.out.println("Scrivi quanti numeri casuali vuoi ottenere");
        int N2 = sc2.nextInt();
          Random casuale = new Random() ;
        for (int i = 0; i < N2 ; i++) {
        int randomNumber = casuale.nextInt(100);
        listNumeri.add(randomNumber);

        }
        System.out.println(listNumeri);

        sc2.close();


    }
}
/*
* randomizza gli indici della prima lista
*
*
*
*
* */