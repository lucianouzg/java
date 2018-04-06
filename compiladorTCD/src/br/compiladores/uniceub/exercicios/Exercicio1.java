package br.compiladores.uniceub.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	private static String value, palavraSemEspaco;
	private static Scanner scanner;
	private static int qntBranco, qntCaracteres;

	public static void execute() {
		scanner = new Scanner(System.in);
		System.out.println("Digite o texto:");
		value = scanner.nextLine();
		StringBuilder sb = new StringBuilder();

		qntCaracteres = value.length();
		palavraSemEspaco = value.replace(" ", "");
		qntBranco = value.length() - palavraSemEspaco.length();

		sb.append("Total de caracteres encontrados: ");
		sb.append(qntCaracteres + "\n");
		sb.append("Total de espaços em branco encontrados: ");
		sb.append(qntBranco + "\n");
		sb.append("Palavra sem espaços: ");
		sb.append(palavraSemEspaco + "\n");

		System.out.println(sb.toString());
	}

}
