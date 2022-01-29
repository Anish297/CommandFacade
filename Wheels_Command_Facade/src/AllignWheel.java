
public class AllignWheel implements CommandWheels {
	
	WheelsCommand wheel;
	public AllignWheel(WheelsCommand wheel)
	{
		this.wheel=wheel;
	}
	public void executeCommand()
	{
		wheel.allignWheel();
	}

}
