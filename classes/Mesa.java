package classes;

public class Mesa {
	private int id;
	private Funcionario funcionario;
	private String nome;
	private String codigo;
	private String statusMesa;
	private int quantidadeMaximaPessoas;

	public Mesa(int id, Funcionario funcionario, String nome, String codigo, String statusMesa,
			int quantidadeMaximaPessoas) {
		super();
		this.id = id;
		this.funcionario = funcionario;
		this.nome = nome;
		this.codigo = codigo;
		this.statusMesa = statusMesa;
		this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
	}

	public void alocarFuncionario() {

	}

	public void reservaMesa() {

	}

	public void liberarMesa() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(String statusMesa) {
		this.statusMesa = statusMesa;
	}

	public int getQuantidadeMaximaPessoas() {
		return quantidadeMaximaPessoas;
	}

	public void setQuantidadeMaximaPessoas(int quantidadeMaximaPessoas) {
		this.quantidadeMaximaPessoas = quantidadeMaximaPessoas;
	}

}
