
public class TestCommandFacade {

	public static void main(String[] args) {
		
		
		
		WheelscontrolButton controls = new WheelscontrolButton();
		WheelsCommand wheel = new WheelsCommand();
		WheelFacade wf = new WheelFacade();
		
		controls.setCommand(new AllignWheel(wheel));
		controls.buttonPressed();
		wf.startMaintainance();;
		
		controls.setCommand(new BalanceWheel(wheel));
		controls.buttonPressed();		
		wf.completeMaintanance();;
		

	}

}
