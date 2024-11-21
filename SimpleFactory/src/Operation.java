
public abstract class Operation {
private int numberA;
private int numberB;
public Operation() {

}

public Operation(int numberA, int numberB) {
    this.numberA = numberA;
    this.numberB = numberB;
}

abstract int Calculate();

public int getNumberA() {
    return numberA;
}

public void setNumberA(int numberA) {
    this.numberA = numberA;
}

public int getNumberB() {
    return numberB;
}

public void setNumberB(int numberB) {
    this.numberB = numberB;
}
}
