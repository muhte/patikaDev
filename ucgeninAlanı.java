import java.util.Scanner;
public class ucgeninAlanı {

    public static void main(String[] args){

        double a,b,c, alan ,çevre ,u ;
        Scanner inp =new Scanner(System.in);

        System.out.print("a kenarını giriniz : ");
        a = inp.nextDouble();

        System.out.print("b kenarını giriniz : ");
        b= inp.nextDouble();

        System.out.print("c kenarını giriniz : ");
        c= inp.nextDouble();


        u = (a+b+c)/2 ;
        çevre =2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin çevresi : " +  çevre);
        System.out.print("üçgenin alanı : " +  alan );



    }

}
