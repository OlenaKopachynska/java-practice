package task1;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Book book2 = new Book();
        Magazine magazine = new Magazine();


        Printable[] printable = {book, magazine, book2};

        for ( Printable i:printable
             ) {
            i.print();
        }

        //task1.Magazine.printMagazines(printable);
        //task1.Book.printBooks(printable);




    }
}
