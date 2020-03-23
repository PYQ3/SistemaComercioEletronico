import javax.swing.JOptionPane;

public class CalculadoraDeMedia {
	public static void main(String [] args) {
		String primeiroValorStr = JOptionPane.showInputDialog("Digite o primeiro valor");
		double primeiroValor = Double.parseDouble(primeiroValorStr);
		String segundoValorStr = JOptionPane.showInputDialog("Digite o primeiro valor");
		double segundoValor = Double.parseDouble(segundoValorStr);
		String terceiroValorStr = JOptionPane.showInputDialog("Digite o primeiro valor");
		double terceiroValor = Double.parseDouble(terceiroValorStr);
		double media = (primeiroValor+segundoValor+terceiroValor)/3;
		JOptionPane.showMessageDialog(null, "A média aritmética é: "+media);
	}
}
