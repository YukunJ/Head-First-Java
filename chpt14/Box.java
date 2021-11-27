import java.io.*;

public class Box implements Serializable {
    
    private int width;
    private int height;
    
    public void setWidth(int w) {
        width = w;
    }
    
    public void setHeight(int h) {
        height = h;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(10);
        myBox.setHeight(12);
        System.out.println("First storing the object ...");
        try {
            FileOutputStream fs = new FileOutputStream("box.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch(Exception ex) {ex.printStackTrace();}
        
        System.out.println("Now reading in the object back...");
        try {
            FileInputStream fs = new FileInputStream("box.ser");
            ObjectInputStream is = new ObjectInputStream(fs);
            Object o1 = is.readObject();
            Box loadedBox = (Box) o1;
            System.out.println("Loaded Box has width " + loadedBox.getWidth() + " and height " + loadedBox.getHeight());
            is.close();
        } catch(Exception ex) {ex.printStackTrace();}
    }
}
