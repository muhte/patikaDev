package patikaDev;
import java.util.Scanner;

//ÖDEV : kombinasyon hesaplayan program yazınız.

public class kombinasyon {
    public static void main(String... args) {
        int toplam1=1 ,toplam2 =1, toplam3 = 1, kombinasyon;


        Scanner sayi = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int n = sayi.nextInt();

        for (int i = 1; i <= n; i++) {
            toplam1 = toplam1 * i;
        }
        System.out.println(n + " sayısının faktöriyeli " + toplam1);

        Scanner sayi2 = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int r = sayi2.nextInt();

        for (int i = 1; i <= r; i++) {
            toplam2 = toplam2 * i;
        }
        System.out.println(r + " sayısının faktöriyeli " + toplam2);

        int sayı3 = n-r  ;

        for( int i=1; i<= sayı3 ; i++){
            toplam3 *= i;
        }
        System.out.println(sayı3 + " sayısının faktöriyeli " + toplam3);


        kombinasyon = toplam1 /((toplam2)* (toplam3));
        System.out.print(" işleminin  sonucu: " + kombinasyon);
    }
}
