package com.finance.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.finance.dao.DatabaseDao;
import com.finance.entity.Database;
import com.finance.service.DatabaseService;

/**
 * 数据库管理层的service实现类
 * @author 赵鹏（zhaopeng）
 *
 */
@Service("databaseService")
public class DatabaseServiceImpl implements DatabaseService{
	
	@Resource
	private DatabaseDao databaseDao;
	
	public List<Database> findDataBack(Map<String, Object> map) {
		return databaseDao.findDataBack(map);
	}
	
	public Long getDataBackTotal(Map<String, Object> map) {
		return databaseDao.getDataBackTotal(map);
	}

	public int addDatabase(Database database) {
		return databaseDao.addDatabase(database);
	}
	
	public int deleteDatabase(Integer id) {
		return databaseDao.deleteDatabase(id);
	}
	
	public int truncateTable(@Param("tablename") String tablename){
		return databaseDao.truncateTable(tablename);
	}
	
	public int deleteOrderdata(@Param("tablename") String tablename,@Param("startid") Integer startid,@Param("endid") Integer endid){
		return databaseDao.deleteOrderdata(tablename,startid,endid);
	}
}
