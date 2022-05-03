/*
* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

package patikaDev;

import java.util.Scanner;
public class ucakBiletiFiyati {
    public static void main (String... args){
        int km, yas ,yon ;
        double normalfiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("kaç km gideceksiniz ? ");
        km = input.nextInt();

        System.out.print("yaşınızı giriniz : ");
        yas= input.nextInt();

        System.out.print("yolculuk tipinizi giriniz :(1 => Tek Yön , 2 => Gidiş Dönüş)  ");
        yon=input.nextInt();

        //normalfiyat= km * (0.1);


         if((km<0 || yas<0) ||!(yon==1 ||yon==2) ){
             System.out.print("hatalı bilgi girdiniz :");
         }

         else {
             if(yas<=12){
                 switch (yon) {
                     case 1 : {
                         normalfiyat= km * (0.1);
                         normalfiyat -= normalfiyat * (0.5);
                         System.out.println("ödemeniz gereken fiyat :" + normalfiyat + "tl");
                     }
                     case 2 : {
                         normalfiyat= km * (0.1);
                         normalfiyat -= normalfiyat * (0.5);
                         normalfiyat -= normalfiyat * (0.2);
                         System.out.print("gidiş dönüş için ödemeniz gereken fiyat :" + normalfiyat *2 + "tl");
                         break;
                     }
                 }
                }
             else if(yas>13 && yas<=24){
                 switch (yon) {
                     case 1 : {
                         normalfiyat= km * (0.1);
                         normalfiyat -= normalfiyat * (0.1);
                         System.out.println("ödemeniz gereken fiyat :" + normalfiyat + "tl");
                     }
                     case 2 : {
                         normalfiyat= km * (0.1);
                         normalfiyat -= normalfiyat * (0.1);
                         normalfiyat -= normalfiyat * (0.2);
                         System.out.print("gidiş dönüş için ödemeniz gereken fiyat :" + normalfiyat*2 + "tl");
                     }
                     break;
                 }
             }
             else if(yas>=65){
                 switch (yon){
                     case 1 :{
                         normalfiyat= km * (0.1);
                         normalfiyat -= normalfiyat * (0.3);
                         System.out.print("ödemeniz gereken fiyat :" + normalfiyat + "tl");

                     }
                     case 2: {
                         normalfiyat= km * (0.1);
                         normalfiyat -= normalfiyat * (0.3);
                         normalfiyat -= normalfiyat * (0.2);
                         System.out.print("gidiş dönüş için ödemeniz gereken fiyat :" + normalfiyat *2+ "tl");
                     }
                     break;
                 }
             }
             else {
                 switch(yon){
                     case 1:{
                         normalfiyat= km * (0.1);
                         System.out.println("ödemeniz gereken fiyat :" + normalfiyat + "tl");
                     }
                     case 2: {
                         normalfiyat= km * (0.1);
                         normalfiyat -= normalfiyat * (0.2);
                         System.out.print("gidiş dönüş için ödemeniz gereken fiyat :" + normalfiyat*2 + "tl");
                     }
                     break;
                 }
             }
         }
        }
    }

