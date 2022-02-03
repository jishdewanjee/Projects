package schoolManagementSystem;

public class teacher {
	
	private int id;
	private String name;
	private int salary;
	private static int salaryEarned;
	
	public teacher(int id, String name, int salary) {
		this.id =id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public static void receivedSalary(int salary) {
		salaryEarned += salary;
		school.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "Name of the Teacher: "+name+" Total salary earned so far $"+salaryEarned;
	}
	
}
