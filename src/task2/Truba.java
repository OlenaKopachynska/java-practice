package task2;

public class Truba implements Instrument{

    private int diametr;

    public Truba(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Truba{" +
                "diametr=" + diametr +
                '}';
    }

    @Override
    public void play() {

        System.out.println("грає труба" + " з " + this.diametr + " діаметром");


    }
}
