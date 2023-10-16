package com.tha103.artion.activityComment.model;

import org.hibernate.Session;

import util.HibernateUtil;

public class ActivityCommentDAO implements ActivityCommentDAO_interface{
	public int add(ActivityCommentVO actCom) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	try {
		session.beginTransaction();
		Integer actComId = ()
	}
	}
}
