import java.util.*;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSetTest Tset = new TreeSetTest();
        Tset.go();
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        TreeSet<Book> tSet = new TreeSet<Book>();
        tSet.add(b1);
        tSet.add(b2);
        tSet.add(b3);

        System.out.println(tSet);
    }
}

class Book implements Comparable {
    String title;

    public Book(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Object b) {
        Book anotherBook = (Book) b;
        return title.compareTo(anotherBook.getTitle());
    }

    public String toString() {
        return this.getTitle();
    }
}