package com.tha103.artion.activityComment.model;

import java.util.List;
import java.util.Map;

public interface ActivityCommentDAO_interface {
	int add(ActivityCommentVO actCom);

	int update(ActivityCommentVO actCom);
	 
	ActivityCommentVO getById(Integer actComId);
	
	List<ActivityCommentVO> getAll();
	
	List<ActivityCommentVO> getByCompositeQuery(Map<String, String> map);
	
	long getTotal();
}
