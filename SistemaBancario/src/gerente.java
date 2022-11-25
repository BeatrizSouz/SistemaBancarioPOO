
import java.util.Scanner;

public class gerente {

	Scanner input = new Scanner(System.in);
	private cliente[] cliente = new cliente[50];
	
	public gerente() {
		
	}

	public void cadastraCliente() {
		int numeroConta, tipo;
		String agencia, telefone;
		double saldo, chequeEspecial;
		int indice = retornaIndiceVazio(this.cliente);
		System.out.println("Cliente Pessoa Física - (1) ou Pessoa Jurídica - (2):");
		tipo = input.nextInt();
		System.out.println("Número da Conta: ");
		numeroConta = input.nextInt();
		input.nextLine();
		System.out.println("Agência: ");
		agencia = input.nextLine();
		System.out.println("Telefone: ");
		telefone = input.nextLine();
		System.out.println("Saldo da Conta: ");
		saldo = input.nextDouble();
		input.nextLine();
		System.out.println("Cheque Especial: ");
		chequeEspecial = input.nextDouble();
		input.nextLine();
		if(tipo == 1) {
			String cpf, nome;
			int idade;
			System.out.println("CPF do Titular: ");
			cpf = input.nextLine();
			System.out.println("Nome do Titular: ");
			nome = input.nextLine();
			System.out.println("Idade do Titular: ");
			idade = input.nextInt();
			pessoaFisica  PF = new pessoaFisica(numeroConta, agencia, telefone, saldo, chequeEspecial, tipo, cpf, nome, idade);
			this.cliente[indice] = PF;
			
		}else if(tipo == 2) {
			String cnpj, razaoSocial, nomeFantasia;
			String[] socios = new String[2];
			System.out.println("CNPJ: ");
			cnpj = input.nextLine();
			System.out.println("Sócios (até 3 membros, na mesma linha, separados por vírgula): ");
			socios = input.nextLine().split(",");
			System.out.println("Razão Social: ");
			razaoSocial = input.nextLine();
			System.out.println("Nome Fantasia: ");
			nomeFantasia = input.nextLine();
			
			pessoaJuridica PJ = new pessoaJuridica(numeroConta, agencia, telefone, saldo, chequeEspecial, 
					tipo, cnpj, socios,razaoSocial, nomeFantasia);
			this.cliente[indice] = PJ;
		}
		
	}
	
	public void consultaCliente() {
		System.out.println("Digite o Número da Conta:");
		int numero = input.nextInt();
		int indice = retornaIndiceNumero(this.cliente, numero);
		if(indice != -1) {
			this.cliente[indice].imprimeCliente();
		}else {
			System.out.println("FALHA: Cliente não encontrado");
		}
	}
	
	
	public void removeCliente() {
		System.out.println("Digite o Número da Conta:");
		int numero = input.nextInt();
		int indice = retornaIndiceNumero(this.cliente, numero);
		if(indice != -1) {
			this.cliente[indice] = null;
			System.out.println("Cliente removido com sucesso");
		}else {
			System.out.println("FALHA: Cliente não encontrado");
		}
	}
	
	public void alteraChequeEspecial(){
		System.out.println("Digite o Número da Conta:");
		int numero = input.nextInt();
		int indice = retornaIndiceNumero(this.cliente, numero);
		if(indice != -1) {
			System.out.println("Número da conta:" + this.cliente[indice].getNumeroConta());
			System.out.println("Cheque especial atual:" + this.cliente[indice].getChequeEspecial());
			System.out.println("Digite o novo limite: ");
			double novoLimite = input.nextDouble();
			if(novoLimite >= 0) {
				this.cliente[indice].setChequeEspecial(novoLimite);
			}else {
				System.out.println("FALHA: o novo limite deve ser 0 ou maior");
			}
			
		}else {
			System.out.println("FALHA: Cliente não encontrado");
		}
		
	}
	
	
	public void transerencia() {
		System.out.println("Digite o Número da Conta de que vai transferir:");
		int numeroT = input.nextInt();
		int indiceT = retornaIndiceNumero(this.cliente, numeroT);
		System.out.println("Digite o Número da Conta de que vai receber :");
		int numeroR = input.nextInt();
		int indiceR = retornaIndiceNumero(this.cliente, numeroR);
		if(indiceT != -1 && indiceR != -1) {
			
			System.out.println("Informe o valor a ser transferido: ");
			double vlrTransf = input.nextDouble();
			
			if(vlrTransf <= 0) {
				System.out.println("FALHA: O valor a ser transferido deve ser positivo");
			}else if( vlrTransf <= this.cliente[indiceT].getSaldo() ) {
				this.cliente[indiceT].setSaldo(this.cliente[indiceT].getSaldo() - vlrTransf);
				this.cliente[indiceR].setSaldo(this.cliente[indiceR].getSaldo() + vlrTransf);
				
			}else if( vlrTransf <= this.cliente[indiceT].getSaldo() + this.cliente[indiceT].getChequeEspecial()){
				double novoChequeEspecial = this.cliente[indiceT].getChequeEspecial() + this.cliente[indiceT].getSaldo() - vlrTransf;
				this.cliente[indiceT].setSaldo(0);
				this.cliente[indiceT].setChequeEspecial(novoChequeEspecial);
				this.cliente[indiceR].setSaldo(this.cliente[indiceR].getSaldo() + vlrTransf);
			}else {
				System.out.println("FALHA: O valor a ser transferido é maior que o saldo em conta");
			}
			
		}else {
			System.out.println("FALHA: Cliente(s) não encontrado(s). Verifique o número das contas");
		}
	}
	
	public void adicionarSaldo() {
		System.out.println("Digite o Número da Conta:");
		int numero = input.nextInt();
		int indice = retornaIndiceNumero(this.cliente, numero);
		if(indice != -1) {
			System.out.println("Número da conta:" + this.cliente[indice].getNumeroConta());
			System.out.println("Saldo atual:" + this.cliente[indice].getSaldo());
			System.out.println("Digite o valor a ser adicionado: ");
			double saldoAdciolnal = input.nextDouble();
			double saldoAtual = this.cliente[indice].getSaldo();
			if(saldoAdciolnal > 0) {
				this.cliente[indice].setSaldo(saldoAtual + saldoAdciolnal);
			}else {
				System.out.println("FALHA: O saldo a ser adicionado deve ser positivo");
			}
			
		}else {
			System.out.println("FALHA: Cliente não encontrado");
		}

	}
	
	public void imprimirRelatorio() {
		for(int i = 0; i < this.cliente.length; i++){
            if (this.cliente[i] != null){
            	this.cliente[i].imprimeCliente();
            } 
        }
	}

	public static int retornaIndiceNumero(cliente[] vetor, int numero){
        for(int i = 0; i < vetor.length; i++){
        	if(vetor[i] != null) {
        		if (vetor[i].getNumeroConta() == numero){
                    return i;
                } 
        	}
        }
        return -1;
    }
	
	
	public static int retornaIndiceVazio(cliente[] vetor){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == null){
                return i;
            } 
        }
        return -1;
    }

	public void saldoTotal() {
		double saldoTotal = 0;
		for(int i = 0; i < this.cliente.length; i++){
            if (this.cliente[i] != null){
            	saldoTotal += this.cliente[i].getSaldo();
            }
        }
		System.out.println("O Saldo total na carteira é de: "+ saldoTotal);
		System.out.println();
	}
	
}
