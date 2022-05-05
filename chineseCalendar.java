package patikaDev;
import java.util.Scanner;

public class chineseCalendar {

    public static void main(String... args){
        int year;
        Scanner input= new Scanner(System.in);

        System.out.print("doğum yılınızı giriniz :");
        year =input.nextInt();

        if(year%12==0){
            System.out.print("çin takvimine göre burcunuz : maymun");
        }else if(year%12==1){
            System.out.print("çin takvimine göre burcunuz : horoz");
        }else if(year%12==2) {
            System.out.print("çin takvimine göre burcunuz : köpek");
        }else if(year%12==3) {
            System.out.print("çin takvimine göre burcunuz : domuz");
        }else if(year%12==4) {
            System.out.print("çin takvimine göre burcunuz : fare");
        }else if(year%12==5) {
            System.out.print("çin takvimine göre burcunuz : öküz");
        }else if(year%12==6) {
            System.out.print("çin takvimine göre burcunuz : kaplan ");
        }else if(year%12==7) {
            System.out.print("çin takvimine göre burcunuz : tavşan");
        }else if(year%12==8) {
            System.out.print("çin takvimine göre burcunuz : ejderha");
        }else if(year%12==9) {
            System.out.print("çin takvimine göre burcunuz : yılan");
        }else if(year%12==10) {
            System.out.print("çin takvimine göre burcunuz : at");
        }else if(year%12==11) {
            System.out.print("çin takvimine göre burcunuz : koyun");
        }

        }
    }

