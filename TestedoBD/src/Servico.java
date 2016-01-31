public class Servico {
	
	private int idservico;
	private int idfornecedor;
	private String nome_servico = new String();
	private String descricao = new String();
	
	Servico(int idservico,int idfornecedor, String nome, String descricao){
		setIdservico(idservico);
		setIdfornecedor(idfornecedor);
		setNomeServico(nome);
		setDescricao(descricao);
	}
	
	public int getIdservico(){
		return idservico;
	}
	
	public void setIdservico(int id){
		idservico = id;
	}
	
	public int getIdfornecedor(){
		return idfornecedor;
	}
	
	public void setIdfornecedor(int id){
		idfornecedor = id;
	}
	
	public String getNomeServico(){
		return nome_servico;
	}
	public void setNomeServico(String nome){
		nome_servico = nome;
	}
	
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

}
