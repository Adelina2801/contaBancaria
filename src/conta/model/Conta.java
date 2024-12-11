package conta.model;

public class Conta {

	// Atributos/Variaveis
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	/*
	 * Modificadores de acesso Private - Somente essa class Protected - Somente
	 * arquivos dentro do pacote Public - Todos os arquivos Default - Arquivos do
	 * mesmo pacote
	 *
	 *
	 * METODO ESPECIAL - METODO CONSTRUTOR Onde eu já pré determino os valores,
	 * titulos etc já para a variavel
	 */

	public Conta(int numero, int agencia, int tipo, String titular, float saldo ) {
		
		/* this => Classe Conta
		 * Conta.numero = atributo
		 * numero  = 6
		 * this.numero = 6
		 */
		this.numero = numero;
		
		
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
// Get -> Pegar
	public int getNumero() {
		return numero;
	}
// Set -> Colocar
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
    	
    }
