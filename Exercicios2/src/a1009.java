import java.util.Scanner;
import javax.swing.JOptionPane;


public class a1009 {
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		double salario = Double.parseDouble(leitor.nextLine());
		double vendas = Double.parseDouble(leitor.nextLine());
		double total = ((vendas*15)/100)+salario;
		System.out.printf("TOTAL = %.2f", total);
		leitor.close();
		
		
	}
}
