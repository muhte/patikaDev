package patikaDev;
import java.util.Scanner;
public class ciftsayiOrtalamasiBulma {
    public static void main(String... args){
        int sayi;
        double toplam=0;
        boolean kontrol =true;
        Scanner input=new Scanner(System.in);


        while (kontrol){
            System.out.print("bir sayı giriniz :");
            sayi = input.nextInt();
            if(sayi%2==1){
                kontrol=false;
                System.out.println("tek sayı girdiniz ");
            }else{
                if(sayi%4==0){
                    System.out.println(sayi);
                    toplam+=sayi;
                }
            }
        }
        System.out.println("girilen sayıda cift ve 4'ün katlarının toplamı: " + toplam);


    }
}
