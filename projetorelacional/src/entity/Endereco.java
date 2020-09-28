package entity;

import java.io.Serializable;
//se eu quero persistir, transportar tem que serializar
public class Endereco implements Serializable{
     /**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private Integer idEndereco; 
	 private String logradouro;
	 private String bairro;
	 private String cidade;
	 private String estado;
	 private String cep;
	 private Cliente cliente;
	 
	public Integer getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	public Endereco(Integer idEndereco, String logradouro, String bairro, String cidade, String estado, String cep) {
		super();
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + estado + ", cep=" + cep + "]";
	}
	
	//relacionamento bidirecional
	//cliente visualiza endereço e endereço visualiza endereço
	
	
	
}
