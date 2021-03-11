package task2;

public class Gitara implements Instrument{

    private int stringsNum;

    public Gitara(int stringsNum) {
        this.stringsNum = stringsNum;
    }

    public int getStringsNum() {
        return stringsNum;
    }

    public void setStringsNum(int stringsNum) {
        this.stringsNum = stringsNum;
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "stringsNum=" + stringsNum +
                '}';
    }

    @Override
    public void play() {
        System.out.println("грає гітара " + "з " + this.stringsNum + " струнами");

    }
}
