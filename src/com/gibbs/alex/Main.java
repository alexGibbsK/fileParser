package com.gibbs.alex;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        ReadCSV readCSV = new ReadCSV();
        Fills fills = new Fills();

        try{
            fills.outPut(readCSV.readInput());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
