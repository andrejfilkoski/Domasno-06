import java.util.ArrayList;
import java.util.Scanner;

public class Fikt {

    ArrayList<String> smerovi = new ArrayList<String>();

    void VnesiSmerovi(){

        Scanner scanner = new Scanner(System.in);

        smerovi.add("INKI");
        smerovi.add("IKT");
        System.out.println("Vnesi tret smer");

        smerovi.add(scanner.next());
    }

    void PecatiSmerovi(){
        System.out.println("Smerovite na FIKT se");
        for (int i = 0; i < smerovi.size(); i++){
            System.out.println(smerovi.get(i));
        }
    }
}
