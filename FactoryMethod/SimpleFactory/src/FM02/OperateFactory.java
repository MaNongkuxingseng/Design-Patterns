package FM02;

public class OperateFactory {
    private Operate operate;
    public Operate getOperate() {
        return operate;
    }
    public OperateFactory(String operation){
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
    }
}
