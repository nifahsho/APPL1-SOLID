package Main;

import Model.KeyCardCheck;
import Model.PinCodeCheck;
import Model.ScannerUI;
import Model.SecurityCheck;
import Model.SecurityManager;

public class main {
	
	public static void main(String[] args) {
		
		ScannerUI scannerui = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerui);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerui);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.Check();
	}
}
