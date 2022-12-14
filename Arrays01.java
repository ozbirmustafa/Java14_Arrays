package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Arrays lerin içine primitive data tipleri ve reference ler yerleştirilebilir.
    public static void main(String[] args) {

        String str [] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "suprised you";

        System.out.println(Arrays.toString(str));

        //String bir array oluşturunuz ve "Tom" ve "Tom"dan önceki tüm elemanları ekrana yazdırınız.

        String arr [] = {"Jane","Mark","Cristopher","Tom","Ali","Rojda"};

        for (String w: arr) {

            System.out.print(w + " ");
            if (w.equals("Tom")){
                break;
            }
        }
        System.out.println();
        //Tom ve jane hariç tüm elemanları yazdır.

        for (String w: arr) {
            if (w.equals("Tom") ||w.equals("Jane") ) {
                continue;
            }
            System.out.print(w + " ");

        }
        System.out.println();
            //Example 3 : Kullanıcı ile beraber bir Array oluşturunuz ve içine data ekleyiniz.
            //            (Bir öğretmenin sınıfındaki öğrencilerin isimlerini application a yüklemesini sağlayan kodu yazınız.)

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç Öğrenci İsmi Gireceksiniz");
        int numOfStd = scan.nextInt();
        String[] names = new  String[numOfStd];
        System.out.println("Girişi sonlandırmak için Q harfine basınız.");
        for (int i = 1; i<=numOfStd; i++){
            System.out.println("Lutfen " + i + ". öğrencin ilk ismini giriniz.");

            String stdNames = scan.next();



            if(stdNames.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdNames;
        }
        System.out.println(Arrays.toString(names));















    }
}
