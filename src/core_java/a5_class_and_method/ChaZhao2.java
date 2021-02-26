package core_java.a5_class_and_method;

public class ChaZhao2
{
    public static void main(String[] args)
    {
        //定义了一个char型的数组a
        char[] a;
        //实例对象数组，长度为25
        a = new char[26];
        for (int i = 0; i < 26; i++)
        {
            //通过把A的ascii码和循环变量进行相加来转换各个字码的ascii码
            a[i] = (char)('A' + i);
            System.out.print(a[i]);
            if(a[i]=='Z')
            {
                System.out.println("");
            }
        }
    }
}
