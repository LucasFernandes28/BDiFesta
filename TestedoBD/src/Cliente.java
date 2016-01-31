public class Cliente {
	
	private int idcliente;
	private String nome_cliente = new String();
	private String cpf = new String();
	private String login_cliente = new String();
	private String senha_cliente = new String();
	/*
	String rua_cliente = new String();
	String numero_cliente = new String();
	String complemento_cliente = new String();
	String cidade_cliente = new String();
	String cep_cliente = new String();
	String telefone1_cliente = new String();
	Sting telefone2_cliente = new String();
	Date dt_nasc_cliente = new Date();

	 */
	public Cliente() {
		
	}
	
	public Cliente(int id,String nome, String cpf, String login, String senha){
		setIdcliente(id);
		setNomeCliente(nome);
		setCpf(cpf);
		setLogin_cliente(login);
		setSenha_cliente(senha);	
	}
	
	public Cliente(String nome, String cpf, String login, String senha){
		setNomeCliente(nome);
		setCpf(cpf);
		setLogin_cliente(login);
		setSenha_cliente(senha);

	}
	
	public int getIdcliente(){
		return idcliente;
	}
	public void setIdcliente(int id){
		idcliente = id;
	}
	public String getNomeCliente(){
		return nome_cliente;
	}
	public void setNomeCliente(String nome){
		nome_cliente = nome;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getLogin_cliente() {
		return login_cliente;
	}

	public void setLogin_cliente(String login_cliente) {
		this.login_cliente = login_cliente;
	}

	public String getSenha_cliente() {
		return senha_cliente;
	}

	public void setSenha_cliente(String senha_cliente) {
		this.senha_cliente = senha_cliente;
	}
	
	public String toString(){
		return getNomeCliente() + " " + getLogin_cliente(); 
	}


	/*public Evento criarEvento(){
		Evento ev;
		
		return ev;
	}
	public void editarEvento(Evento ev){
		
	}
	public void atualizarDados(Cliente c){
		
	}*/
}
