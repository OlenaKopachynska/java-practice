package task1;

public class Magazine implements Printable{
    @Override
    public void print() {
        System.out.println("magazine");

    }

    static void printMagazines(Printable[] printable){

        for (Printable item:printable
             ) {
            if(item instanceof Magazine) {
                System.out.println(item);
            }
        }
    }
}
