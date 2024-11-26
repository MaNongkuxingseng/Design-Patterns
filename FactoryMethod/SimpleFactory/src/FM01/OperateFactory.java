package FM01;

public class OperateFactory {
    private Operate operate;

    public Operate GetReasult(String operation){
        switch (operation) {
            case "+":
                this.operate = new OperateAdd();
                break;
            case "-":
                this.operate = new OperateSub();
                break;
            default:
                break;
        }

        return this.operate;
    }
}
