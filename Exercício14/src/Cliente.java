
public class Cliente {
	private String nome;
	private String cpf;
	private String cidadeResidencia;
	
	public Cliente (String nome, String cpf, String cidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.cidadeResidencia = cidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCidadeResidencia() {
		return this.cidadeResidencia;
	}
	
	public void setCidadeResidencia(String cidade) {
		this.cidadeResidencia = cidade;
	}
	
	Cliente(){
		this("","","");
	}
	
	public String toString() {
		return "Cliente de nome" + this.nome + "e que mora na cidade" + this.cidadeResidencia;
	}
	
	
	
}
