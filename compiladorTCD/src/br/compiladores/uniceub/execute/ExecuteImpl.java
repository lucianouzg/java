package br.compiladores.uniceub.execute;

import java.util.Scanner;

public class ExecuteImpl implements CompileReader {

	@Override
	public Scanner reader() {
		return new Scanner(System.in);
	}

}
