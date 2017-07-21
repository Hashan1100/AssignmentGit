package com.assignment.generate;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by hashan on 7/21/17.
 */
@SuppressWarnings("ALL")
public class RandowNumberGenerator {
    public static int getRandomNumber(int maxMargin, int minMargin){
        int randowNumber = 0;
        randowNumber = ThreadLocalRandom.current().nextInt(minMargin, maxMargin + 1);
        return randowNumber;
    }
}
