import java.util.Scanner;

/**
 * Created by hnx on 2018/8/2.
 *
 * 把数字倒着输出
 *
 * 处理逻辑：不断对数字进行取摩
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============把数字倒着输出的程序已启动============");
        System.out.println("请输入你要倒着输出的数字");
        while (scanner.hasNext()){
            int value = scanner.nextInt();
            if (value == -1){
                System.out.println("============程序已退出！============");
                break;
            }
            reverseNumberMethod(value);
            System.out.println("请输入你要倒着输出的数字");
        }
    }
    public static void reverseNumberMethod(int value){
        while (true) {
            if (value <= 0){
                break;
            }
            int mod = value%10;
            System.out.print(mod);
            value = value/10;
        }
        System.out.println();
    }
}
