import java.util.Scanner;
public class hipotenusBulma {

    public static void main(String[] args){

        double a,b,c;
        Scanner inp =new Scanner(System.in);

        System.out.print("a kenarını giriniz : ");
        a = inp.nextDouble();

        System.out.print("b kenarını giriniz : ");
        b= inp.nextDouble();

        c =Math.sqrt ((a * a) + (b * b));
        System.out.print("hipotenüs " + c);

        }
}
