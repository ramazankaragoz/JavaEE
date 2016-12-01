package tr.com.ramazan.myhibernate;

import javax.transaction.Synchronization;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.engine.transaction.spi.LocalStatus;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DataInsertion {

	public static void main(String[] args) {
		new DataInsertion().removeInfo();
	}
	
	public void insertInfo()
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory SF=con.buildSessionFactory();
		
		org.hibernate.Session session=SF.openSession();
		
		DataProvider provider=new DataProvider();
		
		provider.setUser_id(12);
		provider.setUser_name("Elmas");
		provider.setUser_address("Seker Mah 1434.sok 18/13");
		
		Transaction TR=session.beginTransaction();
		session.save(provider);
		
		System.out.println("Object save successfully.");
		
		TR.commit();
		session.close();
		SF.close();
	}
	
	public void getInfo()
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory SF=con.buildSessionFactory();
		
		org.hibernate.Session sesion=SF.openSession();
		
		Object ob=sesion.load(DataProvider.class, new Integer (7));
		DataProvider provider=(DataProvider) ob;
		
		System.out.println("ID: "+provider.getUser_id()+" Name: "+provider.getUser_name()+" Address: "+provider.getUser_address());
		sesion.close();
		SF.close();
	}
	
	public void removeInfo()
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory=con.buildSessionFactory(registry);
		org.hibernate.Session session=sessionFactory.openSession();
		
		Transaction TR=session.beginTransaction();
		
		Object ob=session.load(DataProvider.class,new Integer(7));
		session.delete(ob);
		
		System.out.println("Object remove successfully.");
		TR.commit();
		session.close();
		sessionFactory.close();
	}

}
