package de.ait.homework07;

public class AufgabeJavaDoWhile {
    /*
    do {
    //
   } while (condition);
     */
    public static void main(String[] args) {

        int x = 0;
        do {
            System.out.println("x = " + x);
        }
        while (x == 10);

        System.out.println("-----------");

        int y = 10;
        while (y == 10) {
            System.out.println("y = " + y);
        }
    }
}
