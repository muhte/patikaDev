package patikaDev;
import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) {

        double fiyat ,kdvOranı,kdvTutar,kdvliTutar ;

        Scanner inp = new Scanner(System.in);

        System.out.print("fiyatı giriniz :" );
        fiyat = inp.nextInt();

        kdvOranı = (fiyat > 1000) ? 0.08 : 0.18;
        kdvTutar =fiyat * kdvOranı;
        kdvliTutar = fiyat + kdvTutar ;


        System.out.println("fiyat :" + fiyat );
        System.out.println("kdv tutarı :" + kdvOranı);
        System.out.println("kdv'li tutar :" + kdvliTutar);

    }
}
