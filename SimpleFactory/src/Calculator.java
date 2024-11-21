import java.util.Scanner;

public class Calculator {
    public int SimpleFactory() {
        int numA,numB;
        System.out.println("请输入第一个操作数:");
        Scanner scanner = new Scanner(System.in);
        numA = scanner.nextInt();
        System.out.println("请输入第二个操作数:");
        numB = scanner.nextInt();
        System.out.println("请输入操作符");
        String operate = scanner.next();
        scanner.close();

        Operation opt = new OperationFactory().CreatOperate(operate);
        opt.setNumberA(numA);
        opt.setNumberB(numB);
        int ret = opt.Calculate();

        return ret;
    }
    
}
