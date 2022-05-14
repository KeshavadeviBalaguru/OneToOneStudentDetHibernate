package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {
public static void main(String[] args) {
	
	Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);	
    ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
    SessionFactory sf=conn.buildSessionFactory(reg);
    Session sess=sf.openSession();
   Transaction tx=sess.beginTransaction();
	
	Address aadd=new Address();
	aadd.setAddid(1001);
	aadd.setCountry("India");
	aadd.setPincode(609609);
	aadd.setStreet("New Street");
	aadd.setState("Pondicherry");
	sess.save(aadd);
	
	Student st=new Student();
	st.setRollnum(1);
	st.setSname("Anitha");
	st.setAddid(aadd);
	sess.save(st);
	sess.close();
	tx.commit();
	
}
}
