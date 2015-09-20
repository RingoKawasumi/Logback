package com.zhujie.study.logback._2_Architecture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhujie on 15/9/19.
 */
public class Parameterized {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Parameterized.class);

        Parameterized[] entry = new Parameterized[]{new Parameterized(), new Parameterized(), new Parameterized()};

        int i = 0;
        logger.debug("Entry number: " + i + " is " + String.valueOf(entry[i]));

//        ((ch.qos.logback.classic.Logger)logger).setLevel(Level.INFO);
        if (logger.isDebugEnabled()) {
            logger.debug("Entry number: " + i + " is " + String.valueOf(entry[i]));
        }

        logger.debug("The entry is {}.", entry);

        logger.debug("The new entry is {}. It replaces {}.", entry[0], entry[1]);

        logger.debug("Value {} was inserted between {} and {}.", entry);
    }
}
