package com.hhq.service.impl;

import org.hhq.framework.ioc.annoation.Autowired;
import org.hhq.framework.ioc.annoation.Service;

import com.hhq.dao.PaperDAO;
import com.hhq.service.PaperService;

@Service("service")
public class PaperServiceImpl implements PaperService {
	
	@Autowired
	private PaperDAO dao;
	
	public PaperServiceImpl() {
		System.out.println("service instance");
	}

	public PaperServiceImpl(PaperDAO dao) {
		this.dao = dao;
	}

	public void setDao(PaperDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void addPaper() {
		dao.addPaper();
	}
}
