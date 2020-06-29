package Model;

import java.util.Scanner;

import Interface.ISecurityUI;

public class ScannerUI implements ISecurityUI {

	@Override
	public String RequestKeyCard() {
		System.out.println("Slide your key card");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine() ;
	}

	@Override
	public int RequestPinCode() {
		System.out.println("Enter your pin code : ");
		Scanner scanner = new Scanner(System.in);
		return Integer.parseInt(scanner.nextLine()) ;
	}

}
