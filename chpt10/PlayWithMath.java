public class PlayWithMath {
    
    public static void main(String[] args) {
        double r1 = Math.random();
        int r2 = (int) (Math.random() * 5);
        System.out.println("Get a random float in [0, 1) -> " + r1);
        System.out.println("Get a random int in [0, 5) -> " + r2);
        System.out.println("Get abs of -240 -> " + Math.abs(-240));
        System.out.println("Get abs of 240.45 -> " + Math.abs(240.45));
        System.out.println("Get round of -24.8f -> " + Math.round(-24.8f));
        System.out.println("Get round of 24.45f -> " + Math.round(24.45f));
        System.out.println("Get min of (24, 240) -> " + Math.min(24, 240));
        System.out.println("Get min of (90876.5, 90876.6) -> " + Math.min(90876.5, 90876.6));
        System.out.println("Get max of (24, 240) -> " + Math.max(24, 240));
        System.out.println("Get max of (90876.5, 90876.6) -> " + Math.max(90876.5, 90876.6));
        
    }
}
