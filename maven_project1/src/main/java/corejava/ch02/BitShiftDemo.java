package corejava.ch02;

public class BitShiftDemo {
    public static void main(String[] args) {
        int a = 3, b;
        b = a << 1;          // b=6��a����
        printBits(a);
        printBits(b);
        a = a << 4;          // a=3*16=48
        printBits(a);
        a = -0xFFFF;        // a=-65535
        printBits(a);
        a >>= 1;             // a=-32768
        printBits(a);
        b = a;              // b=-32768
        a >>>= 24;         // ��a�����޷���������24λ��a=255
        printBits(a);
        a = b;              // a=-32768
        a >>>= 56;         // 56�ĵ�5λΪ24 (��56%32)�������14�еȼ�
        printBits(a);
        a <<= -126;        // -126 (����) �ĵ�5λΪ2�����൱�ڽ�a*4
        printBits(a);
    }

    static void printBits(int n) { // ��ӡn�Ķ�������ʽ�ķ��� (�����6��) 
        int mask = 0x80000000;       // �������ã����λ=1����31λ��Ϊ0
        int i = 1;                      // ѭ��������
        System.out.print(n + "\t�� ");
        while (i <= 32) {     // ѭ��32�� (int��ռ32λ)�������4��
            // n��mask��λ�룬����Ƿ�Ϊ0 (32λ��Ϊ0) ȡ����n�����λ
            // �����Ϊ0 (˵��n�����λΪ0)�����ӡ0������ (n�����λΪ1) ��ӡ1
            System.out.print((n & mask) == 0 ? "0" : "1");
            // ÿ4λ��ӡһ�������Էָ��������� (���һ�����Ų���ӡ) 
            System.out.print((i % 4 == 0) && (i != 32) ? "," : "");
            mask >>>= 1;         // �޸����� (��λ��1������)���Բ���n����һλ
            i++;                   // �޸�ѭ��������
        }
        System.out.println();  // ע����в���ѭ������
    }
}
