package one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class One2OneApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Transaction tx=ssn.beginTransaction();
		
		Student std=new Student();
		std.setRno(104);
		std.setName("Tchalla");
		
		Address addr=new Address();
		addr.setAddressid(16);
		addr.setCity("wakanda");
		addr.setStudent(std);
		ssn.save(addr);
		tx.commit();
		ssn.close();
		

	}

}
