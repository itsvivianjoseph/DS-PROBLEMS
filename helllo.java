//ETHUKUNAE THERLA
// ENIMATU ACHU OLUNGA CLASS NAME DECLARE PANDRA SOMBERI
import java.util.*;
public class helllo {
    public static void main(String[] args) {
        ArrayList<Integer> ds= new ArrayList<>();
        ds.add(10);
        ds.add(9);
        ds.add(5);
        HashSet<Integer> hs = new HashSet<>(ds);
        for(int i : hs){
            System.out.println(i);
        }
    }
}
