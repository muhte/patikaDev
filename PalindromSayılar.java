package patikaDev;

public class PalindromSayılar {
    static boolean isPolindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber= temp%10;
            //System.out.println("sayının ilk değeri : "+ lastNumber);
            reverseNumber = (reverseNumber*10) + lastNumber;
            //System.out.println(" elde ettiğimiz sayı : " + reverseNumber);
            temp /=10;
           // System.out.println( "son sayı : "+ temp);
        }
        if(number==reverseNumber)
            return true ;
        else
            return false ;


    }
    public static void main(String... args){
        System.out.println(isPolindrom(4545));
    }
}
