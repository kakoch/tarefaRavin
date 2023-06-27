package classes;

import java.util.List;

public class Comanda {
	private int id;
	private Mesa mesa;
	private Cliente cliente;
	private List<Produto> produtos;
	private String statusComanda;
	private String codigoComanda;
	private double valorTotalComanda;

	public Comanda(int id, Mesa mesa, Cliente cliente, List<Produto> produtos, String statusComanda,
			String codigoComanda, double valorTotalComanda) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.cliente = cliente;
		this.produtos = produtos;
		this.statusComanda = statusComanda;
		this.codigoComanda = codigoComanda;
		this.valorTotalComanda = valorTotalComanda;
	}

	public void adicionarProduto() {

	}

	public void deletarProduto() {

	}

	public void fecharComanda() {

	}

	public void calcularValorTotalComanda() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getStatusComanda() {
		return statusComanda;
	}

	public void setStatusComanda(String statusComanda) {
		this.statusComanda = statusComanda;
	}

	public String getCodigoComanda() {
		return codigoComanda;
	}

	public void setCodigoComanda(String codigoComanda) {
		this.codigoComanda = codigoComanda;
	}

	public double getValorTotalComanda() {
		return valorTotalComanda;
	}

	public void setValorTotalComanda(double valorTotalComanda) {
		this.valorTotalComanda = valorTotalComanda;
	}

}
