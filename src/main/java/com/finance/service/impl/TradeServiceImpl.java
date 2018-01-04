package com.finance.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.finance.dao.TradeDao;
import com.finance.entity.Trade;
import com.finance.service.TradeService;
import com.finance.util.DateUtil;

/**
 * 收入Service实现类
 * 
 * @author Administrator
 */
@Service("tradeService")
public class TradeServiceImpl implements TradeService{

	@Resource
	private TradeDao tradeDao;
	
	
	public List<Trade> findTrade(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tradeDao.findTrade(map);
	}


	public Long getTotalTrade(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tradeDao.getTotalTrade(map);
	}

	

	public int addTrade(Trade trade) {
		// TODO Auto-generated method stub
		trade.setMoney(trade.getPrice()*trade.getNumber());
		trade.setCreatetime(DateUtil.getCurrentDateStr());
		return tradeDao.addTrade(trade);
	}


	public int updateTrade(Trade trade) {
		// TODO Auto-generated method stub
		trade.setMoney(trade.getPrice()*trade.getNumber());
		trade.setUpdatetime(DateUtil.getCurrentDateStr());
		return tradeDao.updateTrade(trade);
	}


	public int deleteTrade(Integer id) {
		// TODO Auto-generated method stub
		return tradeDao.deleteTrade(id);
	}


	

}
