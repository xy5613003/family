package com.finance.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.finance.dao.RoleDao;
import com.finance.entity.Role;
import com.finance.service.RoleService;
/**
 * 角色Service实现类
 * @author 赵鹏（zhaopeng）
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService{
	@Resource
	private RoleDao roleDao;
	

	public List<Role> getRoles() {
		return roleDao.getRoles();
	}
	

	public List<Role> findRole(Map<String,Object> map){
		return roleDao.findRole(map);
	}
	

	public Long getTotalRole(Map<String,Object> map){
		return roleDao.getTotalRole(map);
	}

	public int updateRole(Role role){
		return roleDao.updateRole(role);
	}

	public int addRole(Role role){
		return roleDao.addRole(role);
	}
	

	public int deleteRole(Integer id){
		return roleDao.deleteRole(id);
	}
}
