package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		teacher lizzy = new teacher(1, "Lizzy", 500);
		teacher mellisa = new teacher(2, "Mellisa", 700);
		teacher vanderhon = new teacher(3, "Vanderhon", 600);
		
		List<teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhon);
		
		student jishnu = new student(1, "Jishnu", 12);
		student juicy = new student(1, "Juicy", 10);
		student josh = new student(1, "Josh", 8);
		
		List<student> studentList = new ArrayList<>();
		studentList.add(josh);
		studentList.add(juicy);
		studentList.add(jishnu);
		
		school WHS = new school(teacherList, studentList);
		System.out.println("WHS has earned $"+WHS.getTotalMoneyEarned());
		
		jishnu.updateFeesPaid(5000);
		System.out.println("WHS has earned $"+WHS.getTotalMoneyEarned());
		josh.updateFeesPaid(6000);
		System.out.println("WHS has earned $"+WHS.getTotalMoneyEarned());
		
		lizzy.receivedSalary(lizzy.getSalary());
		System.out.println("WHS has spent for salary to " + lizzy.getName()+" and now has "  + WHS.getTotalMoneyEarned());
		
		System.out.println(jishnu);
		System.out.println(lizzy);

	}

}
