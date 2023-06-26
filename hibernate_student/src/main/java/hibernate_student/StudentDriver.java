package hibernate_student;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		StudentCrud crud = new StudentCrud();
		System.out.println(
				"Enter Choice \n1.Save student \n2.Update student \n3.Delete Stdudent \n4.Fetch student by Id \n5.Fetch all data");

		switch (scanner.nextInt()) {
		case 1: {
			System.out.println("Enter Id");
			int id = scanner.nextInt();
			System.out.println("Enter Name");
			String name = scanner.next();
			System.out.println("Enter Marks");
			int marks = scanner.nextInt();
			System.out.println("Enter Address");
			String address = scanner.next();
			System.out.println("Enter PhoneNo");
			long phno = scanner.nextLong();
			System.out.println("Enter Percentaage");
			double percentage = scanner.nextDouble();

			student.setId(id);
			student.setName(name);
			student.setMarks(marks);
			student.setAddress(address);
			student.setPhno(phno);
			student.setPercentage(percentage);

			crud.insertStudent(student);
			break;
		}

		case 2: {
			System.out.println("Enter Id");
			int id = scanner.nextInt();
			System.out.println("Enter Name");
			String name = scanner.next();
			System.out.println("Enter Marks");
			int marks = scanner.nextInt();
			System.out.println("Enter Address");
			String address = scanner.next();
			System.out.println("Enter PhoneNo");
			long phno = scanner.nextLong();
			System.out.println("Enter Percentaage");
			double percentage = scanner.nextDouble();

			student.setId(id);
			student.setName(name);
			student.setMarks(marks);
			student.setAddress(address);
			student.setPhno(phno);
			student.setPercentage(percentage);

			crud.updateStudent(student, id);
			break;
		}
		case 3: {
			System.out.println("Enter Id");
			int id = scanner.nextInt();

			crud.deleteStudent(id);
			break;
		}
		case 4: {
			crud.fetchStudent(student);
			break;
		}
		case 5: {
			crud.fetchAllStudent(student);
			break;
		}

		}

	}

}
