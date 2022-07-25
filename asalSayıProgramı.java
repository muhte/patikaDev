package patikaDev;

public class asalSayıProgramı {
    public static void main(String... args) {


           int count = 0;
           for (int i = 2; i <= 100; i++) {
               count = 0;
               for (int a = 2; a <= i; a++) {
                    if (i % a == 0) {
                        count++;
                    }
                }
                if(count==1){
                   System.out.print(i + " ");
                }
           }

    }
}
