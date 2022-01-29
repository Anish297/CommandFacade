
public class WheelscontrolButton {
	
	CommandWheels button;
	public WheelscontrolButton() {}
	public void setCommand(CommandWheels command)
	{
		button = command;
	}
	public void buttonPressed()
	{
		button.executeCommand();
	}

}
