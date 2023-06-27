package classes;

import java.time.LocalTime;
import java.util.Date;

import enums.StatusPreparo;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private String codigo;
	private double precoCusto;
	private double precoVenda;
	private LocalTime tempoPreparo;
	private StatusPreparo statusPreparo;
	private Date criadoEm;
	private String criadoPor;
	private Date alteradoEm;
	private String alteradoPor;

	public Produto(int id, String nome, String descricao, String codigo, double precoCusto, double precoVenda,
			LocalTime tempoPreparo, StatusPreparo statusPreparo, Date criadoEm, String criadoPor, Date alteradoEm,
			String alteradoPor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.tempoPreparo = tempoPreparo;
		this.statusPreparo = statusPreparo;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
		this.alteradoEm = alteradoEm;
		this.alteradoPor = alteradoPor;
	}

	public void atualizarStatusPreparo() {

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public LocalTime getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(LocalTime tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public StatusPreparo getStatusPreparo() {
		return statusPreparo;
	}

	public void setStatusPreparo(StatusPreparo statusPreparo) {
		this.statusPreparo = statusPreparo;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public String getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	public Date getAlteradoEm() {
		return alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public String getAlteradoPor() {
		return alteradoPor;
	}

	public void setAlteradoPor(String alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

}
