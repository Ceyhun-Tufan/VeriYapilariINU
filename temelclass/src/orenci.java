public class orenci {
    int id;
    String name;
    int bdate; 
    
    // constructor 
    orenci(){ // burada package ayni. public diye belirtmeye gerek yok
        id = 2235;
        name = "Ceyhun";
        bdate = 2004;

    }
    // overlaod 
    orenci(int id1, String name1, int bdate1){
        id = id1;
        name = name1;
        bdate = bdate1;
    }
}
