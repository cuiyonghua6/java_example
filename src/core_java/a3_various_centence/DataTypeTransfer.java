package core_java.a3_various_centence;

//低  ------------------------------------>  高
//byte,short,char—> int —> long—> float —> double
/*
1. 不能对boolean类型进行类型转换。

2. 不能把对象类型转换成不相关类的对象。

3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。

4. 转换过程中可能导致溢出或损失精度
 */
public class DataTypeTransfer {
    public static void main(String[] args){
        //自动类型转换
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);

        //强制类型转换
        int i3 = 123;
        byte b = (byte)i3;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
    }
}
