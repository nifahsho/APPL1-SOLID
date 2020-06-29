package Model;

import Interface.ISecurityUI;

public class KeyCardCheck extends SecurityCheck{
	
	private ISecurityUI securityUI;

	public KeyCardCheck(ISecurityUI securityUI) {
		this.securityUI = securityUI;
	}
	
	private boolean IsValid(String code) {
		return true;
	}
	
	public boolean ValidateUser() {
		String code = securityUI.RequestKeyCard();
		if(IsValid(code)) {
			return true;
		}
		return false;
		
	}

	
	
	
}
