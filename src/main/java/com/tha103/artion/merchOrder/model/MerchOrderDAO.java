package com.tha103.artion.merchOrder.model;

import static idv.david.util.Constants.PAGE_MAX_RESULT;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MerchOrderDAO implements MerchOrderDAO_interface {
	// SessionFactory 為 thread-safe，可宣告為屬性讓請求執行緒們共用
	private SessionFactory factory;

	public MerchOrderDAOImpl(SessionFactory factory) {
			this.factory = factory;
		}

	// Session 為 not thread-safe，所以此方法在各個增刪改查方法裡呼叫
	// 以避免請求執行緒共用了同個 Session
	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public int insert(MerchOrderVO merchOrderVO) {
		// 回傳給 service 剛新增成功的自增主鍵值
		return (Integer) getSession().save(merchOrderVO);
	}

	@Override
	public int update(MerchOrderVO merchOrderVO) {
		try {
			getSession().update(merchOrderVO);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public int delete(Integer id) {
		MerchOrderVO merchOrderVO = getSession().get(MerchOrderVO.class, id);
		if (merchOrderVO != null) {
			getSession().delete(merchOrderVO);
			// 回傳給 service，1代表刪除成功
			return 1;
		} else {
			// 回傳給 service，-1代表刪除失敗
			return -1;
		}
	}

	@Override
	public MerchOrderVO getById(Integer id) {
		return getSession().get(MerchOrderVO.class, id);
	}

	@Override
	public List<MerchOrderVO> getAll() {
		return getSession().createQuery("from MerchOrderVO", MerchOrderVO.class).list();
	}

	@Override
	public List<MerchOrderVO> getByCompositeQuery(Map<String, String> map) {
		if (map.size() == 0)
			return getAll();

		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<MerchOrderVO> criteria = builder.createQuery(MerchOrderVO.class);
		Root<MerchOrderVO> root = criteria.from(MerchOrderVO.class);

		List<Predicate> predicates = new ArrayList<>();

		if (map.containsKey("starthiredate") && map.containsKey("endhiredate"))
			predicates.add(builder.between(root.get("hiredate"), Date.valueOf(map.get("starthiredate")),
					Date.valueOf(map.get("endhiredate"))));

		if (map.containsKey("startsal") && map.containsKey("endsal"))
			predicates.add(builder.between(root.get("sal"), new BigDecimal(map.get("startsal")),
					new BigDecimal(map.get("endsal"))));

		for (Map.Entry<String, String> row : map.entrySet()) {
			if ("merOrderId".equals(row.getKey())) {
				predicates.add(builder.like(root.get("merOrderId"), "%" + row.getValue() + "%"));
			}

			if ("job".equals(row.getKey())) {
				predicates.add(builder.equal(root.get("job"), row.getValue()));
			}

			if ("starthiredate".equals(row.getKey())) {
				if (!map.containsKey("endhiredate"))
					predicates.add(builder.greaterThanOrEqualTo(root.get("hiredate"), Date.valueOf(row.getValue())));
			}

			if ("endhiredate".equals(row.getKey())) {
				if (!map.containsKey("starthiredate"))
					predicates.add(builder.lessThanOrEqualTo(root.get("hiredate"), Date.valueOf(row.getValue())));

			}

			if ("startsal".equals(row.getKey())) {
				if (!map.containsKey("endsal"))
					predicates.add(builder.greaterThanOrEqualTo(root.get("sal"), new BigDecimal(row.getValue())));

			}

			if ("endsal".equals(row.getKey())) {
				if (!map.containsKey("startsal"))
					predicates.add(builder.lessThanOrEqualTo(root.get("sal"), new BigDecimal(row.getValue())));

			}

		}

		criteria.where(builder.and(predicates.toArray(new Predicate[predicates.size()])));
		criteria.orderBy(builder.asc(root.get("merOrderId")));
		TypedQuery<MerchOrderVO> query = getSession().createQuery(criteria);

		return query.getResultList();
	}

	@Override
	public List<MerchOrderVO> getAll(int currentPage) {
		int first = (currentPage - 1) * PAGE_MAX_RESULT;
		return getSession().createQuery("from MerchOrderVO", MerchOrderVO.class).setFirstResult(first)
				.setMaxResults(PAGE_MAX_RESULT).list();
	}

	@Override
	public long getTotal() {
		return getSession().createQuery("select count(*) from MerchOrderVO", Long.class).uniqueResult();
	}

}
