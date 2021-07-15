package cn.oracle;

public class Statement4 {
	public static void main(String[] args) {
				int sum = 0;// 定义一个变量用于计算最终的和
				int i = 1;// 定义一个迭代变量
				do {
					sum += i;
					i++;
				} while (i <= 100);
				System.err.println("sum：" + sum);// 5050
	}
}
