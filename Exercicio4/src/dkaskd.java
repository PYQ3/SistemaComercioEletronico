
public class dkaskd {
	public static void main(String[] args) {
		int menosQueSete = 0;
		for (int k = 0; k < listaNotas.length; k++) {
			if (listaNotas[k] < 7.0) {
				menosQueSete++;	
			}
		System.out.println("Quantidade de alunos que tiraram menos que 7 é de: "+menosQueSete);
		
		}
	}
}
