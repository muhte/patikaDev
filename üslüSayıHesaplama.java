package patikaDev;
import java.util.Scanner;

public class üslüSayıHesaplama {
    public static void main (String... args){
        int n,k ;
        Scanner scan = new Scanner(System.in);
        System.out.print("taban(üssü) alınacak sayıyı giriniz :");
        n = scan.nextInt();
        System.out.print("kuvvet(üs) olacak sayıyı giriniz :");
        k= scan.nextInt();
        int total = 1;


        for(int i= 1; i<=k; i++){
            total *=n;

        }
        System.out.print ("cevap: " + total);
    }
}
