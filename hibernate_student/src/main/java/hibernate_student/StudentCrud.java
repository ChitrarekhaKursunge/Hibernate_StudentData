package hibernate_student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_student.Student;

public class StudentCrud {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("anjali");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;

	}

	public void insertStudent(Student student) {

		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public void updateStudent(Student student, int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student dbStudent = entityManager.find(Student.class, 1);
		if (dbStudent != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		} else {
			System.out.println("Id is not present");
		}

	}

	public void deleteStudent(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student dbStudent = entityManager.find(Student.class, 2);
		if (dbStudent != null) {
			entityTransaction.begin();
			entityManager.remove(dbStudent);
			entityTransaction.commit();
		} else {
			System.out.println("Id is not present");
		}

	}

	public void fetchStudent(Student student) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student dbStudent = entityManager.find(Student.class, 1);
		System.out.println(dbStudent);

	}

	public void fetchAllStudent(Student student) {
		EntityManager entityManager = getEntityManager();

		Query query = entityManager.createQuery("SELECT s FROM Student s");
		List<Student> students = query.getResultList();
		System.out.println(students);
	}

}
