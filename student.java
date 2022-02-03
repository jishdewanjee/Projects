package schoolManagementSystem;

/**
 * Class is responsible for the keeping
 * of track of students
 * track of students fees, name, id, grade, fees paid
 * @author Jishnu
 *
 */

public class student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 30000;
	}
	
	public void updateFeesPaid(int fees) {
		feesPaid += fees;
		school.updateTotalMoneyEarned(fees);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() 
	{
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	
	/*
	 * Returns remaining fees
	 */
	
	public int getRemainingFees() {

		return feesTotal-feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name: "+name+
				" Total Fees paid so far: " + feesPaid+ 
				" Fees Remaining: " +feesTotal; 
	}

}
