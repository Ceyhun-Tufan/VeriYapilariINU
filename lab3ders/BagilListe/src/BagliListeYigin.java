
// son giren ilk cikar
// yani ekleme islemi listenin basina olacak
// cikarma islemi listenin basindan


public class BagliListeYigin {
		private Eleman bas;
		private	int elemanSayisi;
		
		BagliListeYigin() {
	        bas = null;
	        elemanSayisi = 0;
	    }
		
		void Ekle(Eleman yeni) {
			if(bas==null) {
				bas=yeni;
			}
			else {
				yeni.sonraki=bas;
			}
			bas = yeni;
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