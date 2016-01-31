public class Evento {
	
	private int idevento;
	private int idcliente;
	private String nome_evento = new String();
	private String descricao = new String();
	
	public Evento(int idevento,int idcliente,String nome, String descricao){
		setIdevento(idevento);
		setIdcliente(idcliente);
		setNome_evento(nome);
		setDescricao(descricao);
	}

	public int getIdevento() {
		return idevento;
	}

	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome_evento() {
		return nome_evento;
	}

	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
