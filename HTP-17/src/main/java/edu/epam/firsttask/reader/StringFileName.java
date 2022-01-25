package edu.epam.firsttask.reader;

import edu.epam.firsttask.spliter.Spliter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StringFileName {

    private static final Logger log = LogManager.getLogger();

    public static ArrayList<String> reader() throws IOException {
        String s;

            FileReader fileReader = new FileReader("data/sent.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> strings = new ArrayList<>();
            while(true) {
                if ((s = bufferedReader.readLine())!=null) {
                    strings.add(s);
                }
                else {
                    return strings;
                }
            }
    }
}
