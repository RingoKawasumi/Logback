package com.zhujie.study.logback._3_Configuration;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/19.
 */
public class MyApp3 {
    static final Logger logger = LoggerFactory.getLogger(MyApp3.class);

    public static void main(String[] args) {
        // assume SLF4J is bound to logback in the current environment
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();

        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(context);
        // Call context.reset() to clear any previous configuration, e.g. default
        // configuration. For multi-step configuration, omit calling context.reset().
        context.reset();
        try {
            configurator.doConfigure(args[0]);
        } catch (JoranException e) {
            // StatusPrinter will handle this
        }

        logger.info("Entering application");

        Foo foo = new Foo();
        foo.doIt();

        logger.info("Exiting application");
    }
}
