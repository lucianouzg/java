package br.compiladores.uniceub.utils;

public class Consonant {

	public static boolean isConsonant(char c) {

		if (c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l'
				|| c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'v'
				|| c == 'w' || c == 'x' || c == 'y' || c == 'z' || c == 'B' || c == 'C' || c == 'D' || c == 'E'
				|| c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N'
				|| c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X'
				|| c == 'Y' || c == 'Z')
			return true;
		else
			return false;
	}

	public static boolean isConsonant(String c) {
		if (c.length() != 1)
			return false;

		if (c == "b" || c == "c" || c == "d" || c == "f" || c == "g" || c == "h" || c == "j" || c == "k" || c == "l"
				|| c == "m" || c == "n" || c == "p" || c == "q" || c == "r" || c == "s" || c == "t" || c == "v"
				|| c == "w" || c == "x" || c == "y" || c == "z" || c == "B" || c == "C" || c == "D" || c == "E"
				|| c == "F" || c == "G" || c == "H" || c == "J" || c == "K" || c == "L" || c == "M" || c == "N"
				|| c == "P" || c == "Q" || c == "R" || c == "S" || c == "T" || c == "V" || c == "W" || c == "X"
				|| c == "Y" || c == "Z")
			return true;
		else
			return false;
	}

}
