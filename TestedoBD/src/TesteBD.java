import java.util.Scanner;

public class TesteBD {
	static ClienteDAO cdao = new ClienteDAO();
	static Scanner op = new Scanner(System.in);
	static boolean flag = true;
	static Cliente c = new Cliente();

	public static void main(String[] args) {
		while(flag){
			System.out.print("Digite a opção: ");
			switch (op.nextInt()) {
			case 0:
				inserirCliente();
				break;
			case 1:

				String cpf = new String();
				
				System.out.print("Digite o cpf: ");
				cpf = op.next();
				c = procuraPorCPF(cpf);
				System.out.println(c.toString());
				break;
			case 2:
				System.out.println("Selecione o Cliente: ");
				c = procuraPorCPF(op.next());
				System.out.print("Digite o novo nome: ");
				c.setNomeCliente(op.next());
				System.out.println(cdao.updateCliente(c));
				break;
			case 9:
				flag = false;
	
			default:
				break;
			}
		}

	}
	
	public static void inserirCliente(){
		Cliente c = new Cliente();		
		Scanner in = new Scanner(System.in);
		String aux = new String();
		boolean res;
		
		System.out.print("Digite o nome: ");
		aux = in.next();
		c.setNomeCliente(aux);
		System.out.print("Digite o CPF: ");
		aux = in.next();
		c.setCpf(aux);
		System.out.print("Digite o Email: ");
		aux = in.next();
		c.setLogin_cliente(aux);
		System.out.print("Digite a Senha: ");
		aux = in.next();
		c.setSenha_cliente(aux);
		
		res = cdao.insertCliente(c);
		System.out.println(res);
		
	}
	public static Cliente procuraPorCPF(String cpf){
		Cliente c = new Cliente();
		
			c = cdao.findCliente(cpf);
		
		return c;
	}
}
