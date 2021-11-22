public class ObjectTest {
    public static void main(String[] args) {
        Dog a = new Dog();
        Cat c = new Cat();
        Object o = c;
        if (a.equals(c)) {
            System.out.println("a equals c");
        } else {
            System.out.println("a not equals c");
        }
        
        System.out.println("c's hashcode is " + c.hashCode());
        
        System.out.println("c's class is " + c.getClass());
        
        System.out.println("c's string is " + c.toString());
        
        System.out.println("is o an instance of Cat? " + (o instanceof Cat));
    }
}

