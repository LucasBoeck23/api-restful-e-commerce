package br.com.projetofinal.cordeirostyle.dtos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



public class EnderecoDto {

	private String cep;
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	private ClienteDto cliente;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCliente() {
		return cliente.getNome_completo();
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	
}
