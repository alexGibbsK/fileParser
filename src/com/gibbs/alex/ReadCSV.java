package com.gibbs.alex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 4/2/2017.
 */
public class ReadCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final Integer ORDER_FILLED = 1;
    private static String INPUT_FILE_PATH = "EOD_sample.csv";
    private static Map<String, Integer> hashMap = new HashMap<String, Integer>();

    public static Map<String, Integer> readInput() throws IOException {

        BufferedReader br = null;
        br = new BufferedReader(new FileReader(INPUT_FILE_PATH));
        String line = "";

        //read csv file
        while ((line = br.readLine()) != null) {
            String[] lineDetails = line.split(COMMA_DELIMITER);
            recordTypeSwitcher(lineDetails, hashMap);
        }

        return hashMap;
    }

    //Fill hashMap and check for order filled according to project description
    public static void recordTypeSwitcher(String[] inputString, Map<String, Integer> hashMap) {
        switch (inputString[0]) {
            case "0":
                hashMap.put(inputString[5], null);
                break;
            case "10":
                hashMap.put(inputString[5], ORDER_FILLED);
                break;
        }
    }


}