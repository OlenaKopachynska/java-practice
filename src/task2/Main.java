package task2;

public class Main {

    public static void main(String[] args) {

        Instrument[] instruments = {new Baraban(4), new Gitara(7), new Truba(3), new Baraban(5)};

        for (Instrument item: instruments
             ) {
            item.play();

        }
    }
}
