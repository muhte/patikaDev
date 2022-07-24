package patikaDev;
import java.util.Scanner;

//mükemmel sayı bulma
public class mükemmelSayıBulma {
    public static void main(String...args){
        int n,total;
        Scanner scan= new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        n = scan.nextInt();
        total = 0;

        for(int i= 1; i<n; i++){
            if(n%i==0){
                total+=i;
            }
        }if(total==n){
            System.out.println(n +"  mükemmel sayıdır");
        }else{
            System.out.println(n +" mükemmel sayı değildir.");
        }

    }
}
