package com.youtube;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class SimpleDotCom {
    private ArrayList<String> locationCells;
//    int[] locationCells;
//    int numOfHits = 0;


    /**
     * Receives locations of dotCom from test class
     * Sets the locations equal to locationCells variable
     */
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }


    /**
     *
     * Receives the user's guess as a string and parses it to an int
     * Loops through the locationCells and increments if it results in a hit
     *
     */
    public String checkYourself(String userInput) {


        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
