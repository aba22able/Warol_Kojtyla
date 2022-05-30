package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite
{
    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = Logger.INSTANCE;
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        logger.log("new log");
        String logName = logger.getLastLog();
        //Then
        assertEquals("new log", logName);
    }
}
