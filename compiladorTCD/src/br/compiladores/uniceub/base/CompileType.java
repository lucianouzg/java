package br.compiladores.uniceub.base;

public enum CompileType {

	IDENTIFICADOR("IDENTIFICADOR"), NUMERO("NUMERO"), PALAVRA_RESTRITA("RESTRITA"), OPERADOR_ARITMETICO(
			"ARITMETICO"), OPERADOR_LOGICO("LOGICO"), DELIMITADOR("DELIMITADOR"), OPERADOR_ATRIBUICAO("ATRIBUICAO");

	private String nomeFormatado;

	CompileType(String nomeFormatado) {
		this.nomeFormatado = nomeFormatado;
	}

	public String getNomeFormatado() {
		return nomeFormatado;
	}

}