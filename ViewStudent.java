package one2one;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ViewStudent {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Transaction tx=ssn.beginTransaction();
		Query query=ssn.createQuery("from Address");
		List<Address>addr =query.list();
		for(Address a:addr)
		System.out.println(a.getStudent().getRno()+" "+a.getStudent().getName()+" "+a.getCity());
		ssn.close();

	}

}
