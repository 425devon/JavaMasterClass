package com.devon;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);

    }

    private static void printMegaBytesAndKiloBytes ( int kilobytes){
        int kiloBytes = kilobytes;
        if (kiloBytes <= 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, mb, kb);
        }
    }
}
