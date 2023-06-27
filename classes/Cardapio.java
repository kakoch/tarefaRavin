package classes;

import java.util.List;

public class Cardapio {
	private int id;
	private String nome;
	private List<Produto> produtos;
	private String codigo;
	private String status;

	public Cardapio(int id, String nome, List<Produto> produtos, String codigo, String status) {
		super();
		this.id = id;
		this.nome = nome;
		this.produtos = produtos;
		this.codigo = codigo;
		this.status = status;
	}

	public void adicionarProduto() {
		
	}
	
	public void removerProduto() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
