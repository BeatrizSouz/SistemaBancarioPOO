import java.util.Scanner;

public class programaPrincipal {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		gerente gerente = new gerente();
		
		do {
			System.out.println("Digite o número da operação desejada:");
			System.out.println("1 - Cadastrar novo cliente");
			System.out.println("2 - Remover cliente de sua carteira");
			System.out.println("3 - Consultar cliente");
			System.out.println("4 - Aumentar/Diminuir limite do Cheque Especial");
			System.out.println("5 - Realizar Transferência entre clientes");
			System.out.println("6 - Depósito em conta");
			System.out.println("7 - Gerar Relatório de clientes");
			System.out.println("8 - Total de saldo depositado");
			System.out.println("0 - Finalizar");
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
					break;
				case 8:
					System.out.println("\nOpção 8 - Total de saldo de todos os clientes");
					gerente.saldoTotal();
					break;
				case 0:
					System.out.println("Programa encerrado");
					break;
				default: 
					System.out.println("FALHA: Digite uma opção válida");
			}
		}while(opcao!=0);
	}
}
