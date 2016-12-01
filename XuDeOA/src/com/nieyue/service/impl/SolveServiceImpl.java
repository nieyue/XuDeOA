package com.nieyue.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nieyue.bean.Solve;
import com.nieyue.dao.SolveDao;
import com.nieyue.service.SolveService;
@Service("solveService")
public class SolveServiceImpl implements SolveService{
	@Resource
	SolveDao solveDao;

	@Override
	public boolean addSolve(Solve solve) {
		solve.setCreateDate(new Date());
		boolean b = solveDao.addSolve(solve);
		return b;
	}

	@Override
	public boolean delSolve(Integer solveId) {
		boolean b = solveDao.delSolve(solveId);
		return b;
	}

	@Override
	public boolean updateSolve(Solve solve) {
		boolean b = solveDao.updateSolve(solve);
		return b;
	}

	@Override
	public Solve loadSolve(Integer solveId) {
		Solve r = solveDao.loadSolve(solveId);
		return r;
	}

	@Override
	public int countAll() {
		int c = solveDao.countAll();
		return c;
	}

	@Override
	public List<Solve> browsePagingSolve(int pageNum, int pageSize,
			String orderName, String orderWay) {
		if(pageNum<1){
			pageNum=1;
		}
		if(pageSize<1){
			pageSize=0;//没有数据
		}
		List<Solve> l = solveDao.browsePagingSolve(pageNum-1, pageSize, orderName, orderWay);
		return l;
	}

	
}
