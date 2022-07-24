package patikaDev;
import java.util.Scanner;

public class dortBesinKatlari {
    public static void main (String... args){
        /*Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdırın.*/

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sınır sayısı belirleyin :");
        n = input.nextInt();

        for(int i =1; i<n; i*=4){
            System.out.print(i +",");
        }
        System.out.println();

        for(int i =1; i<n; i*=5){
            System.out.print(i+ ",");
        }
    }
}