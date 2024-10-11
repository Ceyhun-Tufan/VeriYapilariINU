package YeniPkg;

import java.util.Scanner;

// hocam benim prog2 sınavında da kopya ihtimalinden kontrol etmiştiniz valla kendim yazdım yine

public class AnaSinif {

    String isim;
    int yas;
    boolean cinsiyet; // erkekse T kadinsa F olarak
    int sinif;

    AnaSinif() {
        isim = "Ceyhun";
        yas = 20;
        cinsiyet = true;
        sinif = 2;
    }

    // overload 1
    AnaSinif(String yeniisim, int yeniyas) {
        isim = yeniisim;
        yas = yeniyas;
        cinsiyet = true;
        sinif = 2;
    }

    // overload 2
    AnaSinif(boolean yenicinsiyet, int yenisinif) {
        isim = "Ceyhun";
        yas = 20;
        cinsiyet = yenicinsiyet;
        sinif = yenisinif;
    }

    public static void main(String args[]) {
        // burasi ilk constructor
        AnaSinif eleman = new AnaSinif();
        System.out.println("\n Constructor");
        System.out.println(eleman.yas);

        AnaSinif eleman2 = new AnaSinif("Ahmet", 20);
        System.out.println("\n Overloaded Constructor 1");
        System.out.println(eleman2.isim);

        AnaSinif eleman3 = new AnaSinif(false, 2);
        System.out.println("\n Overloaded Constructor 2");
        System.out.println(eleman3.sinif);

        System.out.println("\n Int yazdiran fonksiyon sonucu");
        sayiver();

        IkinciSinif iksnesnesi = new IkinciSinif();
        System.out.println(iksnesnesi.getUretici());
        iksnesnesi.setUretici("Iphone");
        System.out.println(iksnesnesi.getUretici());

        ikinciSinifDegerYazdir(iksnesnesi);

        // nesneli 10lu dizi sonra yapilandirici

        IkinciSinif[] iksDizesi = new IkinciSinif[3];

        for (int i = 0; i < iksDizesi.length; i++) {
            iksDizesi[i] = new IkinciSinif();
        }

        Scanner alici = new Scanner(System.in); // scanner daha sonra kapatilmali

        for (int i = 0; i < iksDizesi.length; i++) {
            System.out.println("Nesne icin girilecek 3 degeri sirayla yaziniz: 1- uretici 2- urunno 3- kamera mp");
            iksDizesi[i].setUretici(alici.nextLine());
            iksDizesi[i].setUrunno(alici.nextInt());
            iksDizesi[i].setKameramp(alici.nextInt());
            alici.nextLine();
        }

        alici.close();

        for (int i = 0; i < iksDizesi.length; i++) {
            System.out.println("\n NESNE 1 :");
            ikinciSinifDegerYazdir(iksDizesi[i]);
        }


        ikinciSinifaDegerAta("Apul", 0, 0);
        
    }

    public static void sayiver() {
        System.out.println(2);
    }

    public static void ikinciSinifDegerYazdir(IkinciSinif iks) {
        System.out.println(iks.getUretici());
        System.out.println(iks.getUrunno());
        System.out.println(iks.getKameramp());
    }

    public static IkinciSinif ikinciSinifaDegerAta(String deger1, int deger2, int deger3){

        IkinciSinif releman = new IkinciSinif();
        releman.setUretici(deger1);
        releman.setKameramp(deger2);
        releman.setUrunno(deger2);

        return releman;

    }

}
