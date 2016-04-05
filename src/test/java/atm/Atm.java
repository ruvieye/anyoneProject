package atm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import atm.exception.AtmException;
import atm.exception.AtmExceptionType;
import atm.screen.AtmScreen;

/**
 * @author heesu
 *
 */
public class Atm {
	private static final Logger LOG = LoggerFactory.getLogger(Atm.class);

	// 상태체크 딜레이 초
	// private final int CHECK_DELAY_SECOND = 5;

	// 싱글스레드로 동작하는 스케쥴러
	// private ScheduledThreadPoolExecutor schedular = new
	// ScheduledThreadPoolExecutor(1);

	private AtmScreen atmScreen;

	public void setAtmScreen(AtmScreen atmScreen) {
		this.atmScreen = atmScreen;
	}

	/**
	 * ATM이 구동하는 최초 실행 메서드 생성자에서 자동실행해도 괜찮고 main 에서 실행하는것도 좋다
	 */
	public void start() {

		LOG.debug("ATM 시스템을 구동합니다...");
		try {
			checkSelfStatus();
			atmScreen.display(MessageState.STATE_WELCOME);
			//

		} catch (AtmException atme) {
			LOG.error("ATM 시스템에 문제가 있습니다.{}", atme.getMessage());

		} catch (Exception e) {
			LOG.error("ATM 시스템에 문제가 있습니다. 관리자에게 문의하세요.", e);

		}

		// TODO 자신의 상태를 모니터링 하는 기능도 필요하겠지 ?
		// schedular.scheduleAtFixedRate(new Runnable() {
		// public void run() {
		// checkSelfStatus();
		// }
		// }, 0, CHECK_DELAY_SECOND, TimeUnit.SECONDS);

	}

	/**
	 * ATM이 스스로 자신의 상태를 체크해서 작동이 가능한지 확인이 필요함. 5초마다 체크하는 정도면 충분하겠지요.
	 */
	public void checkSelfStatus() {
		// 1.데이터 베이스 연결이 원활한지 체크 (실제라면 은행과 통신이 가능한지 확인 필요함)
		if (checkServerConnection() == false) {
			throw new AtmException(AtmExceptionType.ERROR_CANNOT_CONNECT_SERVER);
		}

		// 2. 거래잔액이 충분한지 체크
		if (checkRemainBalance() == false) {
			throw new AtmException(AtmExceptionType.ERROR_NOT_ENOUGH_CASH);
		}

	}

	// TODO 여기에 데이터베이스 상태체크
	private boolean checkServerConnection() {
		return true;
	}

	// TODO 여기에 잔액체크
	private boolean checkRemainBalance() {
		return true;
	}
}
