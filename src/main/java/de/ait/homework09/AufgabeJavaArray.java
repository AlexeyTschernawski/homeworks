package de.ait.homework09;

public class AufgabeJavaArray {
    public static void main(String[] args) {
     //Array
        int [] salary; //array declaration
        salary = new int[6];//initializing an array of 6 elements
        salary = new int[]{1200, 1400, 1300, 1000, 1500, 1800};//declaration and initializing

        int salaryFebruar = salary[1];
        //System.out.println(salaryFebruar);

        for (int i=0; i < salary.length; i++){
            System.out.print(salary[i] + " ");
        }


        System.out.println("\n");

        salary[1] = 1600;
        int salaryFebruarNew = salary[1];
        //System.out.println(salary[1]);

        //System.out.println(salary[0] + " "+ salaryFebruarNew +  " "+ salaryFebruar);

        for (int i=0; i < salary.length; i++){
            System.out.print(salary[i] + " ");
        }

        System.out.println(salary[9]);





    }
}
