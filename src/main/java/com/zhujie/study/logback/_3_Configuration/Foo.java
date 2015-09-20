package com.zhujie.study.logback._3_Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/19.
 */
public class Foo {
    static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public void doIt() {
        logger.debug("Did it again!");
    }
}
