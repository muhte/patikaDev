package patikaDev;
import java.util.Objects;
import java.util.Scanner;

public class userInput2 {
    public static void main (String... args ){
        String kullanıcıAdı, sifre ,yenıSıfre;
        int secim ;
        Scanner input = new Scanner(System.in);

        System.out.print("kullanıcı adınzı giriniz : ");
        kullanıcıAdı = input.nextLine();
        System.out.print("şifreniziz giriniz : ");
        sifre = input.nextLine();


        if (kullanıcıAdı.equals("patika")){
            if (sifre.equals("123")){
                System.out.println("Giriş Yapıldı ");
            }
            else{
                System.out.println("şifreniz yanlış.şifrenizi  sıfırlamak ister miniz ? ");
                System.out.print("1: hayır\n2: evet \n");
                secim =input.nextInt();
                if(secim==2){
                    System.out.print("yeni şifrenizi giriniz : ");
                    yenıSıfre =input.next();
                    if(yenıSıfre.equals("123")) {
                        System.out.print("yeni şifre eski şifre aynı olamaz!! ");
                    }
                    else {
                        System.out.print("Şifreniz değiştirildi :) ");
                    }
                }

            }

        }
        else {
            System.out.print("yanlış giriş yaptınız !! ");
        }


    }
}

