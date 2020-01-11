package hbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmpDelete {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Transaction tx=ssn.beginTransaction();
		Employee emp=(Employee) ssn.get(Employee.class,103);
		ssn.delete(emp);
	    tx.commit();
	    ssn.close();
	}

}
