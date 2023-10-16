package com.tha103.artion.area.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tha103.artion.area.model.AreaVO ;

import util.HibernateUtil;

public class TestHiberateDAO {
	
	public static void main(String[] args) throws Exception {
			
			// 新增
			
			Session session1 = HibernateUtil.getSessionFactory().getCurrentSession();
			try {
				session1.beginTransaction();
				
				AreaVO areaVO = new AreaVO();
//				areaVO.setArea_id(2);
				areaVO.setArea_name("大同區");
				areaVO.setCity_id(2);
				
				session1.save(areaVO);
				
				session1.getTransaction().commit();
				
			} catch (Exception e) {
				session1.getTransaction().rollback();
				e.printStackTrace();
			} finally {
				HibernateUtil.shutdown();
			}
			
			
			// 修改 update
//			SessionFactory factory = HibernateUtil.getSessionFactory();
//			try {
//				Session session2 = factory.openSession();
//				AreaVO areaVO = session2.get(AreaVO.class, );
//				session2.close();
//				
//				// session 已關閉，所以 areaVO 已脫離管理，此時的 set 動作不會反應到資料庫
//				areaVO.setCity_id(3);
//				
//				Session session3 = factory.openSession();
//				Transaction tx = session3.beginTransaction();
//				// 藉由 update 方法讓 areaVO 物件重回到 session 管理
//				session3.update(areaVO);
//				
//				tx.commit();
//				session3.close();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				HibernateUtil.shutdown();
//			}
			
			// 刪除 delete
//			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//			try {
//				session.beginTransaction();
//				
//				AreaVO areaVO = session.get(AreaVO.class, 2);
//				if (areaVO != null)
//					session.delete(areaVO);
//				
//				// 也可以
////				AreaVO areaVO2 = new AreaVO();
////				areaVO2.setArea_id(2);
////				session.delete(areaVO);
//				
//				session.getTransaction().commit();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//				session.getTransaction().rollback();
//			} finally {
//				HibernateUtil.shutdown();
//			}
			
			
			// 查詢
			
//			Session session4 = HibernateUtil.getSessionFactory().getCurrentSession();
//			try {
//				
//				session4.beginTransaction();
//				
//				// 查詢單一欄位可以自行指定結果的資料型別，就無需再從Object做轉型
//				Query<String> query1 = session4.createQuery("select area_name from AreaVo where area_id = 1", String.class);
//				String area_name = query1.uniqueResult();
//				System.out.println(area_name);
//				
//				// 查詢多筆欄位得到Object[]資料型別，需要再自行做轉型處理
//				Query<Object[]> query2 = session4.createQuery("select area_id, area_name from areaVO", Object[].class);
//				List<Object[]> list1 = query2.list();
//				for (Object[] objs : list1) {
//					System.out.println((Integer) objs[0] + " = " + (String) objs[1]);2ist();
////				System.out.println(list2);
//				
//				
//				session4.getTransaction().commit();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//				session4.getTransaction().rollback();
//			} finally {
//				HibernateUtil.shutdown();
//			}
			


	}
}
