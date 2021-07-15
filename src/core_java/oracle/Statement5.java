package core_java.oracle;

public class Statement5 {
	public static void main(String[] args) {
				int sum = 0;// �����������ڼ������յĺ�
				for (int i = 1, j = 100; i <= 100 / 2; i++, j--) {
					sum += i + j;
				} 
				System.err.println("sum :" + sum);
	}
}
