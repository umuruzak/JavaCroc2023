package ru.croc.wjs.umurzakov.task4;

/**
 * Task №3
 * Umurzakov A., 18.10.23
 */

public class Task4 {

    public static void main(String[] args) {
        try {
            int first = Integer.parseInt(args[0]);
            int diff = Integer.parseInt(args[1]);
            int number = Integer.parseInt(args[2]);
            int nTh = first;
            int sum = 0;

            for (int i = 1; i < number; i++) {
                sum += nTh;
                nTh += diff;
            }
            sum += nTh;
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
