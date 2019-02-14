package com.youtube;

import java.util.*;


public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    /**
     * Receives locations of dotCom from test class
     * Sets the locations equal to locationCells variable
     */
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }


    /**
     *
     * Setter for the DotCom name
     */
    public void setName(String n) {
        name = n;
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
                System.out.println("Ouch! You sunk " + name + "   : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
