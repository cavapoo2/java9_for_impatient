package com.andyr.impatient9.ch5;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.Filter;

public class C5E14 {
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("default.log",false   );
        String[] bannedWords = {"Sex", "Drugs", "C++"};
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

        Logger log  = Logger.getLogger("com.andyr.impatient9.ch5");
        log.addHandler(fh);
        log.setFilter(fil);

        log.info("Test");
        log.info("Test Sex");
        log.info("Something");
        log.info("C++");
    }
}
