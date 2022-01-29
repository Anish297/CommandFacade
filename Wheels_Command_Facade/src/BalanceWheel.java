public class BalanceWheel implements CommandWheels {
	
	WheelsCommand wheel;
	public BalanceWheel(WheelsCommand wheel)
	{
		this.wheel=wheel;
	}
	public void executeCommand()
	{
		wheel.balancingWheel();;
	}

}
