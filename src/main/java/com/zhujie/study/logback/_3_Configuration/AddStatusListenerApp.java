package com.zhujie.study.logback._3_Configuration;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/19.
 */
public class AddStatusListenerApp {
    static final Logger logger = LoggerFactory.getLogger(AddStatusListenerApp.class);

    public static void main(String[] args) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusManager statusManager = lc.getStatusManager();
        OnConsoleStatusListener onConsoleStatusListener = new OnConsoleStatusListener();
        statusManager.add(onConsoleStatusListener);

        logger.info("Entering application");

        Foo foo = new Foo();
        foo.doIt();

        logger.info("Exiting application");

        lc.stop();
    }
}
