
public class pessoaJuridica extends cliente {

	private String cnpj;
	private String[] socios = new String[2];
	private String razaoSocial;
	private String nomeFantasia;
	

	
	public pessoaJuridica(int numeroConta, String agencia, String telefone, double saldo, double chequeEspecial,
			int tipo, String cnpj, String[] socios, String razaoSocial, String nomeFantasia) {
		super(numeroConta, agencia, telefone, saldo, chequeEspecial, tipo);
		this.cnpj = cnpj;
		this.socios = socios;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public pessoaJuridica() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String[] getSocios() {
		return socios;
	}

	public void setSocios(String[] socios) {
		this.socios = socios;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void imprimeCliente() {
		System.out.println("\n-------------------------------------");
		System.out.println("N�mero da Conta: "+ getNumeroConta());
		System.out.println("Ag�ncia: "+ getAgencia());
		System.out.println("Telefone: "+ getTelefone());
		System.out.println("Saldo da Conta: " + getSaldo());
		System.out.println("Cheque Especial: "+ getChequeEspecial());
		System.out.println("CNPJ: " + getCnpj());
		System.out.println("S�cios: ");
		System.out.println(getSocios()[0]);
		System.out.println(getSocios()[1]);
		System.out.println(getSocios()[2]);
		System.out.println("Raz�o Social: "+ getRazaoSocial());
		System.out.println("Nome Fantasia: " + getNomeFantasia());
		System.out.println(" -------------------------------------\n");
	}

	
	
}
