package com.hhq.dao.impl;

import org.hhq.framework.ioc.annoation.Repository;

import com.hhq.dao.PaperDAO;

@Repository
public class PaperDAOImpl implements PaperDAO {
	
	public PaperDAOImpl() {
		System.out.println("dao instance");
	}

	@Override
	public void addPaper() {
		System.out.println("添加试卷");
	}

}
