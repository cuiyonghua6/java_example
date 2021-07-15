package core_java.a1_basic_test;

import java.util.Scanner;

//每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果：
public class TestScanner {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
}
