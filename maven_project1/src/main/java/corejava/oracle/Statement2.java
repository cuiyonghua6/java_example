package cn.oracle;

public class Statement2 {
	public static void main(String[] args) {
				int sum = 0;// 定义一个变量用于计算最终的和
				int i = 1;// 定义一个迭代变量
				while (i <= 100) {
					sum += i;
					i++;// 实现迭代变量的递增
				}
				System.err.println("sum:" + sum);//5050
	}
}
