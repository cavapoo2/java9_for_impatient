package com.andyr.impatient9.ch2;
import java.io.FileReader;
import java.io.Reader;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;
import java.util.List;

public class C2E13 {
    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("src/main/resources/simple.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        for (CSVRecord record : records) {
            System.out.println(record);
        }
    }
}
