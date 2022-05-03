package patikaDev;
import java.util.Scanner;
public class burcHesaplama {
    public static void main(String... args){
        int gün ,ay;
        String burc = "";
        Scanner input = new Scanner(System.in);

        System.out.println("### BURC HESAPLAMA ###");

        System.out.print("doğum ayınızı giriniz(sayı olarak) :");
        ay= input.nextInt();
        System.out.print("doğum gününüzü giriniz (sayı olarak): ");
        gün = input.nextInt();


        if(ay==1){
            if((gün >= 1) && (gün<= 31)){
                if(gün<22) {
                  burc= "oğlak burcu";
                }else {
                   burc="kova burcu";
                }
            }
        }
        else if(ay==2){
            if(gün>=1 && gün<=28){
                if(gün<20){
                    burc="kova burcu";
                }else {
                    burc="balık burc";
                }
            }
        }
        else if(ay==3){
            if(gün>=1 && gün<=31){
                if(gün<21){
                    burc="balık burcu";
                }else {
                    burc="koç burcu";
                }
            }
        }
        else if(ay==4){
            if(gün>=1 && gün<=30){
                if(gün<21){
                    burc="koç burcu";
                }else {
                    burc="boğa burcu";
                }
            }
        }
        else if(ay==5){
            if(gün>=1 && gün<=31){
                if (gün<22) {
                    burc= "boğa burcu";
                }else{
                    burc= "ikizler burcu";
                }
            }
        }
        else if(ay==6){
            if(gün>=1 && gün<=30){
                if (gün<23) {
                    burc= "ikizler burcu";
                }else{
                    burc= "yengeç burcu";
                }
            }
        }
        else if(ay==7){
            if(gün>=1 && gün<=31){
                if (gün<23) {
                    burc= "yengeç burcu";
                }else{
                    burc= "aslan burcu";
                }
            }
        }
        else if(ay==8){
            if(gün>=1 && gün<=30){
                if (gün<23) {
                    burc= "aslan burcu";
                }else{
                    burc= "basak burcu";
                }
            }
        }
        else if(ay==9){
            if(gün>=1 && gün<=31){
                if (gün<23) {
                    burc= "basak burcu";
                }else{
                    burc= "terazi burcu";
                }
            }
        }
        else if(ay==10){
            if(gün>=1 && gün<=30){
                if (gün<23) {
                    burc= "terazi burcu";
                }else{
                    burc= "akrep burcu";
                }
            }
        }
        else if(ay==11){
            if(gün>=1 && gün<=31){
                if (gün<22) {
                    burc= "akrep burcu";
                }else{
                    burc= "yay burcu";
                }
            }
        }
        else if(ay==12){
            if(gün>=1 && gün<=30){
                if (gün<22) {
                    burc= "yay burcu";
                }else{
                    burc= "kova burcu";
                }
            }
        }


        else {
            burc="geçersiz değer girdiniz  ";
        }

        System.out.print("burcunuz : " + burc);
    }
}
