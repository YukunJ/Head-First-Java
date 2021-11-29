public class Hippo2 extends Animal2 {
    
    public Hippo2(String name) {
        super(name);
    }
    
    public static void main(String[] args) {
        Hippo2 h  = new Hippo2("Buffy");
        System.out.println("My name is " + h.getName());
    }
}
