package com.zch.mapper;

import com.zch.pojo.Manager;
import java.util.List;

public interface ManagerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Manager record);

    Manager selectByPrimaryKey(String id);

    List<Manager> selectAll();

    int updateByPrimaryKey(Manager record);
    
//    通过name phone pwd查询
    Manager selectByNamePwd(Manager manager);
}