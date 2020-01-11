package inheritance;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetBooks {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Query query=ssn.createQuery("from Book");
		List<Book> booklist=query.list();
        for(Book b:booklist)
	System.out.println(b.getBookid()+" "+b.getAuthor()+" "+b.getTitle()+" "+b.getPrice()+" ");
        ssn.close();
		
		
	}

}
