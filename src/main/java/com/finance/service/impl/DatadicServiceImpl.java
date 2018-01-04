package com.finance.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.finance.dao.DatadicDao;
import com.finance.entity.Datadic;
import com.finance.service.DatadicService;
/**
 * 数据字典Service接口实现类
 * @author 赵鹏（zhaopeng）
 *
 */
@Service("datadicService")
public class DatadicServiceImpl implements DatadicService{
	@Resource
	private  DatadicDao datadicDao;

	public List<Datadic> getDatadicIncome() {
		// TODO Auto-generated method stub
		return datadicDao.getDatadicIncome();
	}


	public List<Datadic> getDatadicPay() {
		// TODO Auto-generated method stub
		return datadicDao.getDatadicPay();
	}

	
	public List<Datadic> getDatadicSecurity() {
		// TODO Auto-generated method stub
		return datadicDao.getDatadicSecurity();
	}

	
	public List<Datadic> findDatadic(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return datadicDao.findDatadic(map);
	}

	
	public Long getTotalDatadic(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return datadicDao.getTotalDatadic(map);
	}

	
	public int updateDatadic(Datadic datadic) {
		// TODO Auto-generated method stub
		return datadicDao.updateDatadic(datadic);
	}


	public int addDatadic(Datadic datadic) {
		// TODO Auto-generated method stub
		return datadicDao.addDatadic(datadic);
	}

	
	public int deleteDatadic(Integer id) {
		// TODO Auto-generated method stub
		return datadicDao.deleteDatadic(id);
	}
	
	public List<Datadic> getDatadicname(){
		return datadicDao.getDatadicname();
	}


	public List<Datadic> getDatadicTrade() {
		// TODO Auto-generated method stub
		return datadicDao.getDatadicTrade();
	}
	
}
