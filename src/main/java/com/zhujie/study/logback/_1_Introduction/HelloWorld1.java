package com.zhujie.study.logback._1_Introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/18.
 */
public class HelloWorld1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("com.zhujie.study.logback._1_Introduction.HelloWorld1");
        logger.debug("Hello World.");
    }
}
