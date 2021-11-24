public class TestFormats {
    
    public static void main (String[] args) {
        String s = String.format("%, d", 1000000000);
        System.out.println(s);
        s = String.format("I have %,.2f bugs to fix.", 475364.06253);
        System.out.println(s);
    }
}
