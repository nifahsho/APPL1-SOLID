package Model;

import java.util.Scanner;

public class SecurityManager {
	
	private KeyCardCheck keyCardCheck;
	private PinCodeCheck pinCodeCheck;
	
	public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck) {
		this.keyCardCheck = keyCardCheck;
		this.pinCodeCheck = pinCodeCheck;
	}
	
	public void Check() {
		System.out.println("Choose option: 1 - KeyCard, 2 - PinCode:");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        
        switch(option) {
            case 1:
            	System.out.println(this.keyCardCheck.ValidateUser());
                break;
            case 2:
            	System.out.println(this.pinCodeCheck.ValidateUser());
                break;
        }
    }	
	
}
