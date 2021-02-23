package useful_tools;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 重定向输出流实现程序日志
 * System类中的out成员变量是Java的标准输出流，程序常用它来输出调试信息。
 *
 * 博客地址：https://blog.csdn.net/cui_yonghua/article/details/91870673
 */
public class LogOut {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;//保存原输出流
            //创建文件输出流
            PrintStream ps = new PrintStream("log.txt");
            System.setOut(ps);//设置使用新的输出流
            int age =18;
            System.out.println("年龄变量成功定义，初始值为18");
            String sex = "女";
            System.out.println("性别变量成功定义，初始值为女");
            String info = "是这个"+sex+"孩子，应该有"+age+"岁了。";
            System.out.println("整合两个变量为info字符串变量，其结果是："+info);
            System.setOut(out);//恢复原有输出流
            System.out.println("程序运行完毕，请查看日志文件。");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

