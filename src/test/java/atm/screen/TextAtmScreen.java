package atm.screen;

import atm.MessageState;

public class TextAtmScreen implements AtmScreen {

	public void display(MessageState state) {
		switch (state) {
		case STATE_WELCOME:		
			System.out.println("어서오세요.희수은행입니다. 원하시는 거래를 선택하세요. \n1.현금인출  2.현금입급  3.계좌확인  4.취소");
			break;
		case STATE_INPUT_ACCOUNT:
			System.out.println("계좌번호와 비밀번호를 입력해주세요");
			break;
		case STATE_BYE:
			System.out.println("거래가 종료되었습니다. 안녕히 가세요");
			break;
		default:
			System.out.println("-------------------------");
			break;

		}

	}

}
