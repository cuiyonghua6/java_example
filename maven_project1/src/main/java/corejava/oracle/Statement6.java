package cn.oracle;

public class Statement6 {
	public static void main(String[] args) {
				for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							System.err.println(i + ":" + j);
							break;
						}
					}
	}
}
