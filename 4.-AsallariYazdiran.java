// İstenilen sayıya kadar olan asal sayıları ekrana yazdırır.

package asallariyazdiran;

import java.util.Scanner;   // Scanner için gerekli

/* import java.util.*; yazarak da eklenir ancak * yapınca tüm kütüphaneler 
eklenir ve program yavaşlar. Bu yüzden sadece bize gerekli olanı ekliyoruz. */

public class AsallariYazdiran {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);             // Scanner tanımlanması
        System.out.println("Kaça kadar asal sayılar yazılacak ?");
        int sayi1 = scn.nextInt();                        // Alınan değer int ile tanımlanıp sayi1 değişkenine atandı.
        int sayi; 
        
            for(int i=2; i<=sayi1; i++){  // En küçük asal sayı 2'den başlayıp istenen değere kadar olan döngü oluşturuldu. 
                sayi=0; 
                for(int j=2; j<=i/2; j++){ 
                    if(i%j==0) sayi++; 
                } 
                if(sayi==0) System.out.println(+i); 
            } 
        
    } 
    
}
