package cn.oracle;

public class Statement5 {
	public static void main(String[] args) {
				int sum = 0;// 声明变量用于计算最终的和
				for (int i = 1, j = 100; i <= 100 / 2; i++, j--) {
					sum += i + j;
				} 
				System.err.println("sum :" + sum);
	}
}
