package FM02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
        OperateFactory operateFactory = new OperateFactory(operation);
        Operate opt = operateFactory.getOperate();
        opt.setNumA(numA);
        opt.setNumB(numB);

        int a = opt.Cal();
        System.out.println("结果是:"+a);
    }
}
