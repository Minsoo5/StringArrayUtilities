package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                contains = true;
            }
        }
        return contains;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reverseArray = new String[array.length];

        for (int i = array.length -1; i >= 0; i--) {
            reverseArray[(array.length -1) - i] = array[i];
        }


        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean isCorrect = false;
        int half = (array.length/2);


        for (int i = array.length -1; i >= half ; i--) {
            if (array[(array.length-1) -i].equals(array[i])) {
                isCorrect = true;

            }
        }

        return isCorrect;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        boolean flag = true;



        ArrayList<String> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            newArray.add(array[i].toLowerCase());
        }

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < alphabet.length; i++) {
            Character c = alphabet[i];
            if (!newArray.contains(c)) {
                flag = false;

            }

        }
        return flag;


    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
       ArrayList<String> newArray = new ArrayList<>();

       int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }

       /*
        for (int i = 0; i < array.length; i++) {
            newArray.add(array[i]);
        }
        for (int i = 0; i < newArray.size(); i++) {
            if (newArray.contains(value)) {
                counter++;
            }
        }
        */
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       ArrayList<String> newArray = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            newArray.add(array[i]);
        }

        for (int i = 0; i < newArray.size(); i++) {
            if (newArray.get(i).equalsIgnoreCase(valueToRemove)) {
                newArray.remove(valueToRemove);
            }
        }

        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            newArray.add(array[i]);
        }

        for (int i = 0; i < newArray.size() -1 ; i++) {
            if(newArray.get(i).equalsIgnoreCase(newArray.get(i +1)) ) {
                newArray.remove(i+1);
                i--;
            }
        }

        return newArray.toArray(new String[0]);

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String> newArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            newArray.add(array[i]);
        }

        for (int i = 0; i < newArray.size() -1 ; i++) {
            if((newArray.get(i)).contains((newArray.get(i +1)))) {
                newArray.set(i, newArray.get(i) + newArray.get(i + 1));
                newArray.remove(i+1);
                i--;
            }
        }

        return newArray.toArray(new String[0]);

        //                  aa
        //String[] array = {"a", "a", "a", "b", "c", "c", "a", "a", "d"};
        //String[] expected = {"aaa", "b", "cc", "aa", "d"};
    }
}
