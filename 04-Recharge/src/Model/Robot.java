package Model;

import Interface.IRechargeable;

public class Robot extends Worker implements IRechargeable{
	
	private int Capacity;
	private int CurrentPower;
	
	public Robot(String id, int Capacity) {
		super(id);
		this.Capacity = Capacity;
	}

	@Override
	public void Recharge() {
		this.CurrentPower = CurrentPower;
		
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public int getCurrentPower() {
		return CurrentPower;
	}

	public void setCurrentPower(int currentPower) {
		CurrentPower = currentPower;
	}
	
	public void Work(int Hours) {
		if(Hours > CurrentPower) {
			Hours = CurrentPower;
		}
		super.Work(Hours);
		this.CurrentPower -= Hours;
	}
	
}
