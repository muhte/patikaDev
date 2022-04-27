package patikaDev;
import java.util.Scanner;
public class weatherReport {
    public static void main(String... args){
        int sicaklık;
        Scanner inp = new Scanner(System. in);
        System.out.print("sıcaklık derecesini giriniz:  " );
        sicaklık=inp.nextInt();

        if(sicaklık<=5){
            System.out.print("kayak yapabilirsiniz :) ");
        }
        else if (sicaklık >= 10 && sicaklık<=15 ){
            System.out.print("sinameya veya pikniğe gidebilirsiniz : ");

        }
        else if(sicaklık>5 && sicaklık < 10){
            System.out.print("sinemaya gidebilirsiniz ");
        }
        else if(sicaklık > 15 && sicaklık < 25 ){
            System.out.print("pikniğe gidebilirsiniz");
        }
        else {
            System.out.print("yüzmeye gidebilirsiniz");
        }

    }
}
