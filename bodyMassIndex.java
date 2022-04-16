package patikaDev;

import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String... args ){
        double kg,m,index;
        Scanner input= new Scanner(System.in);

        System.out.print("enter your weight (kg): ");
        kg = input.nextDouble();

        System.out.print("enter your height . in meters (m): ");
        m= input.nextDouble();

        index = kg /(m*m);
        System.out.print("body mass index : " + index );

    }
}
