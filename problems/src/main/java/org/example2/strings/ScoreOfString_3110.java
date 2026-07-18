package org.example2.strings;

/*
You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
Return the score of s.
 */
public class ScoreOfString_3110 {
    public static void main(String[] args) {
        System.out.println("Score is "+getScore("zaz"));
    }

    private static int getScore(String s) {
        char[] x = s.toCharArray();

        int i=0;
        int sum=0;
        if(x.length==1){
           return (int)x[i];
        }
        while(i<x.length-1) {
            sum+=Math.abs((int)x[i]-(int)x[i+1]);
            i++;
        }
        return sum;
    }
}
