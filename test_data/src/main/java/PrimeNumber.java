import java.util.Scanner;

/**
 * Created by hnx on 2018/8/2.
 *
 * 判断一个数是否为质数
 *
 * 处理逻辑：把大于1小于自己的所有数字都取摩进行判断
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============验证是否为素数的程序已启动============");
        System.out.println("请输入你要验证的数字");
        while (scanner.hasNext()){
            int value = scanner.nextInt();
            if (value == -1){
                System.out.println("============程序已退出！============");
                break;
            }
            checkIsPrimeNumber(value);
            System.out.println("请输入你要验证的数字");
        }
    }

    public static void checkIsPrimeNumber(int value){

        boolean flag = true;
        if(value <= 1){
            System.out.println(value + "不合法");
            return;
        }
        for(int i = 2; i < value; i++){
            if (value%i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(value + "是素数");
            return;
        }
        System.out.println(value + "不是素数");
    }
}
