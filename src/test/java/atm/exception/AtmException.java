package atm.exception;

public class AtmException extends RuntimeException{
	public AtmException(AtmExceptionType type){
		super(type.getMessage());
			
	}
	
	public AtmException(String message){
		super(message);
	}
}
