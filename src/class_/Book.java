package class_;

import java.util.Objects;

public class Book {
    private String name;
    private int coin;

    public Book(String name, int coin) {
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coin);
    }


    public static void main(String [] args){
        Book book1 = new Book("1",200);
        Book book2 = new Book("1",365);
        int hashCode1 = book1.hashCode();
        int hashCode2 = book2.hashCode();

        System.out.println("1 book " + hashCode1);
        System.out.println("2 book " + hashCode2);

        System.out.println("are book 1 equal book2 " + book1.equals(book2));
    }
}

