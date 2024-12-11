package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {
		// Instanciamento / Classe -> Objeto Utilizavel
		Conta c1 = new Conta(123456,0001, 1,"Maria das Neves",500f);
        c1.setSaldo(5000f);
        
        System.out.println("Titular:" + c1.getTitular());
        System.out.println("Saldo:" + c1.getSaldo());
        
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					         + "*****************************************************************");
			System.out.println("                                                                 ");
			System.out.println("                           Banco Gen                             ");
			System.out.println("                                                                 ");
			System.out.println("*****************************************************************");
			System.out.println("                                                                 ");
			System.out.println("                      1 - Criar conta                            ");
			System.out.println("                      2 - Listar todas as contas                 ");
			System.out.println("                      3 - Buscar conta por numero                ");
			System.out.println("                      4 - Atualizar dados da conta               ");
			System.out.println("                      5 - Apagar conta                           ");
			System.out.println("                      6 - Sacar                                  ");
			System.out.println("                      7 - Depositar                              ");
			System.out.println("                      8 - Transferir valores entre contas        ");
			System.out.println("                      9 - Sair                                   ");
			System.out.println("                                                                 ");
			System.out.println("*****************************************************************");
			System.out.println("  Entre com a opção desejada:                                    ");
			System.out.println("                                                                 " + Cores.TEXT_RESET);

			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Gen - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar conta \n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre contas\n\n");

				break;
			case 9:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção Inválida!\n\n" + Cores.TEXT_RESET);
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Adelina Santos");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("***********************************************************");
	}
}
