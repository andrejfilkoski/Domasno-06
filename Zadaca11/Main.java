import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        ArrayList<String> niza1 = new ArrayList<String>();
        ArrayList<String> niza2 = new ArrayList<String>();

        niza1.add("a");
        niza1.add("b");
        niza1.add("c");
        niza1.add("d");

        niza2.add("a");
        niza2.add("e");
        niza2.add("f");

        System.out.println(presek(niza1, niza2));
    }

    private static ArrayList<String> presek(ArrayList<String> niza1, ArrayList<String> niza2){
        niza1.retainAll(niza2);

        return  niza1;
    }
}
