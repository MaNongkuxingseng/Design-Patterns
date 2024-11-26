package FM02;

public abstract class Operate implements Caculate{
    private int numA;
    private int numB;
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
