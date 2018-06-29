//Dışardan girilen genişlik ve yükseklik değerlerini göre, yıldız ile dörtgen yapmak.

package dortgenyildiz;

import java.util.Scanner; //kullanıcıdan girdi almak için kullanılan sınıf


public class DortgenYildiz {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);//Dışardan gireceğim değeri input değişkeninde tut
        int yukseklik, genislik;
        
        System.out.print("Kutunun yuksekligini giriniz: ");
        yukseklik = input.nextInt();//Dışardan gireceğim yüksekliği tam sayı olarak yukseklik değişkeninde tut.
        
        System.out.print("Kutunun genisligini giriniz: ");
        genislik = input.nextInt();//Dışardan gireceğim genişliği tam sayı olarak genislik değişkeninde tut

                for(int i=0; i<yukseklik; i++)
                {
                    for(int j=0; j<genislik; j++)
                    {
                        if(i==0 || i == yukseklik-1 || j==0 || j==genislik-1)
                            System.out.print("*"); 
                        else
                            System.out.print(" ");
                    }
                    
                System.out.println();
                    
                }
    } 
}
