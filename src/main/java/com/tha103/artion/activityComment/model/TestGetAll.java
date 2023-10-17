package com.tha103.artion.activityComment.model;

import org.hibernate.Session;

import util.HibernateUtil;

public class TestGetAll {
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	try {
		session.beginTransaction();
		
		ActivityCommentVO actCom = session.get(ActivityCommentVO.class, 1);
		System.out.println(actCom);
		
		session.getTransaction().commit();
		
	} catch (Exception e) {
		e.printStackTrace();
		session.getTransaction().rollback();
	} finally {
		HibernateUtil.shutdown();
	}
	
}
}
