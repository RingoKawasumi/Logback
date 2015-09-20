package com.zhujie.study.logback._3_Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/19.
 */
public class MyApp1 {
    static final Logger logger = LoggerFactory.getLogger(MyApp1.class);

    public static void main(String[] args) {
        logger.info("Entering application");

        Foo foo = new Foo();
        foo.doIt();

        logger.info("Exiting application");
    }
}
