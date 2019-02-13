package com.youtube;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();


        SimpleDotCom theDotCom = new SimpleDotCom();

        /**
         * Create a random number between 0-4.999, cast it to an int, assign to variable
         */
        int randomNum = (int) (Math.random() * 5);

        /**
         * Set the locations of the 'DotCom Ships'
         */
        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationCells(locations);



        boolean isAlive = true;

        /**
         * Continue to prompt user for input until isAlive = false
         */
        while(isAlive == true) {
            String guess = helper.getUserInput("Enter a number");

            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;

            /**
             * Result equals 'kill' when the number of hits equals the length of the locations array
             */
            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }

}
