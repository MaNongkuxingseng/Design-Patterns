import java.util.Scanner;

import FM01.Operate;
import FM01.OperateFactory;

public class App {
    public static void main(String[] args) throws Exception {
        int numA = 0;
        int numB = 0;
        System.out.println("请输入第一个操作数:");
        Scanner scanner = new Scanner(System.in);
        numA = scanner.nextInt();

        System.out.println("请输入操作符:");
        String operation = scanner.next();

        System.out.println("请输入第二个操作数:");
        numB = scanner.nextInt();
        scanner.close();
        OperateFactory operateFactory = new OperateFactory();
        Operate opt = operateFactory.GetReasult(operation);
        opt.setNumA(numA);
        opt.setNumB(numB);

        int a = opt.Caculate();
        System.out.println("结果是:"+a);


    }
}
