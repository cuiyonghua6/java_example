package core_java.oracle;

public class Statement2 {
	public static void main(String[] args) {
				int sum = 0;// ����һ���������ڼ������յĺ�
				int i = 1;// ����һ����������
				while (i <= 100) {
					sum += i;
					i++;// ʵ�ֵ��������ĵ���
				}
				System.err.println("sum:" + sum);//5050
	}
}
