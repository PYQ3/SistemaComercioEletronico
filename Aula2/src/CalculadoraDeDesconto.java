import javax.swing.JOptionPane;

public class CalculadoraDeDesconto {
	public static void main(String [] args) {
		String valorPagoStr = JOptionPane.showInputDialog("Digite o valor do produto","digite e reais");
		double valorPago = Double.parseDouble(valorPagoStr);
		String valorDescontoStr = JOptionPane.showInputDialog("Digite o valor do desconto a ser inserido");
		double valorDesconto = Double.parseDouble(valorDescontoStr);
		double valorFinal = valorPago - valorPago*valorDesconto/100;
		JOptionPane.showMessageDialog(null, "O valor final é "+valorFinal);
		
	}
}
