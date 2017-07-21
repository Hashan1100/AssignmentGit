package com.assignment.generate;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This generates a random number which is taken as the lucky number
 */
@SuppressWarnings("ALL")
public class RandowNumberGenerator {

    /**
     * Genarates and returns the random number
     * @param maxMargin maximum random value
     * @param minMargin minimum random value
     * @return int
     */
    public static int getRandomNumber(int maxMargin, int minMargin){
        int randowNumber = 0;
        randowNumber = ThreadLocalRandom.current().nextInt(minMargin, maxMargin + 1);
        return randowNumber;
    }
}
