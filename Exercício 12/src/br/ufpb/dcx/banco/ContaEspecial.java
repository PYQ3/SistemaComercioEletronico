package br.ufpb.dcx.banco;

public class ContaEspecial extends Conta{
	
	private double credito;
	
	public ContaEspecial (String cpf, String numC, 
			String numAg, double saldo, double credito) {
		super(cpf, numC, numAg, saldo);
		this.credito = credito;
	}
	
	@Override
	public double getSaldoDisponivel() {
		return super.getSaldo() + credito; 
	}
	
	public double getCredito() {
		return credito;
	}
	
	public void setCredito (double credito) {
		this.credito = credito;
	}
}
