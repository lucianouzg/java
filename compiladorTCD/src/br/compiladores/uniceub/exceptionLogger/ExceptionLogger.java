package br.compiladores.uniceub.exceptionLogger;

import java.util.Optional;

public class ExceptionLogger {

	public static void warnningLog(String severity, Object typeClass, Optional<Exception> optionalException,
			String actionMethod, Optional<String> optionalReason) {

		StringBuilder sb = new StringBuilder();
		sb.append("\n*\n*\n* > [WARNING] typed by: ");
		sb.append(severity);
		sb.append(", on Class: ");
		sb.append(typeClass.toString());
		sb.append(" when executing: ");
		sb.append(actionMethod);

		if (optionalException.isPresent()) {
			sb.append(". \n > Capted reason:");
			sb.append(optionalReason.get());
			sb.append(" (CAPTED USER MESSAGE) \n\n");
		}

		if (optionalException.isPresent()) {
			sb.append(". \n Capted exception:");
			sb.append(optionalException.get().getClass());
			sb.append(optionalException.get().getCause());
			sb.append("\n\n > Complete message:\n");
			sb.append(optionalException.get().getMessage() + "\n\n\n Log Message End.");
		}

		System.out.println(sb.toString());

	}

}
