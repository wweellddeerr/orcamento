package br.com.mirante.orcamento.view;

import br.com.mirante.orcamento.domain.Orcamento;
import br.com.mirante.orcamento.servico.ListarOrcamentosServico;

public class ListarOrcamentosUI {
	
	private ListarOrcamentosServico servico = new ListarOrcamentosServico(); 

	public void exibir() {
		var orcamentos = servico.listarOrcamentos();
		for (Orcamento orcamento : orcamentos) {
			System.out.print(orcamento.getDescricao());
			System.out.print("           |");
			System.out.print(orcamento.getMes() + "/" + orcamento.getAno());
			System.out.print("           |");
			System.out.print(orcamento.getValorTotalInformado());
			System.out.println();
		}
		new MenuPrincipal().exibir();
	}

}
