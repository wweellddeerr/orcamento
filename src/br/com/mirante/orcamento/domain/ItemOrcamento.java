package br.com.mirante.orcamento.domain;

public class ItemOrcamento {

	private String origem;
	private String codigo;
	private String descricao;
	private float valorUnitario;
	private String unidade;
	private float quantidade;
	private float valorTotalInformado;

	public ItemOrcamento(
			String origem,
			String codigo,
			String descricao,
			float valorUnitario,
			String unidade,
			float quantidade,
			float valorTotalInformado
	) {
		super();
		this.origem = origem;
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.valorTotalInformado = valorTotalInformado;
	}

	public boolean possuiInconsistencia() {
		return valorUnitario * quantidade != valorTotalInformado;
	}

}
