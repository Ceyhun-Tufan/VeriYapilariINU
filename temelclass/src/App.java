import ogrenci.ogrenci;

public class App {
    public static void main(String[] args) {
      
        orenci ogr = new orenci();
        System.out.println(ogr.id);
        // cikti verir -> 2235

        orenci ogr2 = new orenci(123,"Ahmet",2003); // overload ile parametre koyarak
        // degiskenleri kendimiz atayabiliriz 
        ogr2.bdate = 2000;
        System.out.println(ogr2.id);


        ogrenci ogr3 = new ogrenci();
        System.out.println(ogr3.getId());
        // cikti ogr3 id sini verir. 


    }
}
