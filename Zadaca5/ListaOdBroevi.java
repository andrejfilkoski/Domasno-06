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

    void Pecati(){
        System.out.print("Vtoriot element od niza e " + broevi.get(1));
    }
}
