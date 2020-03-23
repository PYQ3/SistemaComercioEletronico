import javax.swing.JOptionPane;

public class CalculadoraDeCompras {
	public static void main(String [] args) {
		String quantMaçaStr = JOptionPane.showInputDialog("Digite a quantidade de maças");
		double quantMaça = Double.parseDouble(quantMaçaStr);
		String quantMamãoStr = JOptionPane.showInputDialog("Digite a quantidade de mamões");
		double quantMamão = Double.parseDouble(quantMamãoStr);
		double mamão = quantMamão*3.50;
		double numeroReal = mamão+quantMaça;
		System.out.printf("Número: %.2f\n", numeroReal);
	}
}
