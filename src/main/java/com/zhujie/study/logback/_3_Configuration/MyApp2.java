package com.zhujie.study.logback._3_Configuration;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/19.
 */
public class MyApp2 {
    static final Logger logger = LoggerFactory.getLogger(MyApp2.class);

    public static void main(String[] args) {
        // assume SLF4J is bound to logback in the current environment
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // print logback's internal status
        StatusPrinter.print(lc);

        logger.info("Entering application");

        Foo foo = new Foo();
        foo.doIt();

        logger.info("Exiting application");
    }
}
