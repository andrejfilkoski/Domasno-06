import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Drzavi {

    ArrayList<String> imeNaDrzavi = new ArrayList<String>();

    void DodadiDrzavi(){
        String dodadiDrzava;
        int brojNaDrzavi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Broj na drzavi: ");
        brojNaDrzavi = scanner.nextInt();

        for(int i = 0; i < brojNaDrzavi; i++){
            dodadiDrzava = scanner.next();
            imeNaDrzavi.add(dodadiDrzava);
        }
    }

    private void DopolnitelniDrzavi(int brojNaDrzavi){
        String dodadiDrzava;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dodadete uste 2 drzavi");
        for(int i = 0; i < brojNaDrzavi; i++){
            dodadiDrzava = scanner.next();
            imeNaDrzavi.add(dodadiDrzava);
        }

    }
    void PecatiDrzavi(){
        System.out.println("Dodadovte " + imeNaDrzavi.size() + " drzavi");

        if(imeNaDrzavi.size() == 3){
            DopolnitelniDrzavi(2);
        }
        System.out.println("Drzavite koi gi vnesovte se:");

        for (int i = 0; i < imeNaDrzavi.size(); i++){
            System.out.println(imeNaDrzavi.get(i));
        }
    }

}
