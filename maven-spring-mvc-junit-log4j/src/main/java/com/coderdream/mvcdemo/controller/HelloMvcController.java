package com.coderdream.mvcdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
	

    private static Logger logger = Logger.getLogger(HelloMvcController.class);    

	/**
	 * host:8080/hello/mvc
	 * 
	 * @return
	 */
	@RequestMapping("/mvc")
	public String helleMvc() {
		// 记录debug级别的信息
		logger.debug("This is debug message.");
		// 记录info级别的信息
		logger.info("This is info message.");
		// 记录warn级别的信息
		logger.warn("This is warn message.");
		// 记录error级别的信息
		logger.error("This is error message.");
		// 记录fatal级别的信息
		logger.fatal("This is fatal message.");  
		return "home";
	}
}
