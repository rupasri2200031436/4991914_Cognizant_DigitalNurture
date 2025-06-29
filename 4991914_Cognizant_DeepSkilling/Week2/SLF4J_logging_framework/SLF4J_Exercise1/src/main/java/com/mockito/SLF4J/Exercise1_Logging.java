package com.mockito.SLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise1_Logging {
    // Create the logger instance
    private static final Logger logger = LoggerFactory.getLogger(Exercise1_Logging.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}
