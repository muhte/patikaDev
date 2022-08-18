package patikaDev;
import java.util.Scanner;

public class desenleMetot {
    static void desen(int a, int count){
        System.out.print(a+" ");
        if(a>0){
            count++;
            desen(a-5,count);
        }
        else {
            while (count>0) {
                System.out.print((a+5)+" ");
                a+=5;
                count--;
            }return;
        }
       // System.out.print(a + " ");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int sayı = scan.nextInt();
        desen(sayı,0);
    }
}
