public class AnaSinif {
    public static void main(String[] args) throws Exception {
        BagliListeYigin yigin  = new BagliListeYigin();

        System.out.println();
        System.out.println();


        yigin.Ekle(new Eleman("Ceyhun", "Tufan", 0, 2004));
        yigin.Ekle(new Eleman("deneme", "soyad", 0, 2004));

        yigin.listeYazdir();
        yigin.Sil();
        yigin.listeYazdir();
        yigin.Ekle(new Eleman("yıgınyeni", "soyad", 0, 2004));
        yigin.listeYazdir();

        System.out.println("----------------------- Kuyruk ");



        BagliListeKuyruk kuyruk = new BagliListeKuyruk();

        kuyruk.Ekle(new Eleman("Ceyhun", "Tufan", 0, 0));
        kuyruk.Ekle(new Eleman("Ali", "Emre", 0, 0));
        kuyruk.Ekle(new Eleman("Emre", "Deneme", 0, 0));

        kuyruk.listeYazdir();
        kuyruk.Sil();
        kuyruk.Sil();
        kuyruk.listeYazdir();
        kuyruk.Ekle(new Eleman("Abdullah", "123", 0, 0));
        kuyruk.listeYazdir();
    }
}
