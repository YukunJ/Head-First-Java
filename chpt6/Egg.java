import java.util.*;

public class Egg {
    
    public static void main(String[] args) {
        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg s = new Egg();
        myList.add(s);
        System.out.println("Adding Egg s...");
        
        Egg b = new Egg();
        myList.add(b);
        System.out.println("Adding Egg b...");
        
        int theSize = myList.size();
        System.out.println("Current ArrayList size is " + theSize);
        
        boolean isIn = myList.contains(s);
        System.out.println("Does array contains s? " + isIn);
        
        int idx = myList.indexOf(b);
        System.out.println("The index of b is " + idx);
        
        boolean empty = myList.isEmpty();
        System.out.println("Is array empty now? " + empty);
        
        myList.remove(s);
        System.out.println("Current ArrayList size is " + myList.size());
    }
}
