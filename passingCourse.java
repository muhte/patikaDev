package patikaDev;
import  java.util.Scanner;

public class passingCourse {
    public static void main (String ... args){
        double mat,fizik,turkce,kimya,muzik , ortalama ,dersSayısı=0,total=0;
        Scanner inp =new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz : ");
        mat = inp.nextDouble();
        if (mat>= 0 && mat<=100){
            total = total + mat;            //total :her defasında yeni değeri ekleyerek hesaplayarak gidiyoruz :))
            dersSayısı++;
        }

        System.out.print("fizik notunuzu giriniz : ");
        fizik =inp.nextDouble();
        if(fizik>=0 && fizik<=100){
            total+=fizik;
            dersSayısı++;
        }

        System.out.print("türkçe notunuzu giriniz : ");
        turkce=inp.nextDouble();
        if(turkce>=0 && turkce<=100){
            total += turkce;
            dersSayısı++;
        }

        System.out.print("kimya notunuzu giriniz : ");
        kimya= inp.nextDouble();
        if(kimya>=0 && kimya<=100){
            total += kimya;
            dersSayısı++;
        }

        System.out.print("müzik notunuzu giriniz : ");
        muzik= inp.nextDouble();
        if (muzik>= 0 && muzik<=100){
            total += muzik;
            dersSayısı++;
        }


        ortalama = (total/dersSayısı);
        System.out.println("geçme notunuz " + ortalama );

        if(ortalama>=55) {
            System.out.print("TEBRİKLER !! sınıfı geçtiniz");
        }
        else {
            System.out.print(" üzgünüm! kaldınız");
        }

    }
}
