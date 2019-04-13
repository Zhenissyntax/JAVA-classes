
package HomeWorks;
public class Students {
//	2.  Create a Class called Students
//
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		Students stud1=new Students();
	
		stud1.studentName="John";
		stud1.studentID=777;
		numberOfStudents++;
		
		System.out.println();
		
		Students stud2=new Students();
		stud2.studentID=787;
		stud2.studentName="Mike";
		numberOfStudents++;
		System.out.println();
		Students stud3=new Students();
		stud3.studentID=658;
		stud3.studentName="Jacob";
		numberOfStudents++;
		
		System.out.println("The number of students: "+numberOfStudents);
		
		
	}
}