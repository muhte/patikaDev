package patikaDev;
import java.util.Scanner;
public class Taksimetre {

    public static void main(String[] args) {
        double km , ücret =10;    // taksi metre açılış ücreti 10 tl olduğu için

        Scanner scan = new Scanner(System.in);
        System.out.print("kaç kilometre yol gideceksiniz ?");
        km =scan.nextDouble();

        ücret += km*2.20;
        ücret = (ücret <20) ? 20: ücret;

        System.out.print("toplam ödenecek ücret : " + ücret);

    }
}
