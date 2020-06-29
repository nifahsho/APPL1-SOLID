package Model;

import Interface.IRechargeable;

public class RechargeStation {
	public void Recharge(IRechargeable rechargeable) {
		rechargeable.Recharge();;
	}
}
