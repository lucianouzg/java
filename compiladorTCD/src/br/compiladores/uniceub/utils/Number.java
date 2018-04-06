package br.compiladores.uniceub.utils;

public class Number {

	public static boolean isNumber(char c) {
		if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9')
			return true;
		else
			return false;
	}

	public static boolean isNumber(String c) {

		if (c.length() != 1)
			return false;

		if (c == "0" || c == "1" || c == "2" || c == "3" || c == "4" || c == "5" || c == "6" || c == "7" || c == "8"
				|| c == "9")
			return true;
		else
			return false;
	}

}
