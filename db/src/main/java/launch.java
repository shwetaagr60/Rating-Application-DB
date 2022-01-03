import java.util.Scanner;

import db.Students;
import model.Record;

public class launch {
	public static void main(String ar[])
	{
//		addRecord();  Run this Once
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while(choice == 1 || choice == 2)
		{
			System.out.println("1.Enter Student Name \n 2.Enter Subject Name \n 3.Exit \n Enter Choice");
			choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1)
			{
				System.out.println("Enter Student Name : ");
				String name = sc.nextLine();	
				Students db = new Students();
				db.doConnection();
				db.getStudentData(name);
				db.closeConnection();
			}
			else if(choice == 2)
			{
				System.out.println("Enter Subject Name : ");
				String name = sc.nextLine();	
				Students db = new Students();
				db.doConnection();
				db.getSubjectData(name);
				db.closeConnection();
			}
			else
				break;
			
		}
	}
	private static void addRecord() {
		Students db = new Students();
		db.doConnection();
		db.addRecord(createRecord("Ananth", "Electro Fields", "test_1", "21-Jul-16", 100.0f));
		db.addRecord(createRecord("Bhagath", "Electro Fields", "test_1", "21-Jul-16", 78.0f));
		db.addRecord(createRecord("Chaya", "Electro Fields", "test_1", "21-Jul-16", 68.0f));
		db.addRecord(createRecord("Esharath", "Electro Fields", "test_1", "21-Jul-16", 87.0f));
		db.addRecord(createRecord("Bhagath", "Electro Fields", "quiz_1", "22-Jul-16", 20));
		db.addRecord(createRecord("Chaya", "Electro Fields", "lab_1", "23-Jul-16", 10));
		db.addRecord(createRecord("Ananth", "Electro Fields", "project_1", "24-Jul-16", 100));
		db.addRecord(createRecord("Davanth", "Electro Fields", "project_1", "24-Jul-16", 100));
		db.addRecord(createRecord("Bhagath", "Electro Fields", "quiz_2", "25-Jul-16", 50));
		db.addRecord(createRecord("Ananth", "Electro Fields", "quiz_1", "26-Jul-16", 100));
		db.addRecord(createRecord("Bhagath", "Electro Fields", "lab_1", "27-Jul-16", 10));
		db.addRecord(createRecord("Chaya", "Electro Fields", "project_1", "28-Jul-16", 100));
		db.addRecord(createRecord("Bhagath", "Electro Fields", "project_1", "28-Jul-16", 100));
		db.addRecord(createRecord("Ananth", "Computing Techniques", "test_1", "29-Jul-16", 86));
		db.addRecord(createRecord("Ananth", "Electro Fields", "quiz_2", "29-Jul-16", 100));
		db.addRecord(createRecord("Bhagath", "Computing Techniques", "project_1", "30-Jul-16", 100));
		db.addRecord(createRecord("Ananth", "Electro Fields", "lab_1", "30-Jul-16", 100));
		db.addRecord(createRecord("Chaya", "Computing Techniques", "quiz_1", "31-Jul-16", 20));
		db.addRecord(createRecord("Ananth", "Electro Fields", "test_2", "1-Aug-16", 100));
		db.addRecord(createRecord("Chaya", "Electro Fields", "test_2", "1-Aug-16", 92));
		db.closeConnection();
	}
	private static Record createRecord(String studentName, String subjectName, String ac, String dos, float points )
	{
		Record temp = new Record();
		temp.setStudentName(studentName);
		temp.setAssignmentCategory(ac);
		temp.setDateOfSubmission(dos);
		temp.setPoints(points);
		temp.setSubjectName(subjectName);
		return temp;
	}
}
