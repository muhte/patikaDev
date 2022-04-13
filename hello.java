
package giris ;
import java.util.Scanner;

public class hello {
    public static void main (String[] args) {

        int mat,fizik,kimya,turkçe, tarih, muzik ;
        Scanner inp = new Scanner(System.in);

        System.out.print("matemetik notunuz ?");
        mat= inp.nextInt();
      //  System.out.print(mat);

        System.out.print("fizik notunuzu giriniz ?");
        fizik = inp.nextInt();

        System.out.print("kimya notunuzu giriniz ?");
        kimya =inp.nextInt();

        System.out.print("turkçe notunuzu giriniz ?");
        turkçe= inp.nextInt();

        System.out.print("tarih notunuzu giriniz ? ");
        tarih =inp.nextInt();


        System.out.print("muzik notunuzu giriniz ? " );
        muzik= inp.nextInt();

        int toplam =(mat+fizik+kimya+turkçe+tarih+muzik);
        double ortalamanız =  toplam /6;
        System.out.println ("not ortalamanız :"+ ortalamanız);

       String sonuç = (ortalamanız  >= 60) ?   "sınıfı geçti" : "sınıfta kaldı";
    }

}
