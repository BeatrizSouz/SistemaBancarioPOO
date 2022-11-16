

public abstract class cliente {

	private int numeroConta;
	private String agencia;
	private String telefone;
	private double saldo;
	private double chequeEspecial;
	private int tipo;
	
	public cliente(int numeroConta, String agencia, String telefone, double saldo, double chequeEspecial, int tipo) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.telefone = telefone;
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.tipo = tipo;
	}
	
	public cliente() {
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	abstract public void imprimeCliente();
	
}
