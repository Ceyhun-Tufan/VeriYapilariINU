
// ilk giren ilk cikar
// yani ekleme islemi listenin sonuna
// cikarma islemi listenin basindan yapilacak

public class BagliListeKuyruk {
    private Eleman bas;
    private Eleman son;
    private	int elemanSayisi;
    
    BagliListeKuyruk() {
        bas = null;
        son = null;
        elemanSayisi = 0;
    }
    
    void Ekle(Eleman yeni) { 
        if(bas==null) {
            bas=yeni;
        }
        else {
            son.sonraki=yeni;
        }
        son=yeni;
        elemanSayisi++;
    }
    
    void Sil() {
        if(bas==null) {
            System.out.println("Listede eleman kalmadı");
        }else{
            Eleman tmp;
            tmp = bas;
            bas = bas.sonraki;
            tmp.sonraki= null;
            elemanSayisi--;
        }
    }
    
    void listeYazdir() {
        Eleman temp = bas;

        while (temp != null) {
            System.out.println(temp.isim + " " + temp.soyisim + " " + temp.telno + " " + temp.dt);
            temp = temp.sonraki;
        }
        System.out.println("-----------------------------");

    }

    int getElemanSayisi() {
        return elemanSayisi;
    }
    
}