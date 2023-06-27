package classes;

public class Cliente extends Pessoa{
	private String observacao;
	private Endereco endereco;

	public Cliente(String observacao, Endereco endereco) {
		super();
		this.observacao = observacao;
		this.endereco = endereco;
	}

	public void incluirCliente() {

	}

	public void atualizarCliente() {

	}

	public void listarClientes() {

	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
