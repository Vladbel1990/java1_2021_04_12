package ru.geekbrains.java1.lesson2;

public class homework2 {

    public static void main(String[] args) {
        boolean resultSum = checkPositiveSum(1, 3);
        System.out.println("Check Sym = " + resultSum);
        printNumberSign(-5);
        System.out.println("Is negative? " + isNegative( 3));
        printRepeatText("I Love Java!", 3);
        System.out.println(checkLeapYear(2020));
    }

    private static boolean checkLeapYear (int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static void  printRepeatText(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }



    private static boolean checkPositiveSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}

