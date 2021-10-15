package br.com.mirante.orcamento.view;

import java.util.Scanner;

public class MenuPrincipal {
	Scanner scanner = new Scanner(System.in);
	
	public void exibir() {
		imprimirMenu();
		var opcaoSelecionada = scanner.next();
		
		while(verificarSeOpcaoInvalida(opcaoSelecionada)) {
			System.out.println("A opção é inválida, tente novamente.");
			imprimirMenu();
			opcaoSelecionada = scanner.next();
		}
		
		processarOpcaoSelecionada(opcaoSelecionada);
	}

	private void processarOpcaoSelecionada(String opcaoSelecionada) {
		if(opcaoSelecionada.equals("1")) {
			new CadastrarOrcamentoUI().exibir();
		} else if(opcaoSelecionada.equals("2")) {
			System.out.println("a opção selecionada foi 2");
			new ListarOrcamentosUI().exibir();
		} else if(opcaoSelecionada.equals("3")) {
			System.out.println("a opção selecionada foi 3");		
		} else if(opcaoSelecionada.equals("4")) {
			System.out.println("Adeus...");
			scanner.close();
			System.exit(0);
		}
	}

	private void imprimirMenu() {
		System.out.println("Digite o número correspondente à opção desejada:");
		System.out.println("[1]. Cadastrar orçamento");
		System.out.println("[2]. Listar orçamentos");
		System.out.println("[3]. Detalhar orçamento");
		System.out.println("[4]. Sair");
	}
	
	private boolean verificarSeOpcaoInvalida(String opcaoSelecionada) {
		return !opcaoSelecionada.equals("1") &&
				!opcaoSelecionada.equals("2") &&
				!opcaoSelecionada.equals("3") &&
				!opcaoSelecionada.equals("4");
	}
}
