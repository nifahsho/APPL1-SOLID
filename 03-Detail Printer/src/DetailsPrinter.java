import java.util.List;

public class DetailsPrinter {
	
	private List<Employee>EmployeeList;

	public DetailsPrinter(List<Employee> EmployeeList) {
		this.EmployeeList = EmployeeList;
	}
	
	   public void printDetails(){
	        for(Employee employee : EmployeeList){
	            System.out.println(employee.toString());
	        }

     }
	
	
}
