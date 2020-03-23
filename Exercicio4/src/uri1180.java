import java.util.Scanner;

public class uri1180 {
	public static void main(String[] args) {
	       Scanner leitor = new Scanner(System.in);
	       System.out.println("Digite o quantidade de números do vetor:");
	       int tamanhoVetor = Integer.parseInt(leitor.nextLine());
	       int menor=1001;
	       int posicaoDoMenor = 1;
	       double vetor[] = new double[tamanhoVetor];
	       System.out.println("Quais são os números?");
	       String numeros = leitor.nextLine();
	       String [] listaNumeros = numeros.split(" ");
	       double x = 0;
	       for (int k = 0; k < tamanhoVetor; k++) {
	    	   x = Double.parseDouble(listaNumeros[k]);
	    	   vetor[k] = x;
	       }
	       for (int k = 0; k < vetor.length; k++) {
	    	   if (vetor[k] < menor) {
	               menor = (int) vetor [k];
	               posicaoDoMenor = k+1;
	    	   }
	       }
	       System.out.println("O maior valor encontrado foi: "+menor);
	       System.out.println("Posição: "+posicaoDoMenor);
	       leitor.close();	    
	}
}
