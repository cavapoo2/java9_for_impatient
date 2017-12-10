package com.andyr.impatient9.ch5;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class C5E15 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("com.andyr.impatient9.ch5") ;
        FileHandler fh = new FileHandler("Logging.html");
        HtmlFormatter htf = new HtmlFormatter();
        fh.setFormatter(htf);
        logger.addHandler(fh);
        logger.info("Test");
    }


static class HtmlFormatter extends Formatter {
    // this method is called for every log records
    public String format(LogRecord rec) {
        StringBuffer buf = new StringBuffer(1000);
        buf.append("<!DOCTYPE html>");
        buf.append("<header><title>" + rec.getMessage() + "</title></header>");
        buf.append("</html>");
        return buf.toString();
    }

}
}
