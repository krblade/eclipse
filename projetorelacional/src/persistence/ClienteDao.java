package persistence;

import java.sql.PreparedStatement;

import entity.Cliente;
import entity.Endereco;

public class ClienteDao extends Dao {

	
	public void create(Cliente c) throws Exception {
		
	
		open();
		con.setAutoCommit(false);
		
		try {
		stmt = con.prepareStatement("insert into cliente values(null,?,?)",
			PreparedStatement.RETURN_GENERATED_KEYS);
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
        stmt.executeUpdate();
        rs= stmt.getGeneratedKeys();
        rs.next();//posiciono
        c.setIdCliente(rs.getInt(1));
        stmt.close();
        
        stmt = con.prepareStatement
        		("insert into endereco values(null,?,?,?,?,?, ?)");
        
         stmt.setString(1, c.getEndereco().getLogradouro());
         stmt.setString(2, c.getEndereco().getBairro());
         stmt.setString(3, c.getEndereco().getCidade());
         stmt.setString(4, c.getEndereco().getEstado());
         stmt.setString(5, c.getEndereco().getCep());
         stmt.setInt(6, c.getIdCliente());
         stmt.execute();
         stmt.close();
         con.commit();
        
        
		}catch(Exception ex) {
		 //quando gravar em cliente e der erro 
			//não pode gravar sem endereço
			
			ex.printStackTrace();
		 con.rollback();
			
		}
		 con.setAutoCommit(true); //grava em tudo, se der erro não grava em nada
		 close();
	}

	
	public static void main(String[] args) {
		
		try {
			Cliente c= new Cliente(null,"lu","lu@gmail.com");
			
		c.setEndereco( new Endereco(null,"av Rio Branco,123","centro",
	  "Rio de janeiro","RJ","21866184"));
	
		new ClienteDao().create(c);
		System.out.println("dados gravados");
		
		}catch(Exception ex) {
			
		 ex.printStackTrace();	
		}
		
	}	
	
}
