import java.util.Scanner;

public class a1165 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = Integer.parseInt(leitor.nextLine());
		for (int k=0; k<n; k++) {
			int proxNumero = Integer.parseInt(leitor.nextLine());
			boolean ehPrimo = true;
			for (int j=2; j<proxNumero; j++) {
				if (proxNumero %j == 0) {
					ehPrimo=false;
					break;
				}
			}
			if (ehPrimo == true) {
				System.out.println(proxNumero+" eh primo");
			} else {
				System.out.println(proxNumero+" n eh primo");
			}
		}
		leitor.close();
	}
}
