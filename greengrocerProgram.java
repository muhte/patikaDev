package patikaDev;
import java.util.Scanner;

public class greengrocerProgram {

    public static void main(String... args){
        double armut, elma,domates,muz,patlıcan;
        double armutfiyatı=2.14,elmafiyatı = 3.67,domatesfiyatı = 1.11 ,muzfiyatı= 0.95 ,patlıcanfiyatı = 5.00 , total;
        Scanner input= new Scanner(System.in);

        System.out.print("kaç kilo armut aldınız ? ");
        armut = input.nextDouble();

        System.out.print("kaç kilo elma aldınız ? ");
        elma = input.nextDouble();

        System.out.print("kaç kilo domates aldınız ? ");
        domates = input.nextDouble();

        System.out.print("kaç kilo muz aldınız ? ");
        muz = input.nextDouble();

        System.out.print("kaç kilo patlıcan aldınız ? ");
        patlıcan = input.nextDouble();


        total= (armut*armutfiyatı)+(elma*elmafiyatı)+(domates*domatesfiyatı)+(muz*muzfiyatı)+(patlıcan*patlıcanfiyatı);
        System.out.println("toplam tutar "+ total);




    }
}
