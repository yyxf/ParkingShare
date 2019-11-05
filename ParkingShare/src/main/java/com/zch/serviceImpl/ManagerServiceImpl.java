package com.zch.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zch.mapper.ManagerMapper;
import com.zch.pojo.Manager;
import com.zch.service.ManagerService;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	private ManagerMapper managerMapper;
	

	@Override
	@Transactional
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return managerMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public int insert(Manager record) {
		// TODO Auto-generated method stub
		return managerMapper.insert(record);
	}

	@Override
	public Manager selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return managerMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Manager> selectAll() {
		// TODO Auto-generated method stub
		return managerMapper.selectAll();
	}

	@Override
	@Transactional
	public int updateByPrimaryKey(Manager record) {
		// TODO Auto-generated method stub
		return managerMapper.updateByPrimaryKey(record);
	}

	@Override
	public Manager selectByNamePwd(Manager manager) {
		// TODO Auto-generated method stub
		return managerMapper.selectByNamePwd(manager);
	}

	

}
