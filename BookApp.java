package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class BookApp {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		Transaction tx=ssn.beginTransaction();
		
		Book book=new Book();
		book.setBookid(1001);
		book.setAuthor("aaa");
		book.setPrice(2000);
		book.setTitle("Java");
		
JavaBook javabook=new JavaBook();
javabook.setBookid(1002);
javabook.setAuthor("bbb");
javabook.setTitle("dotnet");
javabook.setDiscount(30);
javabook.setPrice(5000);

DotNetBook dotnet=new DotNetBook();
dotnet.setBookid(1003);
dotnet.setAuthor("sowkhya");
dotnet.setTitle("dotnet");
dotnet.setPrice(10000);
dotnet.setCds(3);

ssn.save(book);
ssn.save(javabook);
ssn.save(dotnet);
	
	tx.commit();
	ssn.close();
	}

}
