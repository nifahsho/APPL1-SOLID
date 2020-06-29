package Main;

import Model.Employee;
import Model.RechargeStation;
import Model.Robot;
import Model.Worker;

public class main {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Id_Employee");
		Robot robot = new Robot("Id_Robot", 3000);
		
		employee.Work(6);
		robot.Work(8);
		employee.Sleep();
		robot.Recharge();;
	}
}
