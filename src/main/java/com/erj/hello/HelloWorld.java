package com.erj.hello;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.erj.persistence.HibernateUtil;

public class HelloWorld {
	public static void main(String [] args){
		
		//First Unit of Work
		Session firstSession = HibernateUtil.getSessionFactory().openSession();
		Transaction firstTransaction = firstSession.beginTransaction();
		
		Message message = new Message("Hello, World!");
		Long msgId = (Long)firstSession.save(message);
		
		System.out.println("Saved message with id: " + msgId);
		
		firstTransaction.commit();
		firstSession.close();
		
		
		//Second Unit of Work
		Session secondSession = HibernateUtil.getSessionFactory().openSession();
		Transaction secondTransaction = secondSession.beginTransaction();
		
		List messages = secondSession.createQuery("from Message m order by m.text asc").list();
		
		System.out.println(messages.size() + " message(s) were found:");
		
		for(Iterator iter = messages.iterator(); iter.hasNext();){
			Message loadedMsg = (Message) iter.next();
			System.out.println(loadedMsg.getText());
		}
		
		secondTransaction.commit();
		secondSession.close();
		
		HibernateUtil.shutdown();
		
	}
}
