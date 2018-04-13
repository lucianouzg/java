package br.compiladores.uniceub.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Symbol {

	public static boolean isSpecialCharacter(char c) {
		if (!Vowel.isVowel(c) && !Consonant.isConsonant(c) && !Number.isNumber(c) && !Character.isWhitespace(c))
			return true;
		else
			return false;
	}

	public static boolean isOperadorLogico(char c) {
		if (c == '=' || c == '!' || c == '>' || c == '<')
			return true;
		else
			return false;
	}

	public static boolean isOperadorAritmetico(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/')
			return true;
		else
			return false;
	}

	public static boolean isSpecialCharacter(String c) {
		if (c.length() != 1)
			return false;

		if (!Vowel.isVowel(c) && !Consonant.isConsonant(c) && !Number.isNumber(c) && c.trim().length() > 0)
			return true;
		else
			return false;
	}

	public static boolean isOperadorLogico(String c) {
		if (c.length() != 1)
			return false;

		if (c == "=" || c == "!" || c == ">" || c == "<")
			return true;
		else
			return false;
	}

	public Set<Character> listOfSymbols(String linha) {
		Set<Character> charactersFound = new HashSet<>();

		for (char c : linha.toCharArray()) {
			if (isSpecialCharacter(c) && !charactersFound.contains(c))
				charactersFound.add(c);
		}
		return charactersFound;
	}

	public static boolean isOperadorAritmetico(String c) {
		if (c.length() != 1)
			return false;

		if (c == "+" || c == "-" || c == "*" || c == "/")
			return true;
		else
			return false;
	}
}
