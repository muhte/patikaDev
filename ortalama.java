package patikaDev;

import java.util.Scanner;
public class ortalama {
    public static void main(String... args){
        int sayi;
        int j=0;
        double ort,toplam=0;
        Scanner input= new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        sayi= input.nextInt();

        for(int i =0 ; i<= sayi ; i++){
            if(i%12==0){
                System.out.println(i);
                toplam += i;
                j++;
            }
        }
        ort=(toplam/j);
        System.out.println("3 ve 4'e tam bölünen sayıların oratlaması :" + ort);
    }
}

