public class Fornecedor {
	
	private int idfornecedor;
	private String nome_fantasia = new String();
	private String razao_social = new String();
	private String cnpj = new String();
	/*
	String rua_fornecedor = new String();
	String cep_fornecedor = new String();
	String numero_fornecedor = new String();
	String cidade_fornecedor = new String();
	String telefone1_fornecedor = new String();
	String telefone2_fornecedor = new String();
	String login_fornecedor = new String();
	String senha_fornecedor = new String();
	*/
	
	public Fornecedor(int idfornecedor,String nome,String razao, String cnpj){
		setIdfornecedor(idfornecedor);
		setNomeFantasia(nome);
		setRazaoSocial(razao);
		setCnpj(cnpj);
	}
	
	public int getIdfornecedor(){
		return idfornecedor;
	}
	
	public void setIdfornecedor(int id){
		idfornecedor = id;
	}
	
	public String getNomeFantasia(){
		return nome_fantasia;
	}
	
	public void setNomeFantasia(String nome){
		nome_fantasia = nome;
	}
	
	public String getRazaoSocial(){
		return razao_social;
	}
	public void setRazaoSocial(String razao){
		razao_social = razao;
	}
	
	public String getCnpj(){
		return cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

}
