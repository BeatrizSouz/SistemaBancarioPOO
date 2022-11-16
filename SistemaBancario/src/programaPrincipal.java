import java.util.Scanner;

public class programaPrincipal {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		gerente gerente = new gerente();
		
		do {
			System.out.println("Digite o n�mero da opera��o desejada:");
			System.out.println("Cadastrar novo cliente - 1");
			System.out.println("Remover cliente de sua carteira - 2");
			System.out.println("Consultar cliente - 3");
			System.out.println("Aumentar / Diminuir limite do Cheque Especial - 4");
			System.out.println("Realizar Transfer�ncia entre clientes - 5");
			System.out.println("Dep�sito em conta - 6");
			System.out.println("Gerar Relat�rio da conta - 7");
			System.out.println("Finalizar - 0");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1: 
					System.out.println("\nOp��o 1 - Cadastre novo Cliente");
					gerente.cadastraCliente();
					break;
				case 2:
					System.out.println("\nOp��o 2 - Remova um Cliente com base no N�mero da Conta");
					gerente.removeCliente();
					break;
				case 3:
					System.out.println("\nOp��o 3 - Consulte o Cliente com base no N�mero da Conta");
					gerente.consultaCliente();
					break;
				case 4:
					System.out.println("\nOp��o 4 - Informe o n�mero da conta e novo limite do Cheque Especial");
					gerente.alteraChequeEspecial();
					break;
				case 5:
					System.out.println("\nOp��o 5 - Informe os n�meros das contas e valor a ser transferido");
					gerente.transerencia();
					break;
				case 6:
					System.out.println("\nOp��o 6 - Informe o n�mero da conta e valor a ser adicionado");
					gerente.adicionarSaldo();
					break;
				case 7:
					System.out.println("\nOp��o 7 - Relat�rio de todos os clientes");
					gerente.imprimirRelatorio();
				case 0:
					break;
				default: 
					System.out.println("FALHA: Digite uma op��o v�lida");
			}
		}while(opcao!=0);
	}
}
