package classes;

import java.util.Date;

public class Endereco {
	private int id;
	private int cep;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String numeorResi;
	private Date criadoEm;
	private String criadoPor;
	private Date alteradoEm;
	private String alteradoPor;
	public Endereco(int id, int cep, String estado, String cidade, String bairro, String rua, String numeorResi,
			Date criadoEm, String criadoPor, Date alteradoEm, String alteradoPor) {
		super();
		this.id = id;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numeorResi = numeorResi;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
		this.alteradoEm = alteradoEm;
		this.alteradoPor = alteradoPor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumeorResi() {
		return numeorResi;
	}
	public void setNumeorResi(String numeorResi) {
		this.numeorResi = numeorResi;
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
