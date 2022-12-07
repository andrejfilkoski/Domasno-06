import java.util.ArrayList;
import java.util.Scanner;

public class Gradovi {

    ArrayList<String> imeNaGradovi = new ArrayList<String>();

    void DodadiGradovi(){
        String dodadiGrad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dodadi 5 gradovi:");

        for(int i = 0; i < 5; i++){
            dodadiGrad = scanner.next();
            imeNaGradovi.add(dodadiGrad);
        }
    }

    void PecatiGradovi(){
        System.out.println("Vnesenite gradovi se:");
        for(int i = 0; i < imeNaGradovi.size(); i++){
            System.out.println(imeNaGradovi.get(i));
        }
    }
}
