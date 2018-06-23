// Kullanıcıya Fahrenheit -> Celsius || Celsius -> fahrenheit
// hangi dönüşümü yapacağını soran ve dönüşümü hesaplayan program.

package sicaklikdonusum;

import java.util.Scanner;


public class SicaklikDonusum {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int secim;
        double derece,donusum;
        
        System.out.println("1-)Fahrenheit->Celsius "+"\n"+"2-)Celsius->Fahrenheit");
        System.out.println("Lütfen seçim yapınız : ");
        secim = input.nextInt();
      
        System.out.println("Değeri giriniz");
        derece = input.nextDouble();
      
            if(secim == 1)
            {
                donusum = ((derece-32)*5.0)/9.0;
            }
             else
            {
                donusum = (5.0/9.0)*derece+32;
            }
       
       System.out.println("Sonuc = " + donusum);

    }

}
