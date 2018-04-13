package br.compiladores.uniceub.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio3 { // x = k + n * 2;

	private static String linha, semComentarios;
	private static Scanner ler;
	private static StringBuilder sb;

	public static void execute() {
		ler = new Scanner(System.in);

		sb = new StringBuilder();
		System.out.println("Informe o nome do arquivo texto:\n");
		String nome = ler.nextLine();

		System.out.println("\nConteúdo do arquivo texto:\n");

		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			linha = new String();

			do {
				linha = lerArq.readLine();
				if (linha != null)
					sb.append(removeComentarioSimples(linha));

			} while (linha != null);

			lerArq.close();
			arq.close();

		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());

		}

		System.out.println("Saída sem nenhum comentário simples: \n\n");
		System.out.println(sb.toString());
		System.out.println();

	}

	public static String removeComentarioSimples(String linha) {
		String stringSemComentarios = null;
		String substring = "";
		if (linha.contains("//")) {
			for (int i = 0; i < linha.length(); i++) {
				if (linha.charAt(i) == '/' && linha.charAt(i + 1) == '/')
					substring = linha.substring(linha.charAt(0), linha.charAt(i));

			}
			if (substring != null && substring.length() > 0) {
				linha = substring;
			}

		}
		return stringSemComentarios;
	}

}
