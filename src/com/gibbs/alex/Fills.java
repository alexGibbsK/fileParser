package com.gibbs.alex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by Alex on 4/2/2017.
 */
public class Fills {
    private static String OUTPUT_LOCATION = "fills.txt";
    private static String CSN = "UTF-8";

    public void outPut(Map<String, Integer> hashMap) throws IOException {
        try {
            PrintWriter writer = new PrintWriter(OUTPUT_LOCATION, CSN);
            for (String key :
                    hashMap.keySet()) {
                //check for order filled
                if (hashMap.get(key) != null)
                    writer.println(key);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
