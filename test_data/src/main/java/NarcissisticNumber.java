/**
 * Created by hnx on 2018/8/3.
 *
 * 找出100-1000的水仙花数
 * 水仙花数：指一个3位数，它的每个位上的数字的3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
 *
 */
public class NarcissisticNumber {

    public static void main(String[] args) {
        System.out.println("所有的水仙花数如下：");
        getAllNarcissisticNumber();

    }

    public static void getAllNarcissisticNumber(){
        for(int i = 100; i < 1000; i++){
            int a = i/100;
            int b = (i%100)/10;
            int c = (i%100)%10;
            int tmp = a * a * a + b * b * b + c * c * c;
            if (tmp == i){
               System.out.print(tmp + "\t");
            }
        }
//        for (int sr = 100; sr < 1000; sr++) {
//            int a = sr % 10;
//            int b = sr / 10 % 10;
//            int c = sr / 100 % 10;
//            if (a * a * a + b * b * b + c * c * c == sr) {
//                System.out.print(sr + "\t");
//            }
//        }
    }
}
