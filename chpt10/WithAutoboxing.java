import java.util.*;

public class WithAutoboxing {
    
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(3);
        int num = listOfNumbers.get(0);
        System.out.println("autoboxing gives out " + num);
    }
}
