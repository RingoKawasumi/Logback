package com.zhujie.study.logback._1_Introduction;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/18.
 */
public class HelloWorld2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("com.zhujie.study.logback._1_Introduction.HelloWorld2");
        logger.debug("Hello world.");

        //print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
