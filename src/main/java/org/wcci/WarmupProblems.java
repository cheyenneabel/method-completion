package org.wcci;

public class WarmupProblems {

    /*
     * stringTimes()
     *
     * Given a string, str, and a non-negative and non-zero integer, n, return a larger string that is n copies of the original
     * string.
     *
     * Examples:
     * - stringTimes("Hi", 2) → "HiHi"
     * - stringTimes("Hi", 3) → "HiHiHi"
     * - stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {

        String returnVal;
        returnVal = "";
            for(int i = 1; i <= n; i++) {
                returnVal = returnVal + str;
            }

        return returnVal;
    }

    /*
     * icyHot()
     *
     * Given two temperatures, temp1 and temp2, return true if one is less than 0 and the other is greater than 100.
     *
     * Examples:
     * - icyHot(120, -1) → true
     * - icyHot(-1, 120) → true
     * - icyHot(2, 120) → false
     */
    public boolean icyHot(int temp1, int temp2) {

        if(temp1 < 0 && temp2 > 100) {
            return true;
        }
            if(temp1 > 100 && temp2 < 0) {
            return true;
        } else return false;
    }

}
