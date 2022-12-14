package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        //Mehmetten öncesini yazdır.

        String [] isimler = {"Ali","Veli","Ahmet","Mehmet","Mustafa"};

        for (String w:isimler) {

            if (w.equals("Mehmet")){
                break;
            }
            System.out.print(w + " ");
        }
        System.out.println();
        //Ali Veli hariç yazdır.
        System.out.println(Arrays.toString(isimler));

        for (String w:isimler ) {

            if (w.equals("Ali") || w.equals("Veli")){
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Array'inizin Limitini Giriniz");
        int a = scan.nextInt();
        System.out.println("Veri girişini durdurmak için Q tuşuna basınız");
        String [] names = new String[a];

        for (int i = 1; i <= names.length; i++) {

            System.out.println("Lütfen " + i + ". ismi giriniz");
            String isim = scan.next();
            names [i-1] = isim;

            if (isim.equalsIgnoreCase("Q")){
                break;
            }

        }
        System.out.println(Arrays.toString(names));


        //Verilen bir int arrayde 0 ları sona atınız.

        int [] sayilar = {5,9,0,8,0,3};
        Arrays.sort(sayilar);
        int [] newArr = new int[sayilar.length];










    }
}
