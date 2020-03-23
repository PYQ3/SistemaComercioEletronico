import javax.swing.JOptionPane;

public class a1001 {
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Digite o primeiro número");
		String b = JOptionPane.showInputDialog("Digite o segundo número");
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int resultado = aa+bb;
		System.out.println("X="+ resultado);
	}
	

}
