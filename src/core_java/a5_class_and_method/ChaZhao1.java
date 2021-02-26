package core_java.a5_class_and_method;

public class ChaZhao1 {
	public static void main(String[] args) {
    	int[] a = {12, 3, 19, 2, 10, 13, 9};
    	//Ҫ���ҵ�Ԫ��2
    	int n = 2;
    	for(int i = 0; i < a.length; i++)
    	{
			//�������ĵ�i��Ԫ�غ�n��ȵĻ�
    		if (a[i] == n)
    		{
    			System.out.println("Ҫ���ҵ�Ԫ��������ĵ�" + (i + 1) + "��λ��");
    		}
    	}
  	}
}
