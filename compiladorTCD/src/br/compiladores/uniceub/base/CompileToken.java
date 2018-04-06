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

			if (compileType.equals(CompileType.DELIMITATOR)) {
				items.add(CompileType.DELIMITATOR);
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);

			}
			if (compileType.equals(CompileType.ID)) {
				items.add(CompileType.LOGIC_OPERATOR);
				items.add(CompileType.LINE_BROKER);

			}
			if (compileType.equals(CompileType.LINE_BROKER)) {
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.RESTRICTED_WORD);

			}
			if (compileType.equals(CompileType.LOGIC_OPERATOR)) {
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.LOGIC_OPERATOR);

			}
			if (compileType.equals(CompileType.NUMERIC)) {
				items.add(CompileType.DELIMITATOR);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.LINE_BROKER);

			}
			if (compileType.equals(CompileType.RESTRICTED_WORD)) {
				items.add(CompileType.DELIMITATOR);
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.RESTRICTED_WORD);

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

			if (compileType.equals(CompileType.DELIMITATOR)) {
				items.add(CompileType.DELIMITATOR);
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);

			}
			if (compileType.equals(CompileType.ID)) {
				items.add(CompileType.LOGIC_OPERATOR);
				items.add(CompileType.LINE_BROKER);
				items.add(CompileType.RESTRICTED_WORD);

			}
			if (compileType.equals(CompileType.LINE_BROKER)) {
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.RESTRICTED_WORD);
				items.add(CompileType.DELIMITATOR);

			}
			if (compileType.equals(CompileType.LOGIC_OPERATOR)) {
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.LOGIC_OPERATOR);

			}
			if (compileType.equals(CompileType.NUMERIC)) {
				items.add(CompileType.DELIMITATOR);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.LINE_BROKER);
				items.add(CompileType.ID);

			}
			if (compileType.equals(CompileType.RESTRICTED_WORD)) {
				items.add(CompileType.DELIMITATOR);
				items.add(CompileType.ID);
				items.add(CompileType.NUMERIC);
				items.add(CompileType.RESTRICTED_WORD);

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
