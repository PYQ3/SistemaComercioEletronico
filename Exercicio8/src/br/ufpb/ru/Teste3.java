package br.ufpb.ru;

import java.util.Scanner;

public class Teste3 {
	
	
	public static int quantidadeDeAlmoco(RefeicaoRealizada[]refeicoes) {
		int quantAlmoco = 0;
		for (int k = 0; k < refeicoes.length; k++ ) {
			RefeicaoRealizada x = refeicoes[k];
			if (x.getTipoRefeicao().equalsIgnoreCase("ALMO�O")) {
				quantAlmoco++;
			}		
		}
		return quantAlmoco;
	}
	public static String temCaf�(RefeicaoRealizada[]refeicoes) {
		int x = 0;
		String y = "";
		for (int k = 0; k < refeicoes.length; k++ ) {
			RefeicaoRealizada b = refeicoes[k];
			if (b.getTipoRefeicao().equalsIgnoreCase("CAF�")) {
				x++;
			}
		}
		if ( x > 0) {
			y = "SIM";
		} else {
			y = "N�O";
		}
		return y;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas refei��es foram servidas hoje?");
		int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
		RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
		for (int k = 0; k < quantidadeRefeicoes; k++) {
			System.out.println("Matr�cula do(a) aluno(a) [" + (k + 1) + "]");
			String matricula = leitor.nextLine();
			System.out.println("Qual o tipo de refei��o? CAF�, ALMO�O ou JANTAR");
			String tipoRefeicao = leitor.nextLine();
			refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
			System.out.printf("%s\n", refeicoes[k].toString());
		}
		System.out.println("Quantos almo�os foram servidos?");
		int N = Integer.parseInt(leitor.nextLine());
		Double total = 0.0;
		for (int k = 0; k < N; k++) {
			System.out.println("Qual foi o pre�o da " + (k + 1) + "� refei��o?");
			Double m = Double.parseDouble(leitor.nextLine());
			total = total + m;
		}
		System.out.printf("O total gasto pelo RU foi de %.2f", total);
		System.out.printf("\nA quantidade de almo�os foi de: %d ",quantidadeDeAlmoco(refeicoes));
		System.out.printf("\nTeve caf�? " +  temCaf�(refeicoes));
		System.out.printf("\nFIM DO PROGRAMA");
		
		leitor.close();
	}// fim do main
} // fim da classe Teste 3