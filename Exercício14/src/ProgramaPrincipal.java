import java.util.ArrayList;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		SisControleClientes sistema = new SisControleClientes ();
		sistema.cadastraCliente(new Cliente("Ayla Rebouças","222.222.222-22","Rio Tinto-PB"));
		sistema.cadastraCliente(new Cliente("Maria Oliveira","111.111.111-11","Rio Tinto-PB"));
	}
	
	ArrayList<Cliente> clientesDeRioTinto = sistema.pesquisaClientesDaCidade("Rio Tinto-PB");
	for (Cliente c : clientesDeRioTinto) {
		System.out.println(c.getCpf());
	}
}
}
