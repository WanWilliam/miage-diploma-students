package fr.pantheonsorbonne.miage;

public class GenerateFileException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenerateFileException(String string, Exception e) {
		super(string, e);
	}
}