// Java ile yapılan, fibonacci serisindeki sayıları yazan program.

package fibonacci;

import java.util.Scanner; // Kullanıcıdan giriş almak için sınıf gerekiyor. Bu sınıfımızı burada dahil ettik.


public class Fibonacci {


    public static void main(String[] args) {


         int deger1=0,deger2=1,deger3,i,kullanici_degeri;    // Tanımlanan değişkenlerimiz
         
         // Bu 3 satırda kullanıcının kaç adet  fibonacci sayısı istediğini sorup onun cevabını count değişkenine atadık.
         System.out.print("Kaç adet değer girileceğini yazınız.(2 veya daha büyük bir sayı) : ");   
        // İlk 2 karakteri kendimiz yazdırdığımızdan böyle bir açıklama yaptık.
         Scanner input = new Scanner(System.in);          
         kullanici_degeri=input.nextByte();        

         
         
         
           System.out.print(deger1+","+deger2);  // Burada en başta yer alan 0 ve 1 sayılarını yazdırdık.
         
         
            for(i=2;i<kullanici_degeri;++i)  // Bu döngüyle beraber ilk 2 sayıdan sonrasını
          {                                  // ve istenilen değer kadarını yazdırmaya devam ettik.
                deger3=deger1+deger2;    
                System.out.print(","+deger3);    
                deger1=deger2;    
                deger2=deger3;    
            }    
        
            System.out.println();
            System.out.print(+kullanici_degeri+" adet değer yazdırıldı.");
            // Kaç adet sayı yazıldığını da programın en sonunda yazdık.
        

    }
    
}
