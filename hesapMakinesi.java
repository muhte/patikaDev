package patikaDev;
import java.util.Scanner;
public class hesapMakinesi {
    public static void main (String... args){
        double sayı1, sayı2 ;
        int secim ;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz : ");
        sayı1 = input.nextDouble();
        System.out.print("2.sayıyı giriniz : ");
        sayı2 = input.nextDouble();


        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("yapmak istediğiniz işlemi seçiniz : ");
        secim = input.nextInt();



        switch (secim){
            case 1 :
                System.out.print("toplam sonucu :  " + (sayı1+sayı2));
                break ;
            case 2:
                System.out.print("çıkarma sonucu : " + (sayı1-sayı2));
                break;
            case 3:
                System.out.print("çarpma sonucu : " + (sayı1*sayı2));
                break;
            case 4:
                if (sayı2==0){
                    System.out.print("bölme işlemi yapılmaz !! ");
                }
                else {
                    System.out.print("bölme sonucu : " + (sayı1/sayı2));
                }

                break;

            default:
        }

    }
}
