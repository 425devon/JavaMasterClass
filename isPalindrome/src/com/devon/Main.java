package com.devon;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(11212));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(10));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        if(number < 0){
            number = number * -1;
        }
        int check = number;
        while(number > 0){
            reverse *= 10;
            lastDigit = number % 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        if(check == reverse){
            return true;
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int number){
        int last = number % 10;
        if(number < 0){
            return -1;
        }
        if(number < 10){
            return number + number;
        }
        while(number >= 10){
            number = number /10;
        }
        return last + number;
    }
}
