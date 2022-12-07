import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Fakultet> fakulteti = new ArrayList<Fakultet>();
        Fakultet fikt = new Fakultet("Fikt", 2, 200);
        Fakultet tfb = new Fakultet("Tfb", 10, 200);
        Fakultet mfb = new Fakultet("mfb", 5, 100);
        Fakultet finki = new Fakultet("Finki", 6, 1040);
        Fakultet feit = new Fakultet("feit", 3, 450);
        fakulteti.add(fikt);
        fakulteti.add(tfb);
        fakulteti.add(mfb);
        fakulteti.add(finki);
        fakulteti.add(feit);


        //Pecatenje
        for (Fakultet f : fakulteti){
            f.PecatiObj();
        }

    }
}
