package entity;

import java.io.Serializable;

public class Cliente implements Serializable{

	//atributos privados são visiveis apenas na propria classe
	// atributos protect sao acessiveis a classes do pacote
		
	
	private static final long serialVersionUID = 5L;
		private Integer idCliente;
		private String nome;
		private String email;
		private Endereco endereco;
		
		
		
		public Integer getIdCliente() {
		return idCliente;
		
		
		//OneToOne
		}
		public void setIdCliente(Integer idCliente) {
			this.idCliente = idCliente;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	
		
		
	 public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public Cliente(Integer idCliente, String nome, String email) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + "]";
	}
	
	 
	 
	 
}
