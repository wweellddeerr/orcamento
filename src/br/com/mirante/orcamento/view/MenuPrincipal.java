package br.com.mirante.orcamento.view;

import java.util.Scanner;

public class MenuPrincipal {
	Scanner scanner = new Scanner(System.in);
	
	public void exibir() {
		imprimirMenu();
		var opcaoSelecionada = scanner.next();
		
		while(verificarSeOpcaoInvalida(opcaoSelecionada)) {
			System.out.println("A op��o � inv�lida, tente novamente.");
			imprimirMenu();
			opcaoSelecionada = scanner.next();
		}
		
		processarOpcaoSelecionada(opcaoSelecionada);
	}

	private void processarOpcaoSelecionada(String opcaoSelecionada) {
		if(opcaoSelecionada.equals("1")) {
			new CadastrarOrcamentoUI().exibir();
		} else if(opcaoSelecionada.equals("2")) {
			System.out.println("a op��o selecionada foi 2");
			new ListarOrcamentosUI().exibir();
		} else if(opcaoSelecionada.equals("3")) {
			System.out.println("a op��o selecionada foi 3");		
		} else if(opcaoSelecionada.equals("4")) {
			System.out.println("Adeus...");
			scanner.close();
			System.exit(0);
		}
	}

	private void imprimirMenu() {
		System.out.println("Digite o n�mero correspondente � op��o desejada:");
		System.out.println("[1]. Cadastrar or�amento");
		System.out.println("[2]. Listar or�amentos");
		System.out.println("[3]. Detalhar or�amento");
		System.out.println("[4]. Sair");
	}
	
	private boolean verificarSeOpcaoInvalida(String opcaoSelecionada) {
		return !opcaoSelecionada.equals("1") &&
				!opcaoSelecionada.equals("2") &&
				!opcaoSelecionada.equals("3") &&
				!opcaoSelecionada.equals("4");
	}
}
