import javax.swing.JOptionPane;

public class CalculadoraDeCompras {
	public static void main(String [] args) {
		String quantMa�aStr = JOptionPane.showInputDialog("Digite a quantidade de ma�as");
		double quantMa�a = Double.parseDouble(quantMa�aStr);
		String quantMam�oStr = JOptionPane.showInputDialog("Digite a quantidade de mam�es");
		double quantMam�o = Double.parseDouble(quantMam�oStr);
		double mam�o = quantMam�o*3.50;
		double numeroReal = mam�o+quantMa�a;
		System.out.printf("N�mero: %.2f\n", numeroReal);
	}
}
