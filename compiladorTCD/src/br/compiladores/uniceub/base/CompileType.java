package br.compiladores.uniceub.base;

public enum CompileType {

	ID("ID"), NUMERIC("NUM"), RESTRICTED_WORD("RESTRICTED"), LOGIC_OPERATOR("OPERATOR"), DELIMITATOR(
			"DELIMITATOR"), LINE_BROKER("LINEBROKER");

	private String nomeFormatado;

	CompileType(String nomeFormatado) {
		this.nomeFormatado = nomeFormatado;
	}

	public String getNomeFormatado() {
		return nomeFormatado;
	}

}