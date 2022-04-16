package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class StudentDao {
	
	SessionFactory sf;
	
	public StudentDao() {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		sf=cfg.buildSessionFactory();		
	}
	
	public void addStudent(Student std) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(std);
		tx.commit();
		s.close();
		
	}

	public ArrayList<Student> getAllStd() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return (ArrayList<Student>)s.createQuery("from Student").list();
	}

	public void deleteStd(int sid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student std=s.load(Student.class, sid);
		s.delete(std);
		tx.commit();
		s.close();
		
	}

	public Student getDataById(int sid) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student std=s.load(Student.class, sid);
		return std;
	}

	}
