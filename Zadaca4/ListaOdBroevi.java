import java.util.ArrayList;
import java.util.Scanner;

public class ListaOdBroevi {

    ArrayList<Integer> broevi = new ArrayList<Integer>();

    void VnesNaBroevi(){
        int broj;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi 5 broevi");

        for (int i = 0; i < 5; i++){
            broj = scanner.nextInt();
            broevi.add(broj);
        }
    }

    void Sortiraj(){
        int pomalo;
        for (int i = 0; i < broevi.size(); i++){
            for (int j = 0; j < broevi.size(); j ++){

                if(broevi.get(i) < broevi.get(j)){
                    pomalo = broevi.get(i);
                    broevi.set(i, broevi.get(j));
                    broevi.set(j, pomalo);
                }
            }
        }
    }

    void Pecati(){
        System.out.println("Sortirana niza:");
        for (int i = 0; i < broevi.size(); i++){
            System.out.println(broevi.get(i));
        }
    }
}
