package conta.model;

public class ContaCorrente extends Conta { // extends => herança/herda

	// Atributos / variaveis
	private float limite;
	/*
	 * Modificadores de acesso Private - Somente essa class Protected - Somente
	 * arquivos dentro do pacote Public - Todos os arquivos Default - Arquivos do
	 * mesmo pacote
	 *
	 *
	 * METODO ESPECIAL - METODO CONSTRUTOR Onde eu já pré determino os valores,
	 * titulos etc já para a variavel
	 */

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); // Invocando o método Construtor Conta.
		this.limite = limite; // this -> Nome da classe

	}

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
	}

	// Metodo de acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;

	}

	// Polimorfismo de Subscrita / adiciona mais caracteristica a um metodo já
	// existente
	public void visualizar() {
		super.visualizar(); // Metodo da Classe Conta
		System.out.println("Limite de crédito:" + this.limite);
	}
}