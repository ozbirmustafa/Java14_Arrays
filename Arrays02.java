package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        //Ex 1: [0, 2, 3, 0, 12, 0]
        //      [2, 3, 12, 0, 0, 0]

        int original [] = {0, 2, 3, 0, 12, 0};
        int newOriginal [] = new int[original.length];
        int idx = 0;

        for (int i = 0 ; i<original.length; i++){

            if (original[i] !=0){
              newOriginal[idx] = original[i];
              idx++;
            }

        }System.out.println(Arrays.toString(newOriginal));

        //Ex 2: bir array in içinde herhangi bir elemanın olup olmadığını ve kaç kere tekrarlandığını kontrol eden ve gösteren kodu yazınız.
        //[2, 1, 2, -3, 2] ===> kullanıcı 2 yi sordu. 2 elemanı var ve 3 kere tekrarlandı.

        int arr[] = {2, 1, 2, -3, 2};
        int eleman = 2;
        int counter = 0; //"flag" bazi durumların olup olmadığını kontrol etmek için kullanılır.

        for (int w: arr) {
            if (w==eleman){
                counter++;
            }


        }
        if (counter>0){

            System.out.println("\"" + eleman +"\"" + " array'de " + counter + " defa var");
        }else System.out.println("\"" + eleman +"\"" +" array'de yok");


        //Size verilen cümledeki en uzun kelimeyi bulan kodu yazınız

        String sentence = "Java kolaydır calışana, ne kolay ki calışmayana.";
        sentence = sentence.replaceAll("\\p{Punct}","");
        String words [] = sentence.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(words[words.length-1]);

    }
}
