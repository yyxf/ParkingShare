package com.zch.service;

import java.util.List;

import com.zch.pojo.Manager;

public interface ManagerService {
	
	int deleteByPrimaryKey(String id);

    int insert(Manager record);

    Manager selectByPrimaryKey(String id);

    List<Manager> selectAll();

    int updateByPrimaryKey(Manager record);
    
    
//  通过name,phone,pwd查询
    Manager selectByNamePwd(Manager manager);

}
