package patikaDev;
import java.util.Scanner;
public class artikYılHesabi {
    public static void main(String... args){
        int year;
        Scanner input= new Scanner(System.in);

        System.out.print("bir yıl giriniz :");
        year= input.nextInt();

        if(year<0){
            System.out.print("hatalı bir veri girdiniz :)");
        }else if(year%4==0){
            System.out.print( year + " bir artık yıl");
        }else if(year%100==0){
            if(year%400==0){
                System.out.print( year + " bir artık yıl ");
            }else{
                System.out.print(year + "bir artık yıl değildir. ");
            }
        }else {
            System.out.print(year + "bir artık yıl değildir. ");
        }
    }
}
