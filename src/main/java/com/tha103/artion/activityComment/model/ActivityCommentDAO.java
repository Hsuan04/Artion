package com.tha103.artion.activityComment.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.tha103.artion.activityComment.model.ActivityCommentVO;

import util.HibernateUtil;

public class ActivityCommentDAO implements ActivityCommentDAO_interface {
	public SessionFactory factory;

	public ActivityCommentDAO(SessionFactory factory) {
		this.factory = factory;
	}

	// 取得當前Session
	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override // 新增留言
	public int add(ActivityCommentVO actCom) {
		try {
			getSession().getTransaction().begin();
			Integer id = (Integer) getSession().save(actCom);
			getSession().getTransaction().commit();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			getSession().getTransaction().rollback();
		}
		return -1;
	}

	@Override // 更新留言(暫)
	public int update(ActivityCommentVO actCom) {
		try {
			getSession().getTransaction().begin();
			getSession().update(actCom);
			getSession().getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			getSession().getTransaction().rollback();
		}
		return -1;
	}

	@Override // 透過PK查詢單一活動留言
	public ActivityCommentVO getById(Integer actComId) {
		try {
			getSession().beginTransaction();
			ActivityCommentVO actCom = getSession().get(ActivityCommentVO.class, actComId);
			getSession().getTransaction().commit();
			return actCom;
		} catch (Exception e) {
			e.printStackTrace();
			getSession().getTransaction().rollback();
		}
		return null;
	}

	@Override // 取得所有活動留言
	public List<ActivityCommentVO> getAll() {
		try {
			getSession().beginTransaction();
			List<ActivityCommentVO> list = getSession().createQuery("from activitycomment", ActivityCommentVO.class)
					.list();
			getSession().getTransaction().commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			getSession().getTransaction().rollback();
		}
		return null;
	}

	@Override // 複合查詢條件取得活動留言
	public List<ActivityCommentVO> getByCompositeQuery(Map<String, String> map) {
		if (map.size() == 0)
			return getAll();

		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<ActivityCommentVO> criteria = builder.createQuery(ActivityCommentVO.class);
		Root<ActivityCommentVO> root = criteria.from(ActivityCommentVO.class);
		List<Predicate> predicates = new ArrayList<>();

		// 留言時間排序:新至舊，舊至新
		if (map.containsKey("sortbytime")) {
			if ("newest".equals(map.get("sortbytime"))) {
				criteria.orderBy(builder.desc(root.get("actComTime")));
			} else if ("oldest".equals(map.get("sortbytime"))) {
				criteria.orderBy(builder.asc(root.get("actComTime")));
			}
		}
		// 留言按讚排序:多至少，少至多
		if (map.containsKey("sortbylike")) {
			if ("mostlikes".equals(map.get("sortbylike"))) {
				criteria.orderBy(builder.desc(root.get("actComLike")));
			} else if ("leastlikes".equals(map.get("sortbylike"))) {
				criteria.orderBy(builder.asc(root.get("actComLike")));
			}
		}
		criteria.where(predicates.toArray(new Predicate[0]));
		return null;
	}

	@Override // 取得所有留言數量
	public long getTotal() {
		return getSession().createQuery("select count(*) from activitycomment", Long.class).uniqueResult();
	}

}
