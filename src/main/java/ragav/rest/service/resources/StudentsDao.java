package ragav.rest.service.resources;

//import java.util.HashMap;
//import java.util.Map;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentsDao {
	
	public void insertStudent(Student stud) {
		 
        Session session = null;
        Transaction transaction = null;
        try {
            session = SessionUtil.getSession();
            transaction = session.beginTransaction();
            session.save(stud);
            System.out.println("inserted employee: "+stud.getFname() + stud.getLname());
            transaction.commit();
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }
	
	public List<Student> getStudents() {
		Session session = null;
        List<Student> stuList = null;
        try {
            session = SessionUtil.getSession();
            String queryStr = "select stud from Student stud";
            Query query = session.createQuery(queryStr);
            stuList = query.list();
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return stuList;
	}
	
	public Student getStudentById(Long studId) {
		 
        Session session = null;
        Student stud = null;
        try {
            session = SessionUtil.getSession();
            String queryStr = "select stud from Student stud";
            stud = session.get(Student.class, studId);
 
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return stud;
    }
	
}
