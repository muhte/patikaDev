
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

package patikaDev;
import java.util.Scanner;

public class sıralama {
    public static void main(String... args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz : ");
        a = input.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        b = input.nextDouble();

        System.out.print("3.sayıyı giriniz : ");
        c = input.nextDouble();


        if ((a < b) && (a < c)) {
            if (b<c) {
                System.out.print("a < b < c");
            } else {
                System.out.print("a < c < b");
            }
        }
        else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b < a < c");
            }else {
                System.out.print("b < c < a");
            }
        }

        else {
            if(a < b){
                System.out.print("c < a < b");
            }else{
                System.out.print("c < b < a");
            }
        }
    }
}