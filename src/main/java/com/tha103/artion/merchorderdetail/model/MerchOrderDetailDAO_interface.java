package com.tha103.artion.merchOrderDetail.model;

import java.util.List;
import java.util.Map;

public interface MerchOrderDetailDAO_interface {

	int insert(MerchOrderDetailVO merchOrderDetailVO);

	int update(MerchOrderDetailVO merchOrderDetailVO);

	int delete(Integer id);

	MerchOrderDetailVO getById(Integer id);

	List<MerchOrderDetailVO> getAll();

	List<MerchOrderDetailVO> getByCompositeQuery(Map<String, String> map);

	List<MerchOrderDetailVO> getAll(int currentPage);

	long getTotal();
}
