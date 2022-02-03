package schoolManagementSystem;

import java.util.List;

public class school {
	
	private List<teacher> Teachers;
	private List<student> Students;
	private static int totalMoneyEarned;	//with static we can access the method
	private static int totalMoneySpent;
	
	/*
	 * New school object is created
	 */
	
	
	public school(List<teacher> teachers, List<student> students) {
		Teachers = teachers;
		Students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	public List<teacher> getTeachers() {
		return Teachers;
	}
	
	/*
	 * Adds a teacher to the school
	 */

	public void addTeachers(teacher Teacher) {
		Teachers.add(Teacher);
	}
	
	/*
	 * Returns the list of students in the school
	 */

	public List<student> getStudents() {
		return Students;
	}
	
	/*
	 * Add a student to the school
	 */

	public void addStudents(student student) {
		Students.add(student);
	}
	
	/*
	 * Returns the total money earned by the school
	 */

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/*
	 * Adds total money earned by the school
	 */

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/*
	 * Update the money that is spent by the school which is the salary
	 *  given by the school to its teachers.
	 */

	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned-=MoneySpent;
	}
	
	
	

}
