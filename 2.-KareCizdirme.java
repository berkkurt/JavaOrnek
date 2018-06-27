// Kullanıcıdan aldığı değerle kare çizdiren program.

package karecizdirme;

import java.util.Scanner; // Scanner sınıfı için gerekli.


public class KareCizdirme {


    public static void main(String[] args) {

	int girilen_sayi;
	
	System.out.print("Lütfen bir tam sayi giriniz : ");  // Kullanıcıdan değer 
        Scanner input = new Scanner(System.in);              // aldık. Örn: kullanıcı 5 değeri girdi.
	girilen_sayi = input.nextInt();                      // Program bize 5 satır ve 5 sütun yıldız yazdırır.
        
	for(int x = 0; x< girilen_sayi; x++)
	{
		for(int y = 0; y < girilen_sayi; y++)
		{
			System.out.print("*");       // Satırı yazdırdık.
		}
		
		System.out.println();           //println ile alt satıra geçip
                                               //sütunları yazdırdık.

        } 
        
    }

    
}
