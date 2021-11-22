public class Duck {
    int size;
    
    public Duck(int duckSize) {
        size = duckSize;
        System.out.println("Quack!");
        System.out.println("Personalized size = " + size);
    }
    
    public Duck() {
        size = 10;
        System.out.println("Quack!");
        System.out.println("fixed default size = " + size);
    }
    public void setSize(int newSize) {
        size = newSize;
    }
}
