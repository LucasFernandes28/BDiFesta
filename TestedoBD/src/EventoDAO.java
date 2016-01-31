import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EventoDAO {

	//private String url;
    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;


	    EventoDAO() {
	        try {
	            Class.forName("org.postgresql.Driver");
	            con = DriverManager.getConnection("jdbc:postgresql://localhost/ifesta", "postgres", "12345");
	        } catch (ClassNotFoundException e1) {
	            System.out.println(e1.getMessage());
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	    }
	    
	    
	    public void insertEvento(Evento ev) {

	        try {
	        	pstmt = con.prepareStatement("INSERT INTO eventos (idcliente, nome_evento, descricao) VALUES (? ? ?)");
	        	pstmt.setLong(1, ev.getIdcliente()); 
	        	pstmt.setString(2, ev.getNome_evento()); 
	        	pstmt.setString(3, ev.getDescricao());
	        	pstmt.execute();
	        	pstmt.close();
	        	con.close();
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        } catch (Exception e1) {
	            System.out.println(e1.getMessage());
	        }
	    }
	    
	    public Evento findEvento(int idcliente) { //Retornará um Array de Eventos
	        Evento ev = null;
	        String nome_evento = new String();
	        String descricao = new String();
	        int idEvento;
	        String clausula = "select * from eventos where idcliente = " + "\'" + String.valueOf(idcliente) + "\'";
	        try {
	            rs = stmt.executeQuery(clausula);
	            if (rs.next()) {
	                nome_evento = rs.getString("nome_evento");
	                descricao = rs.getString("descricao");
	                idEvento = Integer.parseInt(rs.getString("idevento"));
	                ev = new Evento(idEvento,idcliente,nome_evento,descricao);
	            }
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return ev; //Alterar para Array de Eventos, pois irá retornar uma lista de eventos
	    }
	    //public Evento findEvento(int idcliente);
	    //sobrecarregar a função findEvento para as variadas consultas

	    public boolean updateEvento(Evento ev) {
	        boolean sucesso = false;

	        try {
	            String clausula = "update eventos set descricao = " + ev.getDescricao() + " where idevento = " + "\'" + ev.getIdevento() + "\'";
	            stmt.executeUpdate(clausula);
	            sucesso = true;
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }
	        return sucesso;
	    }

	    public boolean deleteEvento(Evento ev) {
	        boolean sucesso = false;

	        String clausula = "delete from eventos where idevento = " + "\'" + ev.getIdevento() + "\'";
	        try {
	            stmt.executeUpdate(clausula);
	        } catch (SQLException e1) {
	            System.out.println(e1.getMessage());
	        }

	        return sucesso;
	    }

}
