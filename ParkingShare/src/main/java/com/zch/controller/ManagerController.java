package com.zch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zch.pojo.Manager;
import com.zch.service.ManagerService;

@RestController
@RequestMapping("manager")
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@RequestMapping("/loginer")
	public Manager loginer(Manager manager) {

		System.out.println( manager.getName());
		
		
		Manager managerResult = managerService.selectByNamePwd(manager);
		if (managerResult == null) {
			System.out.println("Controller层的登录方法失败！！用户名为空：" + managerResult + "mmmmm");
			return managerResult;
		} else {
			System.out.println("Controller层的登录方法成功，其中，姓名为：" + managerResult + "mmmmm");
			System.out.println(managerResult.toString());
			
			//JSONObject  json = new JSONObject().fromObject(managerResult);
			//System.out.println("转换的json===============》"+json);

			
			return managerResult;
		}
	}
}
