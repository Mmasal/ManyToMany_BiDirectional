package manytomany_bi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import manytomany_bi.dto.App;
import manytomany_bi.dto.User;

public class MainController {
	public static void main(String[] args) {

		User u1 = new User();
		u1.setName("mahesh");
		u1.setPhone(9988776655l);
		u1.setAddress("pune");

		User u2 = new User();
		u2.setName("Akash");
		u2.setPhone(9988776655l);
		u2.setAddress("sangali");

		User u3 = new User();
		u3.setName("vijay");
		u3.setPhone(9988776655l);
		u3.setAddress("karvenagar");

		App a1 = new App();
		a1.setCompany("meta");
		a1.setName("facebook");

		App a2 = new App();
		a2.setCompany("meta");
		a2.setName("whatsApp");

		App a3 = new App();
		a3.setCompany("meta");
		a3.setName("Instagram");

		App a4 = new App();
		a4.setCompany("AkCompany");
		a4.setName("snapchat");

//		List<App> apps = new ArrayList<App>();
//		apps.add(a1);
//		apps.add(a2);
//		apps.add(a3);
//		apps.add(a4);
//		
//
//		List<User> users = new ArrayList<User>();
//		users.add(u1);
//		users.add(u2);
//		users.add(u3);

		List<App> l1 = new ArrayList<App>();
		l1.add(a1);
		l1.add(a2);
		u1.setApps(l1);

		List<App> l2 = new ArrayList<App>();
		l2.add(a1);
		l2.add(a2);
		l2.add(a3);
		l2.add(a4);
		u2.setApps(l2);

		List<App> l3 = new ArrayList<App>();
		l3.add(a1);
		l3.add(a2);
		l3.add(a3);
		l3.add(a4);
		u3.setApps(l3);

		List<User> ul1 = new ArrayList<User>();
		ul1.add(u2);
		ul1.add(u3);

		a1.setUsers(ul1);

		List<User> ul2 = new ArrayList<User>();
		ul2.add(u1);
		ul2.add(u2);
		ul2.add(u3);

		a2.setUsers(ul2);

//		List<User> ul3 = new ArrayList<User>();
//		ul3.add(u1);
//		ul3.add(u2);
//		ul3.add(u3);
		a3.setUsers(ul2);

//		List<User> ul4 = new ArrayList<User>();
//		ul4.add(u1);
//		ul4.add(u2);
//		ul4.add(u3);

		a4.setUsers(ul2);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mahesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

//		entityTransaction.begin();
//		entityManager.persist(u1);
//		entityManager.persist(u2);
//		entityManager.persist(u3);
//		entityManager.persist(a1);
//		entityManager.persist(a2);
//		entityManager.persist(a3);
//		entityManager.persist(a4);
//	    entityTransaction.commit();

//		User user=entityManager.find(User.class, 1);
//		if(user!=null) {
//			System.out.println(user);
//		}else {
//			System.out.println("you entered wrong id");
//		}
//
		 App app=entityManager.find(App.class,1);
		  if(app!=null) {
			  System.out.println(app);
		  }else {
			  System.out.println("Wrong id");
		  }

	}
	 
}
