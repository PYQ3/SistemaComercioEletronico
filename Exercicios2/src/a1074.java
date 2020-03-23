import java.util.Scanner;

public class a1074 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = Integer.parseInt(leitor.nextLine());
		for (int k=0; k<n; k++) {
			int numero = Integer.parseInt(leitor.nextLine());
			if (numero == 0) {
				System.out.printf("NULL");
			} else if (numero % 2 == 0 && numero > 0) {
				System.out.printf("EVEN POSITIVE");
			} else if (numero % 2 == 0 && numero < 0) {
				System.out.printf("EVEN NEGATIVE");
			} else if (numero > 0) {
				System.out.printf("ODD POSITIVE");
			} else {
				System.out.printf("ODD NEGATIVE");
			}
		}
		leitor.close();
	}
}
