package br.ufpb.dcx.banco;

import java.util.ArrayList;

public class ProgramaBanco {
	public static void main(String[] args) {
		SistemaBanco meuBanco = new BancoList("Ayla's Bank", "123/321", 
				new ArrayList<Conta>());
		Conta contaAyla = new ContaSimples("233.333.345-44", "111-1", 
				"222-2", 200.00);
		meuBanco.abrirConta(contaAyla);
		System.out.println(meuBanco.consultarSaldoDisponivelDeConta(
				"111-1", "222-2"));
		meuBanco.sacarDeConta(
				"111-1", "222-2", 200);
		System.out.println(meuBanco.consultarSaldoDisponivelDeConta(
				"111-1", "222-2"));
		Conta contaPedro = new ContaEspecial(“434454-74”, “333-9”, “44-3”, 0, 300.00);
	}
}