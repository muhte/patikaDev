package patikaDev;
import java.util.Scanner;

public class daireninAlanı {
    public static void main(String[] args){

        double r ,a ,pi=3.14, diliminAlanı;
        Scanner inp = new Scanner (System.in);

        System.out.print("dairenin yarıçapı giriniz : " );
        r = inp.nextDouble();

        System.out.print("dairenin merkez ölçüsünü giriniz : ");
        a= inp.nextDouble();

        diliminAlanı = (pi*(r*r)*a)/360 ;

        System.out.print("daire diliminin alanı : " + diliminAlanı);

    }
}
