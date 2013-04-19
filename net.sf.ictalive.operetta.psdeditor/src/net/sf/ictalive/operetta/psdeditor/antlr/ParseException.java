package net.sf.ictalive.operetta.psdeditor.antlr;

public class ParseException extends Exception {
/*
 * Exception for containing parser exceptions. Necessary because ANTLR's RecognitionException does not contain a
 * readable error message. Instead it must be created with a dynamic method in the Parser, but the exception also
 * doesn't contain a reference to the parser.
 */
	protected String message;
	protected int position;
	
	public ParseException(String message, int position) {
		this.message = message;
		this.position = position;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getPosition() {
		return position;
	}
}