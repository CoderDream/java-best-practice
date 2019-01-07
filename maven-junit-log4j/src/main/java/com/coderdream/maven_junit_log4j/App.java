package com.coderdream.maven_junit_log4j;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger logger = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		logger.debug(" This is debug!!!");
		logger.info(" This is info!!!");
		logger.warn(" This is warn!!!");
		logger.error(" This is error!!!");
		logger.fatal(" This is fatal!!!");
	}
}
