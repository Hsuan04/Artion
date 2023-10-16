package com.tha103.artion.ticketOrderDetail.model;

import java.util.List;
import java.util.Map;

public interface TicketOrderDetailDAO_interface {

	int insert(TicketOrderDetailVO ticketOrderDetailVO);

	int update(TicketOrderDetailVO ticketOrderDetailVO);

	int delete(Integer id);

	TicketOrderDetailVO getById(Integer id);

	List<TicketOrderDetailVO> getAll();

	List<TicketOrderDetailVO> getByCompositeQuery(Map<String, String> map);

	List<TicketOrderDetailVO> getAll(int currentPage);

	long getTotal();

}
