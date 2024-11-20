import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 简单工厂模式，以运算器为例，通过对不同运算符的支持生成不同的对象。实现一个计算器控制台程序，要求输入两个数和运算符号。
        int ret = Caculate();
        System.out.println("结果是:"+ret);

    }
    // 先看一般的实现方法
    public static int Caculate() {
        int numA,numB;
        System.out.println("请输入第一个操作数:");
        Scanner scanner = new Scanner(System.in);
        numA = scanner.nextInt();
        System.out.println("请输入第二个操作数:");
        numB = scanner.nextInt();

        System.out.println("请输入操作符");
        String operate = scanner.next();
        scanner.close();
        int ret;
        switch (operate) {
            case "+":
                ret = numA + numB;
                break;
            case "-":
                ret = numA - numB;
                break;
            default:
                ret = 0;
                break;
        }
        return ret;
    }
}
