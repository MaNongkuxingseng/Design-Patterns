// 简单工厂运算类-减法
public class OperationSub extends Operation{

    @Override
    int Calculate() {
        return this.getNumberA() - this.getNumberB();
    }

}
