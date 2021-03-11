package task1;

public class Book implements Printable {

    @Override
    public void print() {
        System.out.println("book");

    }

    static void printBooks(Printable[] printable){

        for (Printable item:printable
        ) {
            if(item instanceof Book) {
                System.out.println(item);
            }

        }

    }
}
