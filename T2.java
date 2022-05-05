package com.company;

public class T2 {

    public static void main(String[ ] args) {
        int[] Shanjed56275 = {1, 2, 3, 6 , 8 , 21};
        System.out.println(Shanjed56275[7]);


        try {
            Shanjed56275 = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(Shanjed56275[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}

