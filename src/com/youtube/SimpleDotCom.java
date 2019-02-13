package com.youtube;



public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;


    /**
     * Receives locations of dotCom from test class
     * Sets the locations equal to locationCells variable
     */
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }


    /**
     *
     * Receives the user's guess as a string and parses it to an int
     * Loops through the locationCells and increments if it results in a hit
     *
     */
    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";

                numOfHits++;

                break;
            }
        }


        /**
         * If the number of hits equals the total number of cells, it means they have 'killed' the dotCom
         */
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;

    }
}
