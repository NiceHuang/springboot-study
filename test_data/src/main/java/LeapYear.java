import java.util.Scanner;

/**
 * Created by hnx on 2018/8/2.
 *
 * 判断年份是否为闰年
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============验证年份是否为闰年的程序已启动============");
        System.out.println("请输入你要验证的年份");
        while (scanner.hasNext()){
            int value = scanner.nextInt();
            if (value == -1){
                System.out.println("============程序已退出！============");
                break;
            }
            checkIsLeapYear(value);
            System.out.println("请输入你要验证的年份");

        }
    }
    public static void checkIsLeapYear(int value){

        if ((value%4 == 0 && value%100 != 0) || value%400 == 0){
            System.out.println(value + "是闰年");
        } else {
            System.out.println(value + "是平年");
        }

    }
}
