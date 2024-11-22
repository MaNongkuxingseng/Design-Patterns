public class OperationFactory {
    public Operation opt;
public Operation CreatOperate(String operate) {
    switch (operate) {
        case "+":
            opt = new OperationAdd();
            break;
        case "-":
            opt = new OperationSub();
            break;
        case "/":
            opt = new OperationDiv();
            break;
        default:
            break;
    }
    return opt;
    
}
}
