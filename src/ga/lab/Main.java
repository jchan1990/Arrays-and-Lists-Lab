package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");
        System.out.println("\n");

        //Problem 2:
        reversedOrder();
        System.out.println("\n");

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});
        System.out.println("\n");

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);
        System.out.println("\n");


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'I', ' ', 'a', 'm', ' '});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        //how do we print a variable to the command line
        System.out.println(charString);
        System.out.println("\n");

        //Problem 6:
        // Create a List of type String with the variable name myStringList.
        // At least 5 String values to the list. (You can put any 5 String values you want).
        //Put your code for problem 6 here
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Pandaren");
        myStringList.add("Goblin");
        myStringList.add("Blood Elf");
        myStringList.add("Orc");
        myStringList.add("Tauren");
        myStringList.add("Troll");
        myStringList.add("Undead");


        //Problem 7:
        reversedStringOrder(myStringList);
        System.out.println("\n");

        //Problem 8:
        printOrAdd(myStringList);
        System.out.println("\n");


        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.
        int[] oddSizedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        //Problem 10:
        findMiddle(oddSizedArray);
        //how do we print a variable to the command line

        findMiddle(new int[]{2, 7, 9, 12, 15});
        //how do we print a variable to the command line

        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line

        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line

    }

    //declare your functions

    // 1
    public static void stringLengthOrValue(String string) {
        if (string.length() > 5) {
            System.out.println(string);
        } else if (string.length() < 5) {
            System.out.println(string.length());
        } else {
            System.out.println("Error");
        }
    }

    // 2
    public static void reversedOrder() {
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i;
        }
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            System.out.println(arrayInt[i]);
        }
    }

    // 3
    public static void maxValue(int[] array) {
        int maxValue = 0;
        for (int value = 0; value < array.length; value++) {
            if (maxValue < array[value]) {
                maxValue = array[value];
            }
        }
        System.out.println(maxValue);
    }

    // 4
    public static double sumOfValues(double[] aDouble) {
        double sum = 0;
        for (int i = 0; i < aDouble.length; i++) {
            sum += aDouble[i];
        }
        return sum;
    }

    // 5
    public static String charsToString(char[] aChar) {
        String convertedString = "";
        for (int i = 0; i < aChar.length; i++) {
            String string = String.valueOf(aChar[i]);
            convertedString += string;
        }
        return convertedString;
    }

    // 7
    public static void reversedStringOrder(List<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.println(list.get(i));
        }

    }

    // 8
    public static void printOrAdd(List<String> list) {
        if (list.size() > 10) {
            for (String string : list) {
                System.out.println(string);
            }
        } else {
            list.add("Java " + list.size());
            System.out.println("Java " + list.size());
        }
    }

    // 10
    public static void findMiddle(int[] arrayInt) {
        int middle = (arrayInt.length / 2);
        System.out.println(arrayInt[middle]);
    }

}
