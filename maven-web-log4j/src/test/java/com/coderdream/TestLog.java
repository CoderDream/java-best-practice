package com.coderdream;

import org.junit.Test;
import org.apache.log4j.Logger;

public class TestLog {

	private static Logger logger = Logger.getLogger(TestLog.class);

	@Test
	public void testHello() {
		logger.debug(" This is debug!!!");
		logger.info(" This is info!!!");
		logger.warn(" This is warn!!!");
		logger.error(" This is error!!!");
		logger.fatal(" This is fatal!!!");
	}

}