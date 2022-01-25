package edu.epam.firsttask.spliter;

public class Spliter {

    public static Double[] split(String s) {

        String[] strings = s.split("\\s+");
        Double[] doubles = new Double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }

        return doubles;
    }
}
