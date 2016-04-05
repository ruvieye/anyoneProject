package atm;

import atm.screen.TextAtmScreen;

public class AtmMainTest {

	public static void main(String args[]){
		
		Atm atm = new Atm();
		atm.setAtmScreen(new TextAtmScreen());
		atm.start();
		
	}
}
