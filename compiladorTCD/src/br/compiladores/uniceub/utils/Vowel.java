package br.compiladores.uniceub.utils;

public class Vowel {

	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U')
			return true;
		else
			return false;
	}

	public static boolean isVowel(String c) {
		if (c.length() != 1)
			return false;

		if (c == "a" || c == "e" || c == "i" || c == "o" || c == "u" || c == "A" || c == "E" || c == "I" || c == "O"
				|| c == "U")
			return true;
		else
			return false;

	}

}
