package FM01;

public abstract class Operate {
    private int numA;
    private int numB;
    public Operate() {
    }
    public Operate(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }
    public abstract int Caculate();
    public int getNumA() {
        return numA;
    }
    public int getNumB() {
        return numB;
    }
    public void setNumA(int numA) {
        this.numA = numA;
    }
    public void setNumB(int numB) {
        this.numB = numB;
    }
    
}
