

public class pessoaFisica extends cliente {

	private String cpf;
	private String nome;
	private int idade;
	

	
	public pessoaFisica(int numeroConta, String agencia, String telefone, double saldo, double chequeEspecial, int tipo,
			String cpf, String nome, int idade) {
		super(numeroConta, agencia, telefone, saldo, chequeEspecial, tipo);
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}

	public pessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void imprimeCliente() {
		System.out.println("-------------------------------------");
		System.out.println("Número da Conta: "+ getNumeroConta());
		System.out.println("Agência: "+ getAgencia());
		System.out.println("Telefone: "+ getTelefone());
		System.out.println("Saldo da Conta: " + getSaldo());
		System.out.println("Cheque Especial: "+ getChequeEspecial());
		System.out.println("CPF do Titular: " + getCpf());
		System.out.println("Nome do Titular: " + getNome());
		System.out.println("Idade do Titular: " + getIdade());
		System.out.println("-------------------------------------\n");
	}
	
	
}
