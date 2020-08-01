package com.packagetest;

public class MegaByteConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByte = 0;
            int rKiloBytes = 0;
            megaByte = kiloBytes / 1024;
            rKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + rKiloBytes + " KB");
        }
    }
}
