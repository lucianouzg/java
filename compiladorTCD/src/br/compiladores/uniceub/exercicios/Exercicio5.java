package br.compiladores.uniceub.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.compiladores.uniceub.utils.Consonant;
import br.compiladores.uniceub.utils.Number;
import br.compiladores.uniceub.utils.Symbol;
import br.compiladores.uniceub.utils.Vowel;

public class Exercicio5 { // x = k - n / 2;

	private static String linha, semComentarios;
	private static Scanner ler;
	private static StringBuilder sb;
	private static List<Character> identificadores, operadorAtribuicao, operadorAritmetico, numeros, delimitadores;

	public static void execute() {
		cleanUp();
		ler = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo texto:\n");
		String nome = ler.nextLine();
		System.out.println("\nConteúdo do arquivo texto:\n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			linha = new String();
			do {
				linha = lerArq.readLine();
				if (linha != null) {

					if (identificadorDuplicado(linha)) {
						System.out.println(
								"\n\n Identificadores duplicados não são permitidos! \n\n Padrão: x = k - n / 2;\n\n");
					}

					if (linha.contains("-/") || linha.contains("- /") || linha.contains("- *") || linha.contains("-*")
							|| linha.contains("+-") || linha.contains("-+") || linha.contains("+*")
							|| linha.contains("*+") || linha.contains("+/") || linha.contains("/+")
							|| linha.contains("*/") || linha.contains("/*") || linha.contains("+ -")
							|| linha.contains("- +") || linha.contains("+ *") || linha.contains("* +")
							|| linha.contains("+ /") || linha.contains("/ +") || linha.contains("* /")
							|| linha.contains("/ *") || linha.contains("+ +") || linha.contains("++")
							|| linha.contains("--") || linha.contains("- -") || linha.contains("**")
							|| linha.contains("* *") || linha.contains("//") || linha.contains("/ /")) {
						System.out.println(
								"\n\n Operadores duplicados ou não adequadamente inseridos! \n\n Padrão: x = k - n / 2;\n\n");
					}

					if (!validaExpressao(linha)) {
						System.out.println(
								"\n\n A expressão foi digitada de modo incorreto! \n\n Padrão: x = k + n * 2;\n\n");
					}
				}
			} while (linha != null);
			applicationToString();
			lerArq.close();
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
		}
	}

	public static boolean identificadorDuplicado(String linha) {
		String linhaTrim = linha.replaceAll(" ", "");
		char[] linhaChars = linhaTrim.toCharArray();

		for (int i = 0; i < linhaChars.length; i++) {
			if (Consonant.isConsonant(linhaTrim.charAt(i)) || Vowel.isVowel(linhaTrim.charAt(i))) {
				if (Consonant.isConsonant(linhaTrim.charAt(i + 1)) || Vowel.isVowel(linhaTrim.charAt(i + 1))) {
					return true;
				}
			}

		}
		return false;

	}

	public static boolean validaExpressao(String linha) {
		char[] linhaChars = linha.toCharArray();

		for (

		Character char1 : linhaChars) {

			if (Character.isWhitespace(char1))
				continue;
			if (Number.isNumber(char1)) {
				numeros.add(char1);
				continue;
			}
			if (Symbol.isOperadorAritmetico(char1)) {
				operadorAritmetico.add(char1);
				continue;
			}
			if (Vowel.isVowel(char1) || Consonant.isConsonant(char1)) {
				identificadores.add(char1);
				continue;
			}
			if (char1 == ';') {
				delimitadores.add(char1);
				continue;
			}
			if (Symbol.isOperadorLogico(char1) && char1 == '=') {
				operadorAtribuicao.add(char1);
				continue;
			}

		}

		if ((numeros.size() + identificadores.size()) > 4 || operadorAritmetico.size() > 2
				|| operadorAtribuicao.size() > 1) {
			return false;
		}
		return true;
	}

	private static void applicationToString() {
		StringBuilder strB = new StringBuilder();
		strB.append("\n-------lexema-------||------token type------\n");

		for (Character char1 : numeros) {
			strB.append("------- " + char1 + " -------||------ Número ------\n");
		}
		for (Character char1 : operadorAritmetico) {
			strB.append("------- " + char1 + " -------||------ Operador Aritmético ------\n");
		}
		for (Character char1 : operadorAtribuicao) {
			strB.append("------- " + char1 + " -------||------ Operador de Atribuição ------\n");
		}
		for (Character char1 : identificadores) {
			strB.append("------- " + char1 + " -------||------ Identificador ------\n");
		}
		for (Character char1 : delimitadores) {
			strB.append("------- " + char1 + " -------||------ Delimitador ------\n");
		}
		System.out.println(strB.toString());
	}

	private static void cleanUp() {
		identificadores = new ArrayList<>();
		numeros = new ArrayList<>();
		operadorAritmetico = new ArrayList<>();
		operadorAtribuicao = new ArrayList<>();
		delimitadores = new ArrayList<>();
		sb = new StringBuilder();
	}

}
