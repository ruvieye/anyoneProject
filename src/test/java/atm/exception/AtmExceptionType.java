package atm.exception;

public enum AtmExceptionType {
	ERROR_GENERAL("정의하지않은 예외 발생."),    //
	ERROR_CANNOT_CONNECT_SERVER("서버에 연결할 수 없습니다."), //
	ERROR_NOT_ENOUGH_CASH("잔액이 부족합니다.");

	
	private String message;
	
	AtmExceptionType(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
