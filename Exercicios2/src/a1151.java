import java.util.Scanner;

public class a1151 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = Integer.parseInt(leitor.nextLine());
		if (n==0) {
			System.out.println("0");
		} else if (n==1) {
			System.out.println("0 1");
		} else {
			int penultimo = 0;
			int ultimo = 1;
			System.out.printf("0 1 ");
			for (int k=2; k<n; k++) {
				int atual = penultimo+ultimo;
				if (k==(n-1)) {
					System.out.printf(atual+"\n");
				} else {
					System.out.printf(atual+" ");
				}
				penultimo = ultimo;
				ultimo = atual;
			}
		}
		leitor.close();
	}
}
