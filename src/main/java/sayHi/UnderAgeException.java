package sayHi;

public class UnderAgeException extends Exception {
	private static final long serialVersionUID = -7990395458354141240L;

	/**
	 * 
	 */
	public UnderAgeException() {
		super("Parent is too young");
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message) {
		super(message);
	}
	
}
