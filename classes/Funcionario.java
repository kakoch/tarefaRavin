package classes;

import enums.Cargo;
import enums.Escolaridade;
import enums.EstadoCivil;

public class Funcionario extends Pessoa{
	private int id;
	private EstadoCivil estadoCivil;
	private Escolaridade escolaridade;
	private Cargo cargo;
	private Endereco endereco;

	public Funcionario(int id, EstadoCivil estadoCivil, Escolaridade escolaridade, Cargo cargo, Endereco endereco) {
		super();
		this.id = id;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
		this.cargo = cargo;
		this.endereco = endereco;
	}

	public void incluirFuncionario() {

	}

	public void excluirFuncionario() {

	}

	public void atualizarFuncionario() {

	}

	public void listarFuncionarios() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
