package com.devon;

public class Main {

    public static void main(String[] args) {
        System.out.println("getDigitCount Tests: ");
        System.out.println("Expect 1: " + getDigitCount(0));
        System.out.println("Expect 3: " + getDigitCount(123));
        System.out.println("Expect -1: " + getDigitCount(-12));
        System.out.println("Expect 4: " + getDigitCount(5000));
        System.out.println("Expect 4: " + getDigitCount(1010));
        System.out.println("****************");
        System.out.println("reverse tests: ");
        System.out.println("Expect -121: " + reverse(-121));
        System.out.println("Expect 2121: " + reverse(1212));
        System.out.println("Expect 1234: " + reverse(4321));
        System.out.println("Expect 1: " + reverse(100));
        System.out.println("Expect 0101: " + reverse(101));
        System.out.println("****************");
        System.out.println("numberToWords Tests: ");
        System.out.println("Expect One Two Three: ");
        numberToWords(123);
        System.out.println("Expect One Zero One Zero: ");
        numberToWords(1010);
        System.out.println("Expect One Zero Zero Zero: ");
        numberToWords(1000);
        System.out.println("Expect Invalid Value: ");
        numberToWords(-12);
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int orderedNumber = reverse(number);
        int digitToPrint = 0;
        int digits = getDigitCount(number);

        while (orderedNumber > 0 || digits > 0) {
            if(orderedNumber > 0) {
                digitToPrint = (orderedNumber % 10);
                orderedNumber = (orderedNumber / 10);
                digits--;
            }else{
                digitToPrint = 0;
                digits--;
            }
            switch (digitToPrint) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        }
    }

    public static int reverse(int number){
        int check = number;
        int lastDigit = 0;
        int reverseNumber = 0;
        if(number < 0){
            number *= -1;
        }
        while(number > 0){
            reverseNumber *=10;
            lastDigit = (number % 10);
            reverseNumber += lastDigit;
            number = (number / 10);
        }
        if(check < 0){
            reverseNumber *= -1;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        int count = 0;
        int place = 1;
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        while(number >= place){
            count++;
            place *= 10;
        }
        return count;
    }
}
