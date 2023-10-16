package com.tha103.artion.merchOrderDetail.model;

import static idv.david.util.Constants.PAGE_MAX_RESULT;

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

public class MerchOrderDetailDAO implements MerchOrderDetailDAO_interface {
	// SessionFactory 為 thread-safe，可宣告為屬性讓請求執行緒們共用
	private SessionFactory factory;

	public MerchOrderDetailVOImpl(SessionFactory factory) {
			this.factory = factory;
		}

	// Session 為 not thread-safe，所以此方法在各個增刪改查方法裡呼叫
	// 以避免請求執行緒共用了同個 Session
	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public int insert(MerchOrderDetailVO merchOrderDetailVO) {
		// 回傳給 service 剛新增成功的自增主鍵值
		return (Integer) getSession().save(merchOrderDetailVO);
	}

	@Override
	public int update(MerchOrderDetailVO merchOrderDetailVO) {
		try {
			getSession().update(merchOrderDetailVO);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public int delete(Integer id) {
		MerchOrderDetailVO merchOrderDetailVO = getSession().get(MerchOrderDetailVO.class, id);
		if (merchOrderDetailVO != null) {
			getSession().delete(merchOrderDetailVO);
			// 回傳給 service，1代表刪除成功
			return 1;
		} else {
			// 回傳給 service，-1代表刪除失敗
			return -1;
		}
	}

	@Override
	public MerchOrderDetailVO getById(Integer id) {
		return getSession().get(MerchOrderDetailVO.class, id);
	}

	@Override
	public List<MerchOrderDetailVO> getAll() {
		return getSession().createQuery("from MerchOrderDetailVO", MerchOrderDetailVO.class).list();
	}

	@Override
	public List<MerchOrderDetailVO> getByCompositeQuery(Map<String, String> map) {
		if (map.size() == 0)
			return getAll();

		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<MerchOrderDetailVO> criteria = builder.createQuery(MerchOrderDetailVO.class);
		Root<MerchOrderDetailVO> root = criteria.from(MerchOrderDetailVO.class);

		List<Predicate> predicates = new ArrayList<>();
//
//		if (map.containsKey("starthiredate") && map.containsKey("endhiredate"))
//			predicates.add(builder.between(root.get("hiredate"), Date.valueOf(map.get("starthiredate")),
//					Date.valueOf(map.get("endhiredate"))));
//
//		if (map.containsKey("startsal") && map.containsKey("endsal"))
//			predicates.add(builder.between(root.get("sal"), new BigDecimal(map.get("startsal")),
//					new BigDecimal(map.get("endsal"))));

		for (Map.Entry<String, String> row : map.entrySet()) {
			if ("merOrder_id".equals(row.getKey())) {
				predicates.add(builder.like(root.get("merOrder_id"), "%" + row.getValue() + "%"));
			}

			if ("merch_id".equals(row.getKey())) {
				predicates.add(builder.equal(root.get("merch_id"), row.getValue()));
			}

			if ("merOrderDetail_quantity".equals(row.getKey())) {
				predicates.add(builder.equal(root.get("merOrderDetail_quantity"), row.getValue()));
			}

			if ("merOrderDetail_price".equals(row.getKey())) {
				predicates.add(builder.equal(root.get("merOrderDetail_price"), row.getValue()));
			}

		}

		criteria.where(builder.and(predicates.toArray(new Predicate[predicates.size()])));
		criteria.orderBy(builder.asc(root.get("empno")));
		TypedQuery<MerchOrderDetailVO> query = getSession().createQuery(criteria);

		return query.getResultList();
	}

	@Override
	public List<MerchOrderDetailVO> getAll(int currentPage) {
		int first = (currentPage - 1) * PAGE_MAX_RESULT;
		return getSession().createQuery("from MerchOrderDetailVO", MerchOrderDetailVO.class).setFirstResult(first)
				.setMaxResults(PAGE_MAX_RESULT).list();
	}

	@Override
	public long getTotal() {
		return getSession().createQuery("select count(*) from MerchOrderDetailVO", Long.class).uniqueResult();
	}

}
