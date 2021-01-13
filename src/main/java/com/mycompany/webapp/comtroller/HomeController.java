package com.mycompany.webapp.comtroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	public static void main(String[] agrs) {
		//log4j.xml에서 출력창을 제어한다.
		logger.debug("실행1");
		logger.info("실행2");
		logger.warn("실행3");
		logger.error("실행4");

	}
}
