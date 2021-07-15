package core_java.oracle;

public class Statement4 {
    public static void main(String[] args) {
        int sum = 0;// ����һ���������ڼ������յĺ�
        int i = 1;// ����һ����������
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.err.println("sum的和" + sum);// 5050
        System.out.println("hel");
		System.err.println();
    }
}
