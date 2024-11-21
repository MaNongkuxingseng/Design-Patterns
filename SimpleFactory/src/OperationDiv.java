// 简单工厂运算类-除法
public class OperationDiv extends Operation{
    @Override
    public int Calculate() {
        if (this.getNumberB() == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return this.getNumberA()/this.getNumberB();
    }
}