import java.sql.*;

public class ClienteDAO {

    private Statement stmt;
    private ResultSet rs;


//	    ClienteDAO() {
//	        try {
//	            Class.forName("org.postgresql.Driver");
//	            con = DriverManager.getConnection("jdbc:postgresql://localhost/ifesta", "postgres", "12345");
//	            //stmt = con.createStatement();
//	        } catch (ClassNotFoundException e1) {
//	            System.out.println(e1.getMessage());
//	        } catch (SQLException e1) {
//	            System.out.println(e1.getMessage());
//	        }
//
//	    }
	    
	    public Connection getConexao() {
			Connection conexao = null;
			String usuario = "postgres";
			String senha = "12345";
			String nomeBancoDados = "ifesta";
	 
			try {
				Class.forName("org.postgresql.Driver");
				conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + nomeBancoDados,
						 usuario, senha);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conexao;
		}
	    
	    public boolean insertCliente(Cliente c) {
	    	
	        try {
	        	
	        	Connection con = getConexao();
	        	stmt = con.createStatement();
	        	String clausula = "INSERT INTO cliente(nome_cliente,cpf,senha_cliente,email_cliente) VALUES("
						        	+ "'" + c.getNomeCliente() + "','" 
						        	+ c.getCpf() + "','" 
						        	+ c.getSenha_cliente() + "','"  
					        		+ c.getLogin_cliente() + "')";
	        	
	        	System.out.println("passou insert");
	        	stmt.executeUpdate(clausula);
	        	System.out.println("executou");
	        	stmt.close();
	        	con.close();
	        	return true;
	        } catch (SQLException e1) {
	            return false;
	        } catch (Exception e1) {
	            return false;
	        }
	    }
	    
	    public Cliente findCliente(String cpf) {

	        Cliente c = new Cliente();
	        String clausula = "select * from cliente where cpf = " + "'" + cpf + "'";
	        try {

		        Connection con = getConexao();
		        stmt = con.createStatement();
	            rs = stmt.executeQuery(clausula);
	            if (rs.next()) {
	                c.setNomeCliente(rs.getString("nome_cliente"));
	                c.setIdcliente(Integer.parseInt(rs.getString("idcliente")));
	                c.setLogin_cliente(rs.getString("email_cliente"));;
	                
	            }
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return c; //Alterar para Array de Clientes, pois irá retornar uma lista de clientes
	    }
	    //public Cliente findCliente(String cpf);
	    //sobrecarregar a função findCliente para as variadas consultas

	    public boolean updateCliente(Cliente c) {
	        boolean sucesso = false;

	        try {
		        Connection con = getConexao();
		        stmt = con.createStatement();
	            String clausula = "update cliente set nome_cliente = '" + c.getNomeCliente() + "' where cpf = " + "'" + c.getCpf() + "'";
	            stmt.executeUpdate(clausula);
	            sucesso = true;
				System.out.println("Atualizado");	
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return sucesso;
	    }

	    public boolean deleteCliente(Cliente c) {
	        boolean sucesso = false;

	        String clausula = "delete from cliente where cpf = " + "'" + c.getCpf() + "'";
	        try {
	            stmt.executeUpdate(clausula);
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	        return sucesso;
	    }
}
