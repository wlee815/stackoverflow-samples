package com.william.sandbox;

/**
 *
 */
public class CountNumbers {

    /**
     * Uses two for loops to count from 00 to 11 in base-2 by printing all combinations of {0,1}
     */
    public void countBinaryIterative() {
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    /**
     * Uses recursion to print all possible combinations of the given availableDigits
     *
     * @param availableDigits        An array of possible digit values. Example: For base-2, it would be {0,1}
     * @param digitCombination       The number of digits that can occur in a given combination. For example: For base-2 counting up to 11, this would be an array of size 2
     * @param digitCombinationOffset The offset into the current digitCombination that we are manipulating in the current recursion frame.
     */
    public void countRecursive(int[] availableDigits, int[] digitCombination, int digitCombinationOffset) {

        //terminal condition: We will increment digitCombinationOffset as we go deeper into each successive frame of the
        //recursion. When we get to the bottom of the recursion tree, digitCombinationOffset will be equal to
        //the length of the digitCombination array. That means that we've "filled up" the digitCombination array
        //with values and can print it out.
        if (digitCombinationOffset == digitCombination.length) {
            //print the combination
            for (int i = 0; i < digitCombination.length; i++) {
                System.out.print(digitCombination[i]);
                if ((i + 1) == digitCombination.length) {
                    System.out.println();
                }
            }
            return;
        }

        for (int i : availableDigits) {
            //take one of the available digits and place it into digitCombination at the digitCombinationOffset for this
            //particular frame of the recursion
            digitCombination[digitCombinationOffset] = availableDigits[i];
            //go deeper into the recursion tree with a plus-1-incremented digitCombinationOffset. By the time
            //we reach the bottom of the recursion tree, we will have reached the last digit of digitCombination
            //and the terminal condition will print out the combination.
            countRecursive(availableDigits, digitCombination, digitCombinationOffset + 1);
            //When we return from the recursion, we will "pick up where we left off", and traverse the recursion tree
            //down a different path with i at the next higher value.
        }
    }

    public static void main(String args[]) {
        System.out.println("Iterative counting, base-2:");
        CountNumbers countNumbers = new CountNumbers();
        countNumbers.countBinaryIterative();

        System.out.println("Recursive coutning, base-2:");
        int[] availableDigits = {0, 1};
        int[] digitCombination = {999, 999};
        countNumbers.countRecursive(availableDigits, digitCombination, 0);

        System.out.println("Recursive coutning, base-10:");
        int[] base10Digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] base10Combination = {999, 999, 999};

        countNumbers.countRecursive(base10Digits, base10Combination, 0);
    }

}
