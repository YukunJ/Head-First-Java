import java.util.*;

public class TestDates {
    
    public static void main(String[] args) {
        Date today = new Date();
        
        String s = String.format("%tc", today);
        System.out.println(s);
        
        s = String.format("%tr", today);
        System.out.println(s);
        
        s = String.format("%tA, %tB, %td", today, today, today);
        System.out.println(s);
        
        s = String.format("%tA, %<tb, %<td", today);
        System.out.println(s);
    }
}
