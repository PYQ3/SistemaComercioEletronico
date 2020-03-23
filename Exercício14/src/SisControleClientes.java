import java.util.ArrayList;
public class SisControleClientes {
	private ArrayList<Cliente> clientes;
	
	public SisControleClientes () {
		this.clientes = new ArrayList<Cliente>();
	}
	public String pesquisaNomeDoCliente(String cpf){
		for (Cliente c: this.clientes){
			if (c.getCpf().equals(cpf)){
				return c.getNome();
			}
		}
		return "Cliente não encontrado";
	}
	public void cadastraCliente(Cliente c) {
		this.clientes.add(c);
	}
	public boolean existeClienteComCPF(String cpf){
		for(Cliente c : this.clientes) {
			if (c.getCpf() == cpf) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Cliente> pesquisaClientesDaCidade(String cidade){
		ArrayList<Cliente> clientesDaCidade = new ArrayList<>();
		for (Cliente c : this.clientes) {
			if (c.getCidadeResidencia() == cidade) {
				clientesDaCidade.add(c);
			}
		}
		return clientesDaCidade;
	}
}