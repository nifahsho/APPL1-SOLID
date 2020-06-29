package Model;

public class Worker {
	
	private String id;
	private int WorkingHours;

	public Worker(String id) {
		this.id= id;
	}
	
	public void Work(int Hours) {
		WorkingHours += Hours;
	}

	

}
