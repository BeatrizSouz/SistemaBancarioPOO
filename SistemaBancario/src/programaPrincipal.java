import java.util.Scanner;

public class programaPrincipal {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		gerente gerente = new gerente();
		
		do {
			System.out.println("Digite o número da operação desejada:");
			System.out.println("Cadastrar novo cliente - 1");
			System.out.println("Remover cliente de sua carteira - 2");
			System.out.println("Consultar cliente - 3");
			System.out.println("Aumentar / Diminuir limite do Cheque Especial - 4");
			System.out.println("Realizar Transferência entre clientes - 5");
			System.out.println("Depósito em conta - 6");
			System.out.println("Gerar Relatório da conta - 7");
			System.out.println("Finalizar - 0");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1: 
					System.out.println("\nOpção 1 - Cadastre novo Cliente");
					gerente.cadastraCliente();
					break;
				case 2:
					System.out.println("\nOpção 2 - Remova um Cliente com base no Número da Conta");
					gerente.removeCliente();
					break;
				case 3:
					System.out.println("\nOpção 3 - Consulte o Cliente com base no Número da Conta");
					gerente.consultaCliente();
					break;
				case 4:
					System.out.println("\nOpção 4 - Informe o número da conta e novo limite do Cheque Especial");
					gerente.alteraChequeEspecial();
					break;
				case 5:
					System.out.println("\nOpção 5 - Informe os números das contas e valor a ser transferido");
					gerente.transerencia();
					break;
				case 6:
					System.out.println("\nOpção 6 - Informe o número da conta e valor a ser adicionado");
					gerente.adicionarSaldo();
					break;
				case 7:
					System.out.println("\nOpção 7 - Relatório de todos os clientes");
					gerente.imprimirRelatorio();
				case 0:
					break;
				default: 
					System.out.println("FALHA: Digite uma opção válida");
			}
		}while(opcao!=0);
	}
}
