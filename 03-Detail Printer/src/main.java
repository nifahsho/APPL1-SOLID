import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) {
		
			Employee employee = new Employee("Employee name");
			Manager manager = new Manager("Manager name", new ArrayList<String>());
			
			List<Employee> Employees = new ArrayList<>();
			Employees.add(employee);
			Employees.add(manager);
			
			DetailsPrinter printer = new DetailsPrinter(Employees);
			printer.printDetails();
	}
}
