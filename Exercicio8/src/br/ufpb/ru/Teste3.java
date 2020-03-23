package br.ufpb.ru;

import java.util.Scanner;

public class Teste3 {
	
	
	public static int quantidadeDeAlmoco(RefeicaoRealizada[]refeicoes) {
		int quantAlmoco = 0;
		for (int k = 0; k < refeicoes.length; k++ ) {
			RefeicaoRealizada x = refeicoes[k];
			if (x.getTipoRefeicao().equalsIgnoreCase("ALMOÇO")) {
				quantAlmoco++;
			}		
		}
		return quantAlmoco;
	}
	public static String temCafé(RefeicaoRealizada[]refeicoes) {
		int x = 0;
		String y = "";
		for (int k = 0; k < refeicoes.length; k++ ) {
			RefeicaoRealizada b = refeicoes[k];
			if (b.getTipoRefeicao().equalsIgnoreCase("CAFÉ")) {
				x++;
			}
		}
		if ( x > 0) {
			y = "SIM";
		} else {
			y = "NÃO";
		}
		return y;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas refeições foram servidas hoje?");
		int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
		RefeicaoRealizada [] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
		for (int k = 0; k < quantidadeRefeicoes; k++) {
			System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
			String matricula = leitor.nextLine();
			System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR");
			String tipoRefeicao = leitor.nextLine();
			refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
			System.out.printf("%s\n", refeicoes[k].toString());
		}
		System.out.println("Quantos almoços foram servidos?");
		int N = Integer.parseInt(leitor.nextLine());
		Double total = 0.0;
		for (int k = 0; k < N; k++) {
			System.out.println("Qual foi o preço da " + (k + 1) + "° refeição?");
			Double m = Double.parseDouble(leitor.nextLine());
			total = total + m;
		}
		System.out.printf("O total gasto pelo RU foi de %.2f", total);
		System.out.printf("\nA quantidade de almoços foi de: %d ",quantidadeDeAlmoco(refeicoes));
		System.out.printf("\nTeve café? " +  temCafé(refeicoes));
		System.out.printf("\nFIM DO PROGRAMA");
		
		leitor.close();
	}// fim do main
} // fim da classe Teste 3