package patikaDev;
import java.util.Scanner ;

public class hesapMakinasıMetot {
    static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("0'a basarak sayi girisi durdurulur ");
        int number, result= 0,i=1;

        while (true){
            System.out.println(i++ + ". sayı :" );
            number = scan.nextInt();
            if(number == 0) {
                break;
            }
            result += number ;
        }
        System.out.println("----------\nsonuç :" + result + "\n----------");
    }

    static void minus (){
        Scanner scan = new Scanner(System.in);
        System.out.print("kaç sayı gireceksiniz : ");
        int counter = scan.nextInt();
        int number, result =0;

        for(int i =1 ; i<=counter ; i++){
            System.out.println(i +". sayı : ");
            number = scan.nextInt();
            if(i==1){
                result += number ;
                continue;
            }
            result -= number;
        }
        System.out.println("----------\nsonuç :" + result + "\n----------");
    }

    static void times (){
        Scanner scan = new Scanner(System.in);
        int number, result =1, i=1;

        while (true){
            System.out.println(i++ +". sayı : ");
            number= scan.nextInt();
            if(number == 1){
                break;
            } if(number == 0){
                result =0 ;
                break;
            }
            result *= number ;
        }
        System.out.println("----------\nsonuç :" + result + "\n----------");
    }

    static void  divided(){
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();
        double number, result=0.0;

        for(int i =1 ; i<=counter ; i++){
            System.out.println(i +".sayı :");
            number = scan.nextDouble();
            if(i != 1 && number ==0){
                System.out.println("böleni 0 giremezsiniz.");
                continue;
            }
            if(i==1){
                result= number;
                continue;
            }
            result /= number ;

        }
        System.out.println("----------\nsonuç :" + result + "\n----------");
    }
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("----------\nsonuç :" + result + "\n----------");
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("----------\nsonuç :" + result + "\n----------");
    }

    static void mod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Modu alınacak Sayıyı giriniz :");
        int moduAlinan = sc.nextInt();
        System.out.print("Mod sayısını giriniz :");
        int modSayisi = sc.nextInt();
        int result = moduAlinan%modSayisi;
        System.out.println("----------\nsonuç :" + result + "\n----------");
    }
    static void dikdortgenAlanCevre() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunun giriniz :");
        int kenar1 = sc.nextInt();
        System.out.print("İkinci kenar uzunluğunun giriniz :");
        int kenar2 = sc.nextInt();
        int resultalan, resultcevre;
        resultcevre=2*(kenar1+kenar2);
        resultalan=kenar1*kenar2;
        System.out.println("----------\nsonuç :" + resultcevre + "\n----------");
        System.out.println("----------\nsonuç :" + resultalan + "\n----------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("lütfen yapmak istediğiniz işlemi seçiniz :");
            select= scan.nextInt();

            switch (select) {
                case 1 :
                    plus();
                    break ;

                case 2 :
                    minus();
                    break;

                case 3:
                    times ();
                    break ;

                case 4:
                    divided();
                    break ;

                case 5:
                    power();
                    break ;

                case 6 :
                    factorial();
                    break;

                case 7:
                    mod();
                    break;

                case 8:
                    dikdortgenAlanCevre();
                    break;

                case 0:
                    break ;
                default:
                    System.out.println("yanlış bir değer girdiniz . ");
            }
        } while (select !=0);

    }
}
