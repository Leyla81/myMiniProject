package miniProject01.Project01;

import java.util.Scanner;

public class AllAppointment {

   /*
    Proje:Randevu olusturma uygulaması gelistiriniz.
    1-Ana menude kullanıcıya randevu alma veya goruntulemek iicn 2 secenek sunulur.
      -randevu alma
      -randevu goruntuleme

    2- Randevu alma / olusturma
       -Randevu icin uygun tarihler gosterilir
       -Randevu almak istenen tarihin secilmesi istenir
       -En yakın 7 gunluk takvim dolmussa daha sonra denenmesi istenir
       -Gecerli bir tarih secilmisse randevu olusturulur ve bu tarih listeden silinir

     3-Randevu goruntuleme
       -kullanıcıya randevu no sorulur
       -randevu listesinde girilen no ile eslesen randevu bilgileriyazdirilir

     4-Randevu iptal
       -Kullanıcıya randevu no sorulur.Randevu listesinden girilen no ile eslesen randevu listesinden silinir.

     5-Randevu:
     id:otomatik uretilsin
     isim:randevu tarihi

    */
   public static void main(String[] args) {
      int select ;
       Scanner input =new Scanner(System.in);

       do {
           System.out.println("Randevu sistemine hosgeldiniz");
           System.out.println("1.Randevu olustur");
           System.out.println("2.Randevu goruntuledme");
           System.out.println("3.Randevu iptali");
           System.out.println("0.cıkıs");
           System.out.println("Seciminiz");
           select=input.nextInt();

           switch (select){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 0:
                   System.out.println("iyi gunler" );
                   break;
               default:
                   System.out.println("hatalı giris");

           }






       }while(select!=0);

   }











}
