package ogrenci;

public class ogrenci {
    //farkli paket oldugu icin erisim saglanamiyor. o yuzden public yapiyoruz. ama bunun yerine daha sonra
    // getter setter metotlari gelecek
    
    int id; 
    String name;
    int bdate; 
    
    // constructor 
    public ogrenci(){ // farkli package daki constructora erisebilmek icin public yapmak lazim
        id = 2235;
        name = "Ceyhun";
        bdate = 2004;

    }

    public int getId(){ // int tipinde return etmek icin int olarak belirtiyoruz
        return this.id;
    }
}
