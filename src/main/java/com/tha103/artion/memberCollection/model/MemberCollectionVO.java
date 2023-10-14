package com.tha103.artion.memberCollection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.tha103.artion.member.model.MemberVO;
import com.tha103.artion.activity.model.ActivityVO;

@Entity
@Table(name = "membercollection")
public class MemberCollectionVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memCol_serialNumber")	
	private Integer memColSerialNumber;
	
	
	@ManyToOne
	@JoinColumn(name = "mem_id",referencedColumnName = "mem_id")
	private MemberVO memId;
	
	@ManyToOne
	@JoinColumn(name = "act_id",referencedColumnName = "act_id")
	private ActivityVO  actId;
	

	@Column(name = "memCol_status",columnDefinition = "boolean")
	private Boolean memColStatus;
	
	
}
