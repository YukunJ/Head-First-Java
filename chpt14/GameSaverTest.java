import java.io.*;

public class GameSaverTest {
    
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});
        
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (Exception ex) {ex.printStackTrace();}
        
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            one = (GameCharacter) is.readObject();
            two = (GameCharacter) is.readObject();
            three = (GameCharacter) is.readObject();
            is.close();
            System.out.println("Reloaded one's type is " + one.getType());
            System.out.println("Reloaded two's type is " + two.getType());
            System.out.println("Reloaded three's type is " + three.getType());
        } catch (Exception ex) {ex.printStackTrace();}
    }
}
