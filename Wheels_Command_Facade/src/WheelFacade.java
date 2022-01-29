
public class WheelFacade {
	
	
	private WheelTyre wt;
	private TyreFitting tf;
	
	public WheelFacade()
	{
		wt = new WheelTyre();
		tf = new TyreFitting();
	}
	
	public void startMaintainance()
	{
		tf.unplugTyre();
		wt.company();
		wt.size();
	}
	
	public void completeMaintanance()
	{
		tf.plugTyre();
	}
	
	

}
