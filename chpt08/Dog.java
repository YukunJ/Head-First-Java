public class Dog extends Animal implements Pet{
    
    int size;
    String breed;
    String name;
    
    @Override
    public void bark() {
        System.out.println("Ruff! Ruff!");
    }
    
    @Override
    public void beFriendly() {
        System.out.println("friendly doggy!");
    }
    
    @Override
    public void play() {
        System.out.println("I am playing!");
    }
}
