package patikaDev;
import java.util.Scanner;

public class asalSayıMetot {
    static void asal(int sayı,int i){
        if(i==sayı){
            System.out.println(sayı +" ASAL SAYIDIR. ");
            return;
        }else if(sayı%i==0){
            System.out.println(sayı + " ASAL SAYI DEĞİLDİR.");
            return;
        }
        asal(sayı,i+1);


    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayı = scan.nextInt();
        asal(sayı,2 );
    }
}
