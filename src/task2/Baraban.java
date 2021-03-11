package task2;

public class Baraban implements Instrument{

    private int size;

    public Baraban(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Baraban{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("грає барабан" + " з розміром " + this.size);

    }
}
