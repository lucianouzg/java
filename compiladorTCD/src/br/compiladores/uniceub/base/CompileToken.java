package br.compiladores.uniceub.base;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import br.compiladores.uniceub.exceptionLogger.ExceptionLogger;

public class CompileToken {

	private Integer size;
	private String content;
	private CompileType compileType;

	public Set<CompileType> possibleNextTypes() {

		if (compileType != null) {
			Set<CompileType> items = new HashSet<CompileType>();

			if (compileType.equals(CompileType.DELIMITADOR)) {
				items.add(CompileType.IDENTIFICADOR);
				items.add(CompileType.PALAVRA_RESTRITA);

			}
			if (compileType.equals(CompileType.IDENTIFICADOR)) {
				items.add(CompileType.OPERADOR_ARITMETICO);
				items.add(CompileType.OPERADOR_ATRIBUICAO);
				items.add(CompileType.NUMERO);

			}
			if (compileType.equals(CompileType.NUMERO)) {
				items.add(CompileType.DELIMITADOR);
				items.add(CompileType.NUMERO);
				items.add(CompileType.OPERADOR_ARITMETICO);
				items.add(CompileType.OPERADOR_ATRIBUICAO);

			}
			if (compileType.equals(CompileType.OPERADOR_ARITMETICO)) {
				items.add(CompileType.IDENTIFICADOR);
				items.add(CompileType.NUMERO);

			}
			if (compileType.equals(CompileType.OPERADOR_ATRIBUICAO)) {
				items.add(CompileType.IDENTIFICADOR);
				items.add(CompileType.NUMERO);

			}
			if (compileType.equals(CompileType.PALAVRA_RESTRITA)) {
				items.add(CompileType.IDENTIFICADOR);
				items.add(CompileType.DELIMITADOR);
			}

			return items;
		} else {
			ExceptionLogger.warnningLog("Level 1", this, null, "possibleNextTypes()",
					Optional.of(new String("compileType has returned a null value")));
			return null;
		}

	}

	public Set<CompileType> possibleBackgroundTypes() {

		if (compileType != null) {
			Set<CompileType> items = new HashSet<CompileType>();

			if (compileType.equals(CompileType.DELIMITADOR)) {
				items.add(CompileType.IDENTIFICADOR);
				items.add(CompileType.NUMERO);

			}
			if (compileType.equals(CompileType.IDENTIFICADOR)) {
				items.add(CompileType.PALAVRA_RESTRITA);
				items.add(CompileType.OPERADOR_ATRIBUICAO);
				items.add(CompileType.NUMERO);

			}
			if (compileType.equals(CompileType.NUMERO)) {
				items.add(CompileType.DELIMITADOR);
				items.add(CompileType.NUMERO);
				items.add(CompileType.OPERADOR_ARITMETICO);
				items.add(CompileType.OPERADOR_ATRIBUICAO);

			}
			if (compileType.equals(CompileType.OPERADOR_ARITMETICO)) {
				items.add(CompileType.IDENTIFICADOR);
				items.add(CompileType.NUMERO);

			}
			if (compileType.equals(CompileType.OPERADOR_ATRIBUICAO)) {
				items.add(CompileType.IDENTIFICADOR);
				items.add(CompileType.NUMERO);

			}
			if (compileType.equals(CompileType.PALAVRA_RESTRITA)) {
				items.add(CompileType.DELIMITADOR);
			}

			return items;
		} else {
			ExceptionLogger.warnningLog("Level 1", this, null, "possibleBackgroundTypes()",
					Optional.of(new String("compileType has returned a null value")));
			return null;
		}

	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CompileType getCompileType() {
		return compileType;
	}

	public void setCompileType(CompileType compileType) {
		this.compileType = compileType;
	}

}
