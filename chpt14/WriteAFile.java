import java.io.*;

class WriteAFile {
    
    public static void main(String[] args) {
        
        try {
            File f = new File("MyText.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("What's 2+2? / 4\n");
            writer.write("What's 22+20? / 42");
            writer.close();
        } catch (Exception ex) {ex.printStackTrace();}
    }
}
