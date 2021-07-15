package core_java.oracle;

public class Statement8 {
	public static void main(String[] args) {
				for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							if (j == 3) {
								continue;
							}
							System.err.println(i + ":" + j);
						}
					}
	}
}
