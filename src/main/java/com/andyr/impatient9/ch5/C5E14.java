package com.andyr.impatient9.ch5;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.Filter;

public class C5E14 {
    public static void main(String[] args) throws IOException {
        Logger log = setUpLogger(new String[]{"Sex", "Drugs","C++"},"filterTest.log");
        log.info("Test");
        log.info("Test Sex");
        log.info("Something");
        log.info("C++");
    }

    static Logger setUpLogger(String[] bannedWords, String logFileName) throws IOException {
        FileHandler fh = new FileHandler(logFileName,false);
        Filter fil = new Filter() {
            @Override
            public boolean isLoggable(LogRecord lr) {
                for(String word: bannedWords) {
                    if(lr.getMessage().contains(word))
                        return false;
                }
                return true;
            }
        };
        Logger logger = Logger.getLogger("com.andyr.impatient9.ch5") ;
        logger.addHandler(fh);
        logger.setFilter(fil);
        return logger;

    }
}
