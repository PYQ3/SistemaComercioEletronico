import javax.swing.JOptionPane;

public class OiMundo {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String idadeString = JOptionPane.showInputDialog("Digite sua idade");
		int idade = Integer.parseInt(idadeString);
		String alturaStr = JOptionPane.showInputDialog("Digite sua altura");
		double altura = Double.parseDouble(alturaStr);
		System.out.println("Oi" +nome);
		System.out.println("Idade:"+idade);
		
		
	}

}
