package patikaDev;
import java.util.Scanner;

public class usHesabıMetotlar {
    static int result=1;
    static int usAlma(int base, int power){
        if(power==0){
            return 1;
        }
        else if (base == 0){
            return 0;
        }
        result *= base;
        usAlma(base, power - 1);
        return result;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("üs değeri giriniz :");
        int power = scan.nextInt();

        System.out.println("sonuç : " + usAlma(base, power));

    }
}
